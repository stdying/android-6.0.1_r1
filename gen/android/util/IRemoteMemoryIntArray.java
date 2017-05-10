/*___Generated_by_IDEA___*/

/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: /home/useradmin/aosp7.0.0r3/frameworks/base/core/tests/utiltests/src/android/util/IRemoteMemoryIntArray.aidl
 */
package android.util;
public interface IRemoteMemoryIntArray extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements android.util.IRemoteMemoryIntArray
{
private static final java.lang.String DESCRIPTOR = "android.util.IRemoteMemoryIntArray";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an android.util.IRemoteMemoryIntArray interface,
 * generating a proxy if needed.
 */
public static android.util.IRemoteMemoryIntArray asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof android.util.IRemoteMemoryIntArray))) {
return ((android.util.IRemoteMemoryIntArray)iin);
}
return new android.util.IRemoteMemoryIntArray.Stub.Proxy(obj);
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
case TRANSACTION_peekInstance:
{
data.enforceInterface(DESCRIPTOR);
android.util.MemoryIntArray _result = this.peekInstance();
reply.writeNoException();
if ((_result!=null)) {
reply.writeInt(1);
_result.writeToParcel(reply, android.os.Parcelable.PARCELABLE_WRITE_RETURN_VALUE);
}
else {
reply.writeInt(0);
}
return true;
}
case TRANSACTION_create:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
boolean _arg1;
_arg1 = (0!=data.readInt());
this.create(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_isWritable:
{
data.enforceInterface(DESCRIPTOR);
boolean _result = this.isWritable();
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_get:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
int _result = this.get(_arg0);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_set:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
int _arg1;
_arg1 = data.readInt();
this.set(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_size:
{
data.enforceInterface(DESCRIPTOR);
int _result = this.size();
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_close:
{
data.enforceInterface(DESCRIPTOR);
this.close();
reply.writeNoException();
return true;
}
case TRANSACTION_isClosed:
{
data.enforceInterface(DESCRIPTOR);
boolean _result = this.isClosed();
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements android.util.IRemoteMemoryIntArray
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
@Override public android.util.MemoryIntArray peekInstance() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
android.util.MemoryIntArray _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_peekInstance, _data, _reply, 0);
_reply.readException();
if ((0!=_reply.readInt())) {
_result = android.util.MemoryIntArray.CREATOR.createFromParcel(_reply);
}
else {
_result = null;
}
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public void create(int size, boolean clientWritable) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(size);
_data.writeInt(((clientWritable)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_create, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public boolean isWritable() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_isWritable, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public int get(int index) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(index);
mRemote.transact(Stub.TRANSACTION_get, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public void set(int index, int value) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(index);
_data.writeInt(value);
mRemote.transact(Stub.TRANSACTION_set, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public int size() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_size, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public void close() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_close, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public boolean isClosed() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_isClosed, _data, _reply, 0);
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
static final int TRANSACTION_peekInstance = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_create = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_isWritable = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
static final int TRANSACTION_get = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
static final int TRANSACTION_set = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
static final int TRANSACTION_size = (android.os.IBinder.FIRST_CALL_TRANSACTION + 5);
static final int TRANSACTION_close = (android.os.IBinder.FIRST_CALL_TRANSACTION + 6);
static final int TRANSACTION_isClosed = (android.os.IBinder.FIRST_CALL_TRANSACTION + 7);
}
public android.util.MemoryIntArray peekInstance() throws android.os.RemoteException;
public void create(int size, boolean clientWritable) throws android.os.RemoteException;
public boolean isWritable() throws android.os.RemoteException;
public int get(int index) throws android.os.RemoteException;
public void set(int index, int value) throws android.os.RemoteException;
public int size() throws android.os.RemoteException;
public void close() throws android.os.RemoteException;
public boolean isClosed() throws android.os.RemoteException;
}
