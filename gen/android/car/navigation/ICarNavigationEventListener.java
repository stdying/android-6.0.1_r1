/*___Generated_by_IDEA___*/

/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: /home/useradmin/aosp7.0.0r3/packages/services/Car/car-lib/src/android/car/navigation/ICarNavigationEventListener.aidl
 */
package android.car.navigation;
/**
 * Binder callback for CarNavigationEventListener.
 * @hide
 */
public interface ICarNavigationEventListener extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements android.car.navigation.ICarNavigationEventListener
{
private static final java.lang.String DESCRIPTOR = "android.car.navigation.ICarNavigationEventListener";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an android.car.navigation.ICarNavigationEventListener interface,
 * generating a proxy if needed.
 */
public static android.car.navigation.ICarNavigationEventListener asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof android.car.navigation.ICarNavigationEventListener))) {
return ((android.car.navigation.ICarNavigationEventListener)iin);
}
return new android.car.navigation.ICarNavigationEventListener.Stub.Proxy(obj);
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
case TRANSACTION_onInstrumentClusterStart:
{
data.enforceInterface(DESCRIPTOR);
android.car.navigation.CarNavigationInstrumentCluster _arg0;
if ((0!=data.readInt())) {
_arg0 = android.car.navigation.CarNavigationInstrumentCluster.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
this.onInstrumentClusterStart(_arg0);
return true;
}
case TRANSACTION_onInstrumentClusterStop:
{
data.enforceInterface(DESCRIPTOR);
this.onInstrumentClusterStop();
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements android.car.navigation.ICarNavigationEventListener
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
@Override public void onInstrumentClusterStart(android.car.navigation.CarNavigationInstrumentCluster instrumentCluster) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((instrumentCluster!=null)) {
_data.writeInt(1);
instrumentCluster.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_onInstrumentClusterStart, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void onInstrumentClusterStop() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_onInstrumentClusterStop, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
}
static final int TRANSACTION_onInstrumentClusterStart = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_onInstrumentClusterStop = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
}
public void onInstrumentClusterStart(android.car.navigation.CarNavigationInstrumentCluster instrumentCluster) throws android.os.RemoteException;
public void onInstrumentClusterStop() throws android.os.RemoteException;
}
