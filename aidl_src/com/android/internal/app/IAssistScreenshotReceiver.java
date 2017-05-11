/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: frameworks/base/core/java/com/android/internal/app/IAssistScreenshotReceiver.aidl
 */
package com.android.internal.app;
/** @hide */
public interface IAssistScreenshotReceiver extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements com.android.internal.app.IAssistScreenshotReceiver
{
private static final java.lang.String DESCRIPTOR = "com.android.internal.app.IAssistScreenshotReceiver";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an com.android.internal.app.IAssistScreenshotReceiver interface,
 * generating a proxy if needed.
 */
public static com.android.internal.app.IAssistScreenshotReceiver asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof com.android.internal.app.IAssistScreenshotReceiver))) {
return ((com.android.internal.app.IAssistScreenshotReceiver)iin);
}
return new com.android.internal.app.IAssistScreenshotReceiver.Stub.Proxy(obj);
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
case TRANSACTION_send:
{
data.enforceInterface(DESCRIPTOR);
android.graphics.Bitmap _arg0;
if ((0!=data.readInt())) {
_arg0 = android.graphics.Bitmap.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
this.send(_arg0);
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements com.android.internal.app.IAssistScreenshotReceiver
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
@Override public void send(android.graphics.Bitmap screenshot) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((screenshot!=null)) {
_data.writeInt(1);
screenshot.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_send, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
}
static final int TRANSACTION_send = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
}
public void send(android.graphics.Bitmap screenshot) throws android.os.RemoteException;
}
