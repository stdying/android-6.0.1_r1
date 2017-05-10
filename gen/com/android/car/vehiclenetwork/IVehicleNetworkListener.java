/*___Generated_by_IDEA___*/

/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: /home/useradmin/aosp7.0.0r3/packages/services/Car/libvehiclenetwork/java/src/com/android/car/vehiclenetwork/IVehicleNetworkListener.aidl
 */
package com.android.car.vehiclenetwork;
/**
 * Listener for vehicle network service. Intentionally both way as this is supposed to be
 * used between system components. Making this one way brings ordering issue.
 * @hide
 */
public interface IVehicleNetworkListener extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements com.android.car.vehiclenetwork.IVehicleNetworkListener
{
private static final java.lang.String DESCRIPTOR = "com.android.car.vehiclenetwork.IVehicleNetworkListener";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an com.android.car.vehiclenetwork.IVehicleNetworkListener interface,
 * generating a proxy if needed.
 */
public static com.android.car.vehiclenetwork.IVehicleNetworkListener asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof com.android.car.vehiclenetwork.IVehicleNetworkListener))) {
return ((com.android.car.vehiclenetwork.IVehicleNetworkListener)iin);
}
return new com.android.car.vehiclenetwork.IVehicleNetworkListener.Stub.Proxy(obj);
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
case TRANSACTION_onVehicleNetworkEvents:
{
data.enforceInterface(DESCRIPTOR);
com.android.car.vehiclenetwork.VehiclePropValuesParcelable _arg0;
if ((0!=data.readInt())) {
_arg0 = com.android.car.vehiclenetwork.VehiclePropValuesParcelable.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
this.onVehicleNetworkEvents(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_onHalError:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
int _arg1;
_arg1 = data.readInt();
int _arg2;
_arg2 = data.readInt();
this.onHalError(_arg0, _arg1, _arg2);
reply.writeNoException();
return true;
}
case TRANSACTION_onHalRestart:
{
data.enforceInterface(DESCRIPTOR);
boolean _arg0;
_arg0 = (0!=data.readInt());
this.onHalRestart(_arg0);
reply.writeNoException();
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements com.android.car.vehiclenetwork.IVehicleNetworkListener
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
@Override public void onVehicleNetworkEvents(com.android.car.vehiclenetwork.VehiclePropValuesParcelable values) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((values!=null)) {
_data.writeInt(1);
values.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_onVehicleNetworkEvents, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void onHalError(int errorCode, int property, int operation) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(errorCode);
_data.writeInt(property);
_data.writeInt(operation);
mRemote.transact(Stub.TRANSACTION_onHalError, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void onHalRestart(boolean inMocking) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(((inMocking)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_onHalRestart, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
}
static final int TRANSACTION_onVehicleNetworkEvents = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_onHalError = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_onHalRestart = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
}
public void onVehicleNetworkEvents(com.android.car.vehiclenetwork.VehiclePropValuesParcelable values) throws android.os.RemoteException;
public void onHalError(int errorCode, int property, int operation) throws android.os.RemoteException;
public void onHalRestart(boolean inMocking) throws android.os.RemoteException;
}
