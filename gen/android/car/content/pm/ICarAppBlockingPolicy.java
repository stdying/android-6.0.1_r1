/*___Generated_by_IDEA___*/

/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: /home/useradmin/aosp7.0.0r3/packages/services/Car/car-lib/src/android/car/content/pm/ICarAppBlockingPolicy.aidl
 */
package android.car.content.pm;
/**
 * Implemented by CarAppBlockingPolicyService
 * @hide
 */
public interface ICarAppBlockingPolicy extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements android.car.content.pm.ICarAppBlockingPolicy
{
private static final java.lang.String DESCRIPTOR = "android.car.content.pm.ICarAppBlockingPolicy";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an android.car.content.pm.ICarAppBlockingPolicy interface,
 * generating a proxy if needed.
 */
public static android.car.content.pm.ICarAppBlockingPolicy asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof android.car.content.pm.ICarAppBlockingPolicy))) {
return ((android.car.content.pm.ICarAppBlockingPolicy)iin);
}
return new android.car.content.pm.ICarAppBlockingPolicy.Stub.Proxy(obj);
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
case TRANSACTION_setAppBlockingPolicySetter:
{
data.enforceInterface(DESCRIPTOR);
android.car.content.pm.ICarAppBlockingPolicySetter _arg0;
_arg0 = android.car.content.pm.ICarAppBlockingPolicySetter.Stub.asInterface(data.readStrongBinder());
this.setAppBlockingPolicySetter(_arg0);
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements android.car.content.pm.ICarAppBlockingPolicy
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
@Override public void setAppBlockingPolicySetter(android.car.content.pm.ICarAppBlockingPolicySetter setter) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((setter!=null))?(setter.asBinder()):(null)));
mRemote.transact(Stub.TRANSACTION_setAppBlockingPolicySetter, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
}
static final int TRANSACTION_setAppBlockingPolicySetter = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
}
public void setAppBlockingPolicySetter(android.car.content.pm.ICarAppBlockingPolicySetter setter) throws android.os.RemoteException;
}
