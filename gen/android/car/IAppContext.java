/*___Generated_by_IDEA___*/

/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: /home/useradmin/aosp7.0.0r3/packages/services/Car/car-lib/src/android/car/IAppContext.aidl
 */
package android.car;
/** @hide */
public interface IAppContext extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements android.car.IAppContext
{
private static final java.lang.String DESCRIPTOR = "android.car.IAppContext";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an android.car.IAppContext interface,
 * generating a proxy if needed.
 */
public static android.car.IAppContext asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof android.car.IAppContext))) {
return ((android.car.IAppContext)iin);
}
return new android.car.IAppContext.Stub.Proxy(obj);
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
case TRANSACTION_registerContextListener:
{
data.enforceInterface(DESCRIPTOR);
android.car.IAppContextListener _arg0;
_arg0 = android.car.IAppContextListener.Stub.asInterface(data.readStrongBinder());
int _arg1;
_arg1 = data.readInt();
this.registerContextListener(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_unregisterContextListener:
{
data.enforceInterface(DESCRIPTOR);
android.car.IAppContextListener _arg0;
_arg0 = android.car.IAppContextListener.Stub.asInterface(data.readStrongBinder());
this.unregisterContextListener(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_getActiveAppContexts:
{
data.enforceInterface(DESCRIPTOR);
int _result = this.getActiveAppContexts();
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_isOwningContext:
{
data.enforceInterface(DESCRIPTOR);
android.car.IAppContextListener _arg0;
_arg0 = android.car.IAppContextListener.Stub.asInterface(data.readStrongBinder());
int _arg1;
_arg1 = data.readInt();
boolean _result = this.isOwningContext(_arg0, _arg1);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_setActiveContexts:
{
data.enforceInterface(DESCRIPTOR);
android.car.IAppContextListener _arg0;
_arg0 = android.car.IAppContextListener.Stub.asInterface(data.readStrongBinder());
int _arg1;
_arg1 = data.readInt();
this.setActiveContexts(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_resetActiveContexts:
{
data.enforceInterface(DESCRIPTOR);
android.car.IAppContextListener _arg0;
_arg0 = android.car.IAppContextListener.Stub.asInterface(data.readStrongBinder());
int _arg1;
_arg1 = data.readInt();
this.resetActiveContexts(_arg0, _arg1);
reply.writeNoException();
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements android.car.IAppContext
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
@Override public void registerContextListener(android.car.IAppContextListener listener, int filter) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((listener!=null))?(listener.asBinder()):(null)));
_data.writeInt(filter);
mRemote.transact(Stub.TRANSACTION_registerContextListener, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void unregisterContextListener(android.car.IAppContextListener listener) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((listener!=null))?(listener.asBinder()):(null)));
mRemote.transact(Stub.TRANSACTION_unregisterContextListener, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public int getActiveAppContexts() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getActiveAppContexts, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/** listener used as a token */
@Override public boolean isOwningContext(android.car.IAppContextListener listener, int context) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((listener!=null))?(listener.asBinder()):(null)));
_data.writeInt(context);
mRemote.transact(Stub.TRANSACTION_isOwningContext, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/** listener used as a token */
@Override public void setActiveContexts(android.car.IAppContextListener listener, int contexts) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((listener!=null))?(listener.asBinder()):(null)));
_data.writeInt(contexts);
mRemote.transact(Stub.TRANSACTION_setActiveContexts, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/** listener used as a token */
@Override public void resetActiveContexts(android.car.IAppContextListener listener, int contexts) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((listener!=null))?(listener.asBinder()):(null)));
_data.writeInt(contexts);
mRemote.transact(Stub.TRANSACTION_resetActiveContexts, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
}
static final int TRANSACTION_registerContextListener = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_unregisterContextListener = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_getActiveAppContexts = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
static final int TRANSACTION_isOwningContext = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
static final int TRANSACTION_setActiveContexts = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
static final int TRANSACTION_resetActiveContexts = (android.os.IBinder.FIRST_CALL_TRANSACTION + 5);
}
public void registerContextListener(android.car.IAppContextListener listener, int filter) throws android.os.RemoteException;
public void unregisterContextListener(android.car.IAppContextListener listener) throws android.os.RemoteException;
public int getActiveAppContexts() throws android.os.RemoteException;
/** listener used as a token */
public boolean isOwningContext(android.car.IAppContextListener listener, int context) throws android.os.RemoteException;
/** listener used as a token */
public void setActiveContexts(android.car.IAppContextListener listener, int contexts) throws android.os.RemoteException;
/** listener used as a token */
public void resetActiveContexts(android.car.IAppContextListener listener, int contexts) throws android.os.RemoteException;
}
