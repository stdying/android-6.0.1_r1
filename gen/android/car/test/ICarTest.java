/*___Generated_by_IDEA___*/

/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: /home/useradmin/aosp7.0.0r3/packages/services/Car/car-systemtest-lib/src/android/car/test/ICarTest.aidl
 */
package android.car.test;
/** @hide */
public interface ICarTest extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements android.car.test.ICarTest
{
private static final java.lang.String DESCRIPTOR = "android.car.test.ICarTest";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an android.car.test.ICarTest interface,
 * generating a proxy if needed.
 */
public static android.car.test.ICarTest asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof android.car.test.ICarTest))) {
return ((android.car.test.ICarTest)iin);
}
return new android.car.test.ICarTest.Stub.Proxy(obj);
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
case TRANSACTION_injectEvent:
{
data.enforceInterface(DESCRIPTOR);
com.android.car.vehiclenetwork.VehiclePropValueParcelable _arg0;
if ((0!=data.readInt())) {
_arg0 = com.android.car.vehiclenetwork.VehiclePropValueParcelable.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
this.injectEvent(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_startMocking:
{
data.enforceInterface(DESCRIPTOR);
com.android.car.vehiclenetwork.IVehicleNetworkHalMock _arg0;
_arg0 = com.android.car.vehiclenetwork.IVehicleNetworkHalMock.Stub.asInterface(data.readStrongBinder());
int _arg1;
_arg1 = data.readInt();
this.startMocking(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_stopMocking:
{
data.enforceInterface(DESCRIPTOR);
com.android.car.vehiclenetwork.IVehicleNetworkHalMock _arg0;
_arg0 = com.android.car.vehiclenetwork.IVehicleNetworkHalMock.Stub.asInterface(data.readStrongBinder());
this.stopMocking(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_isPropertySupported:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
boolean _result = this.isPropertySupported(_arg0);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements android.car.test.ICarTest
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
/** For testing only. inject events. */
@Override public void injectEvent(com.android.car.vehiclenetwork.VehiclePropValueParcelable value) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((value!=null)) {
_data.writeInt(1);
value.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_injectEvent, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/** For testing only. Start in mocking mode. */
@Override public void startMocking(com.android.car.vehiclenetwork.IVehicleNetworkHalMock mock, int flags) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((mock!=null))?(mock.asBinder()):(null)));
_data.writeInt(flags);
mRemote.transact(Stub.TRANSACTION_startMocking, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/** Finish mocking mode. */
@Override public void stopMocking(com.android.car.vehiclenetwork.IVehicleNetworkHalMock mock) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((mock!=null))?(mock.asBinder()):(null)));
mRemote.transact(Stub.TRANSACTION_stopMocking, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/** If given property is supported or not */
@Override public boolean isPropertySupported(int property) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(property);
mRemote.transact(Stub.TRANSACTION_isPropertySupported, _data, _reply, 0);
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
static final int TRANSACTION_injectEvent = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_startMocking = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
static final int TRANSACTION_stopMocking = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
static final int TRANSACTION_isPropertySupported = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
}
/** For testing only. inject events. */
public void injectEvent(com.android.car.vehiclenetwork.VehiclePropValueParcelable value) throws android.os.RemoteException;
/** For testing only. Start in mocking mode. */
public void startMocking(com.android.car.vehiclenetwork.IVehicleNetworkHalMock mock, int flags) throws android.os.RemoteException;
/** Finish mocking mode. */
public void stopMocking(com.android.car.vehiclenetwork.IVehicleNetworkHalMock mock) throws android.os.RemoteException;
/** If given property is supported or not */
public boolean isPropertySupported(int property) throws android.os.RemoteException;
}
