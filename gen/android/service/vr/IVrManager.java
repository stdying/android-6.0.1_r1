/*___Generated_by_IDEA___*/

/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: /home/useradmin/aosp7.0.0r3/frameworks/base/core/java/android/service/vr/IVrManager.aidl
 */
package android.service.vr;
/** @hide */
public interface IVrManager extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements android.service.vr.IVrManager
{
private static final java.lang.String DESCRIPTOR = "android.service.vr.IVrManager";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an android.service.vr.IVrManager interface,
 * generating a proxy if needed.
 */
public static android.service.vr.IVrManager asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof android.service.vr.IVrManager))) {
return ((android.service.vr.IVrManager)iin);
}
return new android.service.vr.IVrManager.Stub.Proxy(obj);
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
case TRANSACTION_registerListener:
{
data.enforceInterface(DESCRIPTOR);
android.service.vr.IVrStateCallbacks _arg0;
_arg0 = android.service.vr.IVrStateCallbacks.Stub.asInterface(data.readStrongBinder());
this.registerListener(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_unregisterListener:
{
data.enforceInterface(DESCRIPTOR);
android.service.vr.IVrStateCallbacks _arg0;
_arg0 = android.service.vr.IVrStateCallbacks.Stub.asInterface(data.readStrongBinder());
this.unregisterListener(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_getVrModeState:
{
data.enforceInterface(DESCRIPTOR);
boolean _result = this.getVrModeState();
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements android.service.vr.IVrManager
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
/**
     * Add a callback to be notified when VR mode state changes.
     *
     * @param cb the callback instance to add.
     */
@Override public void registerListener(android.service.vr.IVrStateCallbacks cb) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((cb!=null))?(cb.asBinder()):(null)));
mRemote.transact(Stub.TRANSACTION_registerListener, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/**
     * Remove the callack from the current set of registered callbacks.
     *
     * @param cb the callback to remove.
     */
@Override public void unregisterListener(android.service.vr.IVrStateCallbacks cb) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((cb!=null))?(cb.asBinder()):(null)));
mRemote.transact(Stub.TRANSACTION_unregisterListener, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/**
     * Return current VR mode state.
     *
     * @return {@code true} if VR mode is enabled.
     */
@Override public boolean getVrModeState() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getVrModeState, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
}
static final int TRANSACTION_registerListener = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_unregisterListener = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_getVrModeState = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
}
/**
     * Add a callback to be notified when VR mode state changes.
     *
     * @param cb the callback instance to add.
     */
public void registerListener(android.service.vr.IVrStateCallbacks cb) throws android.os.RemoteException;
/**
     * Remove the callack from the current set of registered callbacks.
     *
     * @param cb the callback to remove.
     */
public void unregisterListener(android.service.vr.IVrStateCallbacks cb) throws android.os.RemoteException;
/**
     * Return current VR mode state.
     *
     * @return {@code true} if VR mode is enabled.
     */
public boolean getVrModeState() throws android.os.RemoteException;
}
