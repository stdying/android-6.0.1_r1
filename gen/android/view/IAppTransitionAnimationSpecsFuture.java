/*___Generated_by_IDEA___*/

/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: /home/useradmin/aosp7.0.0r3/frameworks/base/core/java/android/view/IAppTransitionAnimationSpecsFuture.aidl
 */
package android.view;
/**
 * A cross-process future to fetch the specifications for app transitions.
 *
 * {@hide}
 */
public interface IAppTransitionAnimationSpecsFuture extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements android.view.IAppTransitionAnimationSpecsFuture
{
private static final java.lang.String DESCRIPTOR = "android.view.IAppTransitionAnimationSpecsFuture";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an android.view.IAppTransitionAnimationSpecsFuture interface,
 * generating a proxy if needed.
 */
public static android.view.IAppTransitionAnimationSpecsFuture asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof android.view.IAppTransitionAnimationSpecsFuture))) {
return ((android.view.IAppTransitionAnimationSpecsFuture)iin);
}
return new android.view.IAppTransitionAnimationSpecsFuture.Stub.Proxy(obj);
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
case TRANSACTION_get:
{
data.enforceInterface(DESCRIPTOR);
android.view.AppTransitionAnimationSpec[] _result = this.get();
reply.writeNoException();
reply.writeTypedArray(_result, android.os.Parcelable.PARCELABLE_WRITE_RETURN_VALUE);
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements android.view.IAppTransitionAnimationSpecsFuture
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
@Override public android.view.AppTransitionAnimationSpec[] get() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
android.view.AppTransitionAnimationSpec[] _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_get, _data, _reply, 0);
_reply.readException();
_result = _reply.createTypedArray(android.view.AppTransitionAnimationSpec.CREATOR);
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
}
static final int TRANSACTION_get = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
}
public android.view.AppTransitionAnimationSpec[] get() throws android.os.RemoteException;
}
