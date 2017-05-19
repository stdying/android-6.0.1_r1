/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: frameworks/base/core/java/android/hardware/fingerprint/IFingerprintServiceLockoutResetCallback.aidl
 */
package android.hardware.fingerprint;
/**
 * Callback when lockout period expired and clients are allowed to authenticate again.
 * @hide
 */
public interface IFingerprintServiceLockoutResetCallback extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements android.hardware.fingerprint.IFingerprintServiceLockoutResetCallback
{
private static final java.lang.String DESCRIPTOR = "android.hardware.fingerprint.IFingerprintServiceLockoutResetCallback";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an android.hardware.fingerprint.IFingerprintServiceLockoutResetCallback interface,
 * generating a proxy if needed.
 */
public static android.hardware.fingerprint.IFingerprintServiceLockoutResetCallback asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof android.hardware.fingerprint.IFingerprintServiceLockoutResetCallback))) {
return ((android.hardware.fingerprint.IFingerprintServiceLockoutResetCallback)iin);
}
return new android.hardware.fingerprint.IFingerprintServiceLockoutResetCallback.Stub.Proxy(obj);
}
@Override public android.os.IBinder asBinder()
{
return this;
}
@Override public boolean onTransact(int code, android.os.Parcel data, android.os.Parcel reply, int flags) throws android.os.RemoteException
{
switch (code)
{
case INTERFACE_TRANSACTION:
{
reply.writeString(DESCRIPTOR);
return true;
}
case TRANSACTION_onLockoutReset:
{
data.enforceInterface(DESCRIPTOR);
long _arg0;
_arg0 = data.readLong();
this.onLockoutReset(_arg0);
reply.writeNoException();
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements android.hardware.fingerprint.IFingerprintServiceLockoutResetCallback
{
private android.os.IBinder mRemote;
Proxy(android.os.IBinder remote)
{
mRemote = remote;
}
@Override public android.os.IBinder asBinder()
{
return mRemote;
}
public java.lang.String getInterfaceDescriptor()
{
return DESCRIPTOR;
}
/** Method is synchronous so wakelock is held when this is called from a WAKEUP alarm. */
@Override public void onLockoutReset(long deviceId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeLong(deviceId);
mRemote.transact(Stub.TRANSACTION_onLockoutReset, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
}
static final int TRANSACTION_onLockoutReset = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
}
/** Method is synchronous so wakelock is held when this is called from a WAKEUP alarm. */
public void onLockoutReset(long deviceId) throws android.os.RemoteException;
}
