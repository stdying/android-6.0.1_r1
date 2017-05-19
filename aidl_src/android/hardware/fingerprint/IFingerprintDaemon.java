/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: frameworks/base/core/java/android/hardware/fingerprint/IFingerprintDaemon.aidl
 */
package android.hardware.fingerprint;
/**
 * Communication channel from FingerprintService to FingerprintDaemon (fingerprintd)
 * @hide
 */
public interface IFingerprintDaemon extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements android.hardware.fingerprint.IFingerprintDaemon
{
private static final java.lang.String DESCRIPTOR = "android.hardware.fingerprint.IFingerprintDaemon";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an android.hardware.fingerprint.IFingerprintDaemon interface,
 * generating a proxy if needed.
 */
public static android.hardware.fingerprint.IFingerprintDaemon asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof android.hardware.fingerprint.IFingerprintDaemon))) {
return ((android.hardware.fingerprint.IFingerprintDaemon)iin);
}
return new android.hardware.fingerprint.IFingerprintDaemon.Stub.Proxy(obj);
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
case TRANSACTION_authenticate:
{
data.enforceInterface(DESCRIPTOR);
long _arg0;
_arg0 = data.readLong();
int _arg1;
_arg1 = data.readInt();
int _result = this.authenticate(_arg0, _arg1);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_cancelAuthentication:
{
data.enforceInterface(DESCRIPTOR);
int _result = this.cancelAuthentication();
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_enroll:
{
data.enforceInterface(DESCRIPTOR);
byte[] _arg0;
_arg0 = data.createByteArray();
int _arg1;
_arg1 = data.readInt();
int _arg2;
_arg2 = data.readInt();
int _result = this.enroll(_arg0, _arg1, _arg2);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_cancelEnrollment:
{
data.enforceInterface(DESCRIPTOR);
int _result = this.cancelEnrollment();
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_preEnroll:
{
data.enforceInterface(DESCRIPTOR);
long _result = this.preEnroll();
reply.writeNoException();
reply.writeLong(_result);
return true;
}
case TRANSACTION_remove:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
int _arg1;
_arg1 = data.readInt();
int _result = this.remove(_arg0, _arg1);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_getAuthenticatorId:
{
data.enforceInterface(DESCRIPTOR);
long _result = this.getAuthenticatorId();
reply.writeNoException();
reply.writeLong(_result);
return true;
}
case TRANSACTION_setActiveGroup:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
byte[] _arg1;
_arg1 = data.createByteArray();
int _result = this.setActiveGroup(_arg0, _arg1);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_openHal:
{
data.enforceInterface(DESCRIPTOR);
long _result = this.openHal();
reply.writeNoException();
reply.writeLong(_result);
return true;
}
case TRANSACTION_closeHal:
{
data.enforceInterface(DESCRIPTOR);
int _result = this.closeHal();
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_init:
{
data.enforceInterface(DESCRIPTOR);
android.hardware.fingerprint.IFingerprintDaemonCallback _arg0;
_arg0 = android.hardware.fingerprint.IFingerprintDaemonCallback.Stub.asInterface(data.readStrongBinder());
this.init(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_postEnroll:
{
data.enforceInterface(DESCRIPTOR);
int _result = this.postEnroll();
reply.writeNoException();
reply.writeInt(_result);
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements android.hardware.fingerprint.IFingerprintDaemon
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
@Override public int authenticate(long sessionId, int groupId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeLong(sessionId);
_data.writeInt(groupId);
mRemote.transact(Stub.TRANSACTION_authenticate, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public int cancelAuthentication() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_cancelAuthentication, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public int enroll(byte[] token, int groupId, int timeout) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeByteArray(token);
_data.writeInt(groupId);
_data.writeInt(timeout);
mRemote.transact(Stub.TRANSACTION_enroll, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public int cancelEnrollment() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_cancelEnrollment, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public long preEnroll() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
long _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_preEnroll, _data, _reply, 0);
_reply.readException();
_result = _reply.readLong();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public int remove(int fingerId, int groupId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(fingerId);
_data.writeInt(groupId);
mRemote.transact(Stub.TRANSACTION_remove, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public long getAuthenticatorId() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
long _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getAuthenticatorId, _data, _reply, 0);
_reply.readException();
_result = _reply.readLong();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public int setActiveGroup(int groupId, byte[] path) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(groupId);
_data.writeByteArray(path);
mRemote.transact(Stub.TRANSACTION_setActiveGroup, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public long openHal() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
long _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_openHal, _data, _reply, 0);
_reply.readException();
_result = _reply.readLong();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public int closeHal() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_closeHal, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public void init(android.hardware.fingerprint.IFingerprintDaemonCallback callback) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((callback!=null))?(callback.asBinder()):(null)));
mRemote.transact(Stub.TRANSACTION_init, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public int postEnroll() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_postEnroll, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
}
static final int TRANSACTION_authenticate = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_cancelAuthentication = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_enroll = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
static final int TRANSACTION_cancelEnrollment = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
static final int TRANSACTION_preEnroll = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
static final int TRANSACTION_remove = (android.os.IBinder.FIRST_CALL_TRANSACTION + 5);
static final int TRANSACTION_getAuthenticatorId = (android.os.IBinder.FIRST_CALL_TRANSACTION + 6);
static final int TRANSACTION_setActiveGroup = (android.os.IBinder.FIRST_CALL_TRANSACTION + 7);
static final int TRANSACTION_openHal = (android.os.IBinder.FIRST_CALL_TRANSACTION + 8);
static final int TRANSACTION_closeHal = (android.os.IBinder.FIRST_CALL_TRANSACTION + 9);
static final int TRANSACTION_init = (android.os.IBinder.FIRST_CALL_TRANSACTION + 10);
static final int TRANSACTION_postEnroll = (android.os.IBinder.FIRST_CALL_TRANSACTION + 11);
}
public int authenticate(long sessionId, int groupId) throws android.os.RemoteException;
public int cancelAuthentication() throws android.os.RemoteException;
public int enroll(byte[] token, int groupId, int timeout) throws android.os.RemoteException;
public int cancelEnrollment() throws android.os.RemoteException;
public long preEnroll() throws android.os.RemoteException;
public int remove(int fingerId, int groupId) throws android.os.RemoteException;
public long getAuthenticatorId() throws android.os.RemoteException;
public int setActiveGroup(int groupId, byte[] path) throws android.os.RemoteException;
public long openHal() throws android.os.RemoteException;
public int closeHal() throws android.os.RemoteException;
public void init(android.hardware.fingerprint.IFingerprintDaemonCallback callback) throws android.os.RemoteException;
public int postEnroll() throws android.os.RemoteException;
}
