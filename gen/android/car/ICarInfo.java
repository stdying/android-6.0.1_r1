/*___Generated_by_IDEA___*/

/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: /home/useradmin/aosp7.0.0r3/packages/services/Car/car-lib/src/android/car/ICarInfo.aidl
 */
package android.car;
/** @hide */
public interface ICarInfo extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements android.car.ICarInfo
{
private static final java.lang.String DESCRIPTOR = "android.car.ICarInfo";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an android.car.ICarInfo interface,
 * generating a proxy if needed.
 */
public static android.car.ICarInfo asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof android.car.ICarInfo))) {
return ((android.car.ICarInfo)iin);
}
return new android.car.ICarInfo.Stub.Proxy(obj);
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
case TRANSACTION_getInt:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
int[] _result = this.getInt(_arg0);
reply.writeNoException();
reply.writeIntArray(_result);
return true;
}
case TRANSACTION_getFloat:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
float[] _result = this.getFloat(_arg0);
reply.writeNoException();
reply.writeFloatArray(_result);
return true;
}
case TRANSACTION_getLong:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
long[] _result = this.getLong(_arg0);
reply.writeNoException();
reply.writeLongArray(_result);
return true;
}
case TRANSACTION_getString:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
java.lang.String _result = this.getString(_arg0);
reply.writeNoException();
reply.writeString(_result);
return true;
}
case TRANSACTION_getBundle:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
android.os.Bundle _result = this.getBundle(_arg0);
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
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements android.car.ICarInfo
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
@Override public int[] getInt(java.lang.String key) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int[] _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(key);
mRemote.transact(Stub.TRANSACTION_getInt, _data, _reply, 0);
_reply.readException();
_result = _reply.createIntArray();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/**
     * Even if it returns array, it will always be single element array. Array used to allow
     * returning null if not supported.
     */
@Override public float[] getFloat(java.lang.String key) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
float[] _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(key);
mRemote.transact(Stub.TRANSACTION_getFloat, _data, _reply, 0);
_reply.readException();
_result = _reply.createFloatArray();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/**
     * Even if it returns array, it will always be single element array. Array used to allow
     * returning null if not supported.
     */
@Override public long[] getLong(java.lang.String key) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
long[] _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(key);
mRemote.transact(Stub.TRANSACTION_getLong, _data, _reply, 0);
_reply.readException();
_result = _reply.createLongArray();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public java.lang.String getString(java.lang.String key) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.lang.String _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(key);
mRemote.transact(Stub.TRANSACTION_getString, _data, _reply, 0);
_reply.readException();
_result = _reply.readString();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public android.os.Bundle getBundle(java.lang.String key) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
android.os.Bundle _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(key);
mRemote.transact(Stub.TRANSACTION_getBundle, _data, _reply, 0);
_reply.readException();
if ((0!=_reply.readInt())) {
_result = android.os.Bundle.CREATOR.createFromParcel(_reply);
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
}
static final int TRANSACTION_getInt = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_getFloat = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_getLong = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
static final int TRANSACTION_getString = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
static final int TRANSACTION_getBundle = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
}
public int[] getInt(java.lang.String key) throws android.os.RemoteException;
/**
     * Even if it returns array, it will always be single element array. Array used to allow
     * returning null if not supported.
     */
public float[] getFloat(java.lang.String key) throws android.os.RemoteException;
/**
     * Even if it returns array, it will always be single element array. Array used to allow
     * returning null if not supported.
     */
public long[] getLong(java.lang.String key) throws android.os.RemoteException;
public java.lang.String getString(java.lang.String key) throws android.os.RemoteException;
public android.os.Bundle getBundle(java.lang.String key) throws android.os.RemoteException;
}
