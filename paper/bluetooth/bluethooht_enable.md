
### 位置
package:com.android.settings.bluetooth

BluetoothSettings.java
蓝牙开关封装在BluetoothEnabler.java中
 --> LocalBluetoothAdapter.setBluetoothEnabled

 ```java
 //使能蓝牙
public void setBluetoothEnabled(boolean enabled) {
        boolean success = enabled
                ? mAdapter.enable()
                : mAdapter.disable();

        //设置蓝牙状态
        if (success) {
            setBluetoothStateInt(enabled
                ? BluetoothAdapter.STATE_TURNING_ON
                : BluetoothAdapter.STATE_TURNING_OFF);
        } else {
            if (Utils.V) {
                Log.v(TAG, "setBluetoothEnabled call, manager didn't return " +
                        "success for enabled: " + enabled);
            }

            //同步蓝牙状态
            syncBluetoothState();
        }
    }
 ```

 mAdapter.enable()即是BluetoothAdapter.enable()，会通过aidl调用

```java
    public boolean enable() {
        int state = STATE_OFF;
        if (isEnabled() == true){
            if (DBG) Log.d(TAG, "enable(): BT is already enabled..!");
            return true;
        }
        //Use service interface to get the exact state
        if (mService != null) {
            try {
               state = mService.getState();
            } catch (RemoteException e) {Log.e(TAG, "", e);}
        }

        if (state == BluetoothAdapter.STATE_BLE_ON) {
                Log.e(TAG, "BT is in BLE_ON State");
                notifyUserAction(true);
                return true;
        }
        try {
            return mManagerService.enable();
        } catch (RemoteException e) {Log.e(TAG, "", e);}
        return false;
    }
```
mManagerService 为IBluetoothManager，实现BluetoothManagerService.java位于com.android.server包下

```java
    public boolean enable() {
        //当前用户和系统用户
        if ((Binder.getCallingUid() != Process.SYSTEM_UID) &&
            (!checkIfCallerIsForegroundUser())) {
            Log.w(TAG,"enable(): not allowed for non-active and non system user");
            return false;
        }

        mContext.enforceCallingOrSelfPermission(BLUETOOTH_ADMIN_PERM,
                                                "Need BLUETOOTH ADMIN permission");
        if (DBG) {
            Log.d(TAG,"enable():  mBluetooth =" + mBluetooth +
                    " mBinding = " + mBinding);
        }

        synchronized(mReceiver) {
            mQuietEnableExternal = false;
            mEnableExternal = true;
            // waive WRITE_SECURE_SETTINGS permission check
            sendEnableMsg(false);
        }
        if (DBG) Log.d(TAG, "enable returning");
        return true;
    }
```
通过mHandler发送MESSAGE_ENABLE信息，在mHandler中调用handleEnable()方法

```java
    private void handleEnable(boolean quietMode) {
        mQuietEnable = quietMode;

        synchronized(mConnection) {
            //检查服务是否已经启动并且已经绑定
            if ((mBluetooth == null) && (!mBinding)) {
                //Start bind timeout and bind
                Message timeoutMsg=mHandler.obtainMessage(MESSAGE_TIMEOUT_BIND);
                mHandler.sendMessageDelayed(timeoutMsg,TIMEOUT_BIND_MS);
                mConnection.setGetNameAddressOnly(false);
                Intent i = new Intent(IBluetooth.class.getName());
                //绑定服务，UserHandle为多用户考虑
                if (!doBind(i, mConnection,Context.BIND_AUTO_CREATE | Context.BIND_IMPORTANT,
                        UserHandle.CURRENT)) {
                    mHandler.removeMessages(MESSAGE_TIMEOUT_BIND);
                } else {
                    mBinding = true;
                }
            } else if (mBluetooth != null) {
                if (mConnection.isGetNameAddressOnly()) {
                    // if GetNameAddressOnly is set, we can clear this flag,
                    // so the service won't be unbind
                    // after name and address are saved
                    mConnection.setGetNameAddressOnly(false);
                    //Register callback object
                    try {
                        mBluetooth.registerCallback(mBluetoothCallback);
                    } catch (RemoteException re) {
                        Log.e(TAG, "Unable to register BluetoothCallback",re);
                    }
                    //Inform BluetoothAdapter instances that service is up
                    sendBluetoothServiceUpCallback();
                }

                //Enable bluetooth
                try {
                    if (!mQuietEnable) {
                        //使能蓝牙
                        if(!mBluetooth.enable()) {
                            Log.e(TAG,"IBluetooth.enable() returned false");
                        }
                    }
                    else {
                        if(!mBluetooth.enableNoAutoConnect()) {
                            Log.e(TAG,"IBluetooth.enableNoAutoConnect() returned false");
                        }
                    }
                } catch (RemoteException e) {
                    Log.e(TAG,"Unable to call enable()",e);
                }
            }
        }
    }
```
最后会调用AdapterService.java的enable(boolean quietMode)方法

```java
     public synchronized boolean enable(boolean quietMode) {
         enforceCallingOrSelfPermission(BLUETOOTH_ADMIN_PERM, "Need BLUETOOTH ADMIN permission");

         debugLog("enable() - Enable called with quiet mode status =  " + mQuietmode);
         mQuietmode = quietMode;
         Message m = mAdapterStateMachine.obtainMessage(AdapterState.BLE_TURN_ON);
         mAdapterStateMachine.sendMessage(m);
         return true;
     }
```
进入AdapterState.java状态机在enable(boolean quitMode)中发送消息AdapterState.BLE_TURN_ON；
OffState在processMessage中将状态转换给mPendingCommandState，并发送延迟消息。
在BleOnProcessStart()方法中，会批量启动profile service；比如HeadsetService，HeadsetService继承
ProfileService，在onStartCommand()方法中调用doStart(Intent intent),接着调用notifyProfileServiceStateChanged(BluetoothAdapter.STATE_ON)，通知服务状态改变；
调用mAdapterService.onProfileServiceStateChanged(getClass().getName(), state);在AdapterService的handler中处理MESSAGE_PROFILE_SERVICE_STATE_CHANGED状态，
向状态机发送AdapterState.BLE_STARTED，在PendingCommandState