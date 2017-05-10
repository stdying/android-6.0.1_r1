/*___Generated_by_IDEA___*/

/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: /home/useradmin/aosp7.0.0r3/frameworks/base/core/java/com/android/internal/app/IEphemeralResolver.aidl
 */
package com.android.internal.app;
public interface IEphemeralResolver extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements com.android.internal.app.IEphemeralResolver
{
private static final java.lang.String DESCRIPTOR = "com.android.internal.app.IEphemeralResolver";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an com.android.internal.app.IEphemeralResolver interface,
 * generating a proxy if needed.
 */
public static com.android.internal.app.IEphemeralResolver asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof com.android.internal.app.IEphemeralResolver))) {
return ((com.android.internal.app.IEphemeralResolver)iin);
}
return new com.android.internal.app.IEphemeralResolver.Stub.Proxy(obj);
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
case TRANSACTION_getEphemeralResolveInfoList:
{
data.enforceInterface(DESCRIPTOR);
android.os.IRemoteCallback _arg0;
_arg0 = android.os.IRemoteCallback.Stub.asInterface(data.readStrongBinder());
int _arg1;
_arg1 = data.readInt();
int _arg2;
_arg2 = data.readInt();
this.getEphemeralResolveInfoList(_arg0, _arg1, _arg2);
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements com.android.internal.app.IEphemeralResolver
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
@Override public void getEphemeralResolveInfoList(android.os.IRemoteCallback callback, int digestPrefix, int sequence) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((callback!=null))?(callback.asBinder()):(null)));
_data.writeInt(digestPrefix);
_data.writeInt(sequence);
mRemote.transact(Stub.TRANSACTION_getEphemeralResolveInfoList, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
}
static final int TRANSACTION_getEphemeralResolveInfoList = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
}
public void getEphemeralResolveInfoList(android.os.IRemoteCallback callback, int digestPrefix, int sequence) throws android.os.RemoteException;
}
