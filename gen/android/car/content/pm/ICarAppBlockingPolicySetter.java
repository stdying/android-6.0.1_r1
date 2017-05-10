/*___Generated_by_IDEA___*/

/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: /home/useradmin/aosp7.0.0r3/packages/services/Car/car-lib/src/android/car/content/pm/ICarAppBlockingPolicySetter.aidl
 */
package android.car.content.pm;
/**
 * Passed to CarAppBlockingPolicyService to allow setting policy. This also works as a unique
   token per each Service. Caller still needs permission to set policy.
 * @hide
 */
public interface ICarAppBlockingPolicySetter extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements android.car.content.pm.ICarAppBlockingPolicySetter
{
private static final java.lang.String DESCRIPTOR = "android.car.content.pm.ICarAppBlockingPolicySetter";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an android.car.content.pm.ICarAppBlockingPolicySetter interface,
 * generating a proxy if needed.
 */
public static android.car.content.pm.ICarAppBlockingPolicySetter asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof android.car.content.pm.ICarAppBlockingPolicySetter))) {
return ((android.car.content.pm.ICarAppBlockingPolicySetter)iin);
}
return new android.car.content.pm.ICarAppBlockingPolicySetter.Stub.Proxy(obj);
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
case TRANSACTION_setAppBlockingPolicy:
{
data.enforceInterface(DESCRIPTOR);
android.car.content.pm.CarAppBlockingPolicy _arg0;
if ((0!=data.readInt())) {
_arg0 = android.car.content.pm.CarAppBlockingPolicy.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
this.setAppBlockingPolicy(_arg0);
reply.writeNoException();
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements android.car.content.pm.ICarAppBlockingPolicySetter
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
@Override public void setAppBlockingPolicy(android.car.content.pm.CarAppBlockingPolicy policy) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((policy!=null)) {
_data.writeInt(1);
policy.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_setAppBlockingPolicy, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
}
static final int TRANSACTION_setAppBlockingPolicy = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
}
public void setAppBlockingPolicy(android.car.content.pm.CarAppBlockingPolicy policy) throws android.os.RemoteException;
}
