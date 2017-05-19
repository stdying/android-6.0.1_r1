/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: frameworks/base/core/java/android/hardware/fingerprint/IFingerprintDaemonCallback.aidl
 */
package android.hardware.fingerprint;
/**
 * Communication channel from the fingerprintd back to FingerprintService.
 * @hide
 */
public interface IFingerprintDaemonCallback extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements android.hardware.fingerprint.IFingerprintDaemonCallback
{
private static final java.lang.String DESCRIPTOR = "android.hardware.fingerprint.IFingerprintDaemonCallback";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an android.hardware.fingerprint.IFingerprintDaemonCallback interface,
 * generating a proxy if needed.
 */
public static android.hardware.fingerprint.IFingerprintDaemonCallback asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof android.hardware.fingerprint.IFingerprintDaemonCallback))) {
return ((android.hardware.fingerprint.IFingerprintDaemonCallback)iin);
}
return new android.hardware.fingerprint.IFingerprintDaemonCallback.Stub.Proxy(obj);
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
case TRANSACTION_onEnrollResult:
{
data.enforceInterface(DESCRIPTOR);
long _arg0;
_arg0 = data.readLong();
int _arg1;
_arg1 = data.readInt();
int _arg2;
_arg2 = data.readInt();
int _arg3;
_arg3 = data.readInt();
this.onEnrollResult(_arg0, _arg1, _arg2, _arg3);
reply.writeNoException();
return true;
}
case TRANSACTION_onAcquired:
{
data.enforceInterface(DESCRIPTOR);
long _arg0;
_arg0 = data.readLong();
int _arg1;
_arg1 = data.readInt();
this.onAcquired(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_onAuthenticated:
{
data.enforceInterface(DESCRIPTOR);
long _arg0;
_arg0 = data.readLong();
int _arg1;
_arg1 = data.readInt();
int _arg2;
_arg2 = data.readInt();
this.onAuthenticated(_arg0, _arg1, _arg2);
reply.writeNoException();
return true;
}
case TRANSACTION_onError:
{
data.enforceInterface(DESCRIPTOR);
long _arg0;
_arg0 = data.readLong();
int _arg1;
_arg1 = data.readInt();
this.onError(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_onRemoved:
{
data.enforceInterface(DESCRIPTOR);
long _arg0;
_arg0 = data.readLong();
int _arg1;
_arg1 = data.readInt();
int _arg2;
_arg2 = data.readInt();
this.onRemoved(_arg0, _arg1, _arg2);
reply.writeNoException();
return true;
}
case TRANSACTION_onEnumerate:
{
data.enforceInterface(DESCRIPTOR);
long _arg0;
_arg0 = data.readLong();
int[] _arg1;
_arg1 = data.createIntArray();
int[] _arg2;
_arg2 = data.createIntArray();
this.onEnumerate(_arg0, _arg1, _arg2);
reply.writeNoException();
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements android.hardware.fingerprint.IFingerprintDaemonCallback
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
@Override public void onEnrollResult(long deviceId, int fingerId, int groupId, int remaining) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeLong(deviceId);
_data.writeInt(fingerId);
_data.writeInt(groupId);
_data.writeInt(remaining);
mRemote.transact(Stub.TRANSACTION_onEnrollResult, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void onAcquired(long deviceId, int acquiredInfo) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeLong(deviceId);
_data.writeInt(acquiredInfo);
mRemote.transact(Stub.TRANSACTION_onAcquired, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void onAuthenticated(long deviceId, int fingerId, int groupId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeLong(deviceId);
_data.writeInt(fingerId);
_data.writeInt(groupId);
mRemote.transact(Stub.TRANSACTION_onAuthenticated, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void onError(long deviceId, int error) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeLong(deviceId);
_data.writeInt(error);
mRemote.transact(Stub.TRANSACTION_onError, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void onRemoved(long deviceId, int fingerId, int groupId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeLong(deviceId);
_data.writeInt(fingerId);
_data.writeInt(groupId);
mRemote.transact(Stub.TRANSACTION_onRemoved, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void onEnumerate(long deviceId, int[] fingerIds, int[] groupIds) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeLong(deviceId);
_data.writeIntArray(fingerIds);
_data.writeIntArray(groupIds);
mRemote.transact(Stub.TRANSACTION_onEnumerate, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
}
static final int TRANSACTION_onEnrollResult = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_onAcquired = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_onAuthenticated = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
static final int TRANSACTION_onError = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
static final int TRANSACTION_onRemoved = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
static final int TRANSACTION_onEnumerate = (android.os.IBinder.FIRST_CALL_TRANSACTION + 5);
}
public void onEnrollResult(long deviceId, int fingerId, int groupId, int remaining) throws android.os.RemoteException;
public void onAcquired(long deviceId, int acquiredInfo) throws android.os.RemoteException;
public void onAuthenticated(long deviceId, int fingerId, int groupId) throws android.os.RemoteException;
public void onError(long deviceId, int error) throws android.os.RemoteException;
public void onRemoved(long deviceId, int fingerId, int groupId) throws android.os.RemoteException;
public void onEnumerate(long deviceId, int[] fingerIds, int[] groupIds) throws android.os.RemoteException;
}
