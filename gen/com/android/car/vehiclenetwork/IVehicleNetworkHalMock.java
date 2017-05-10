/*___Generated_by_IDEA___*/

/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: /home/useradmin/aosp7.0.0r3/packages/services/Car/libvehiclenetwork/java/src/com/android/car/vehiclenetwork/IVehicleNetworkHalMock.aidl
 */
package com.android.car.vehiclenetwork;
/**
 * Listener for vehicle HAL mock. This is used for internal testing only.
 * @hide
 */
public interface IVehicleNetworkHalMock extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements com.android.car.vehiclenetwork.IVehicleNetworkHalMock
{
private static final java.lang.String DESCRIPTOR = "com.android.car.vehiclenetwork.IVehicleNetworkHalMock";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an com.android.car.vehiclenetwork.IVehicleNetworkHalMock interface,
 * generating a proxy if needed.
 */
public static com.android.car.vehiclenetwork.IVehicleNetworkHalMock asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof com.android.car.vehiclenetwork.IVehicleNetworkHalMock))) {
return ((com.android.car.vehiclenetwork.IVehicleNetworkHalMock)iin);
}
return new com.android.car.vehiclenetwork.IVehicleNetworkHalMock.Stub.Proxy(obj);
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
case TRANSACTION_onListProperties:
{
data.enforceInterface(DESCRIPTOR);
com.android.car.vehiclenetwork.VehiclePropConfigsParcelable _result = this.onListProperties();
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
case TRANSACTION_onPropertySet:
{
data.enforceInterface(DESCRIPTOR);
com.android.car.vehiclenetwork.VehiclePropValueParcelable _arg0;
if ((0!=data.readInt())) {
_arg0 = com.android.car.vehiclenetwork.VehiclePropValueParcelable.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
this.onPropertySet(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_onPropertyGet:
{
data.enforceInterface(DESCRIPTOR);
com.android.car.vehiclenetwork.VehiclePropValueParcelable _arg0;
if ((0!=data.readInt())) {
_arg0 = com.android.car.vehiclenetwork.VehiclePropValueParcelable.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
com.android.car.vehiclenetwork.VehiclePropValueParcelable _result = this.onPropertyGet(_arg0);
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
case TRANSACTION_onPropertySubscribe:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
float _arg1;
_arg1 = data.readFloat();
int _arg2;
_arg2 = data.readInt();
this.onPropertySubscribe(_arg0, _arg1, _arg2);
reply.writeNoException();
return true;
}
case TRANSACTION_onPropertyUnsubscribe:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
this.onPropertyUnsubscribe(_arg0);
reply.writeNoException();
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements com.android.car.vehiclenetwork.IVehicleNetworkHalMock
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
@Override public com.android.car.vehiclenetwork.VehiclePropConfigsParcelable onListProperties() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
com.android.car.vehiclenetwork.VehiclePropConfigsParcelable _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_onListProperties, _data, _reply, 0);
_reply.readException();
if ((0!=_reply.readInt())) {
_result = com.android.car.vehiclenetwork.VehiclePropConfigsParcelable.CREATOR.createFromParcel(_reply);
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
@Override public void onPropertySet(com.android.car.vehiclenetwork.VehiclePropValueParcelable value) throws android.os.RemoteException
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
mRemote.transact(Stub.TRANSACTION_onPropertySet, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public com.android.car.vehiclenetwork.VehiclePropValueParcelable onPropertyGet(com.android.car.vehiclenetwork.VehiclePropValueParcelable value) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
com.android.car.vehiclenetwork.VehiclePropValueParcelable _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((value!=null)) {
_data.writeInt(1);
value.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_onPropertyGet, _data, _reply, 0);
_reply.readException();
if ((0!=_reply.readInt())) {
_result = com.android.car.vehiclenetwork.VehiclePropValueParcelable.CREATOR.createFromParcel(_reply);
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
@Override public void onPropertySubscribe(int property, float sampleRate, int zones) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(property);
_data.writeFloat(sampleRate);
_data.writeInt(zones);
mRemote.transact(Stub.TRANSACTION_onPropertySubscribe, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void onPropertyUnsubscribe(int property) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(property);
mRemote.transact(Stub.TRANSACTION_onPropertyUnsubscribe, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
}
static final int TRANSACTION_onListProperties = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_onPropertySet = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_onPropertyGet = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
static final int TRANSACTION_onPropertySubscribe = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
static final int TRANSACTION_onPropertyUnsubscribe = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
}
public com.android.car.vehiclenetwork.VehiclePropConfigsParcelable onListProperties() throws android.os.RemoteException;
public void onPropertySet(com.android.car.vehiclenetwork.VehiclePropValueParcelable value) throws android.os.RemoteException;
public com.android.car.vehiclenetwork.VehiclePropValueParcelable onPropertyGet(com.android.car.vehiclenetwork.VehiclePropValueParcelable value) throws android.os.RemoteException;
public void onPropertySubscribe(int property, float sampleRate, int zones) throws android.os.RemoteException;
public void onPropertyUnsubscribe(int property) throws android.os.RemoteException;
}
