/*___Generated_by_IDEA___*/

/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: /home/useradmin/aosp7.0.0r3/packages/services/Car/car-lib/src/android/car/content/pm/ICarPackageManager.aidl
 */
package android.car.content.pm;
/** @hide */
public interface ICarPackageManager extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements android.car.content.pm.ICarPackageManager
{
private static final java.lang.String DESCRIPTOR = "android.car.content.pm.ICarPackageManager";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an android.car.content.pm.ICarPackageManager interface,
 * generating a proxy if needed.
 */
public static android.car.content.pm.ICarPackageManager asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof android.car.content.pm.ICarPackageManager))) {
return ((android.car.content.pm.ICarPackageManager)iin);
}
return new android.car.content.pm.ICarPackageManager.Stub.Proxy(obj);
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
case TRANSACTION_setAppBlockingPolicy:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
android.car.content.pm.CarAppBlockingPolicy _arg1;
if ((0!=data.readInt())) {
_arg1 = android.car.content.pm.CarAppBlockingPolicy.CREATOR.createFromParcel(data);
}
else {
_arg1 = null;
}
int _arg2;
_arg2 = data.readInt();
this.setAppBlockingPolicy(_arg0, _arg1, _arg2);
reply.writeNoException();
return true;
}
case TRANSACTION_isActivityAllowedWhileDriving:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
java.lang.String _arg1;
_arg1 = data.readString();
boolean _result = this.isActivityAllowedWhileDriving(_arg0, _arg1);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_isServiceAllowedWhileDriving:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
java.lang.String _arg1;
_arg1 = data.readString();
boolean _result = this.isServiceAllowedWhileDriving(_arg0, _arg1);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements android.car.content.pm.ICarPackageManager
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
@Override public void setAppBlockingPolicy(java.lang.String packageName, android.car.content.pm.CarAppBlockingPolicy policy, int flags) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(packageName);
if ((policy!=null)) {
_data.writeInt(1);
policy.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeInt(flags);
mRemote.transact(Stub.TRANSACTION_setAppBlockingPolicy, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public boolean isActivityAllowedWhileDriving(java.lang.String packageName, java.lang.String className) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(packageName);
_data.writeString(className);
mRemote.transact(Stub.TRANSACTION_isActivityAllowedWhileDriving, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public boolean isServiceAllowedWhileDriving(java.lang.String packageName, java.lang.String className) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(packageName);
_data.writeString(className);
mRemote.transact(Stub.TRANSACTION_isServiceAllowedWhileDriving, _data, _reply, 0);
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
static final int TRANSACTION_setAppBlockingPolicy = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_isActivityAllowedWhileDriving = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_isServiceAllowedWhileDriving = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
}
public void setAppBlockingPolicy(java.lang.String packageName, android.car.content.pm.CarAppBlockingPolicy policy, int flags) throws android.os.RemoteException;
public boolean isActivityAllowedWhileDriving(java.lang.String packageName, java.lang.String className) throws android.os.RemoteException;
public boolean isServiceAllowedWhileDriving(java.lang.String packageName, java.lang.String className) throws android.os.RemoteException;
}
