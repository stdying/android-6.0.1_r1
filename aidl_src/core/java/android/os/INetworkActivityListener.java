/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: frameworks/base/core/java/android/os/INetworkActivityListener.aidl
 */
package android.os;
/**
 * @hide
 */
public interface INetworkActivityListener extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements android.os.INetworkActivityListener
{
private static final java.lang.String DESCRIPTOR = "android.os.INetworkActivityListener";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an android.os.INetworkActivityListener interface,
 * generating a proxy if needed.
 */
public static android.os.INetworkActivityListener asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof android.os.INetworkActivityListener))) {
return ((android.os.INetworkActivityListener)iin);
}
return new android.os.INetworkActivityListener.Stub.Proxy(obj);
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
case TRANSACTION_onNetworkActive:
{
data.enforceInterface(DESCRIPTOR);
this.onNetworkActive();
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements android.os.INetworkActivityListener
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
@Override public void onNetworkActive() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_onNetworkActive, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
}
static final int TRANSACTION_onNetworkActive = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
}
public void onNetworkActive() throws android.os.RemoteException;
}
