/*___Generated_by_IDEA___*/

/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: /home/useradmin/aosp7.0.0r3/packages/services/Car/libvehiclenetwork/java/src/com/android/car/vehiclenetwork/IVehicleNetwork.aidl
 */
package com.android.car.vehiclenetwork;
/**
  * Binder API to access vehicle network service.
  * @hide
  */
public interface IVehicleNetwork extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements com.android.car.vehiclenetwork.IVehicleNetwork
{
private static final java.lang.String DESCRIPTOR = "com.android.car.vehiclenetwork.IVehicleNetwork";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an com.android.car.vehiclenetwork.IVehicleNetwork interface,
 * generating a proxy if needed.
 */
public static com.android.car.vehiclenetwork.IVehicleNetwork asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof com.android.car.vehiclenetwork.IVehicleNetwork))) {
return ((com.android.car.vehiclenetwork.IVehicleNetwork)iin);
}
return new com.android.car.vehiclenetwork.IVehicleNetwork.Stub.Proxy(obj);
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
case TRANSACTION_listProperties:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
com.android.car.vehiclenetwork.VehiclePropConfigsParcelable _result = this.listProperties(_arg0);
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
case TRANSACTION_setProperty:
{
data.enforceInterface(DESCRIPTOR);
com.android.car.vehiclenetwork.VehiclePropValueParcelable _arg0;
if ((0!=data.readInt())) {
_arg0 = com.android.car.vehiclenetwork.VehiclePropValueParcelable.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
this.setProperty(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_getProperty:
{
data.enforceInterface(DESCRIPTOR);
com.android.car.vehiclenetwork.VehiclePropValueParcelable _arg0;
if ((0!=data.readInt())) {
_arg0 = com.android.car.vehiclenetwork.VehiclePropValueParcelable.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
com.android.car.vehiclenetwork.VehiclePropValueParcelable _result = this.getProperty(_arg0);
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
case TRANSACTION_subscribe:
{
data.enforceInterface(DESCRIPTOR);
com.android.car.vehiclenetwork.IVehicleNetworkListener _arg0;
_arg0 = com.android.car.vehiclenetwork.IVehicleNetworkListener.Stub.asInterface(data.readStrongBinder());
int _arg1;
_arg1 = data.readInt();
float _arg2;
_arg2 = data.readFloat();
int _arg3;
_arg3 = data.readInt();
this.subscribe(_arg0, _arg1, _arg2, _arg3);
reply.writeNoException();
return true;
}
case TRANSACTION_unsubscribe:
{
data.enforceInterface(DESCRIPTOR);
com.android.car.vehiclenetwork.IVehicleNetworkListener _arg0;
_arg0 = com.android.car.vehiclenetwork.IVehicleNetworkListener.Stub.asInterface(data.readStrongBinder());
int _arg1;
_arg1 = data.readInt();
this.unsubscribe(_arg0, _arg1);
reply.writeNoException();
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
this.startMocking(_arg0);
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
case TRANSACTION_injectHalError:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
int _arg1;
_arg1 = data.readInt();
int _arg2;
_arg2 = data.readInt();
this.injectHalError(_arg0, _arg1, _arg2);
reply.writeNoException();
return true;
}
case TRANSACTION_startErrorListening:
{
data.enforceInterface(DESCRIPTOR);
com.android.car.vehiclenetwork.IVehicleNetworkListener _arg0;
_arg0 = com.android.car.vehiclenetwork.IVehicleNetworkListener.Stub.asInterface(data.readStrongBinder());
this.startErrorListening(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_stopErrorListening:
{
data.enforceInterface(DESCRIPTOR);
com.android.car.vehiclenetwork.IVehicleNetworkListener _arg0;
_arg0 = com.android.car.vehiclenetwork.IVehicleNetworkListener.Stub.asInterface(data.readStrongBinder());
this.stopErrorListening(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_startHalRestartMonitoring:
{
data.enforceInterface(DESCRIPTOR);
com.android.car.vehiclenetwork.IVehicleNetworkListener _arg0;
_arg0 = com.android.car.vehiclenetwork.IVehicleNetworkListener.Stub.asInterface(data.readStrongBinder());
this.startHalRestartMonitoring(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_stopHalRestartMonitoring:
{
data.enforceInterface(DESCRIPTOR);
com.android.car.vehiclenetwork.IVehicleNetworkListener _arg0;
_arg0 = com.android.car.vehiclenetwork.IVehicleNetworkListener.Stub.asInterface(data.readStrongBinder());
this.stopHalRestartMonitoring(_arg0);
reply.writeNoException();
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements com.android.car.vehiclenetwork.IVehicleNetwork
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
@Override public com.android.car.vehiclenetwork.VehiclePropConfigsParcelable listProperties(int property) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
com.android.car.vehiclenetwork.VehiclePropConfigsParcelable _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(property);
mRemote.transact(Stub.TRANSACTION_listProperties, _data, _reply, 0);
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
/** For error case, exception will be thrown. */
@Override public void setProperty(com.android.car.vehiclenetwork.VehiclePropValueParcelable value) throws android.os.RemoteException
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
mRemote.transact(Stub.TRANSACTION_setProperty, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public com.android.car.vehiclenetwork.VehiclePropValueParcelable getProperty(com.android.car.vehiclenetwork.VehiclePropValueParcelable value) throws android.os.RemoteException
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
mRemote.transact(Stub.TRANSACTION_getProperty, _data, _reply, 0);
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
/** For error case, exception will be thrown. */
@Override public void subscribe(com.android.car.vehiclenetwork.IVehicleNetworkListener listener, int property, float sampleRate, int zones) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((listener!=null))?(listener.asBinder()):(null)));
_data.writeInt(property);
_data.writeFloat(sampleRate);
_data.writeInt(zones);
mRemote.transact(Stub.TRANSACTION_subscribe, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void unsubscribe(com.android.car.vehiclenetwork.IVehicleNetworkListener listener, int property) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((listener!=null))?(listener.asBinder()):(null)));
_data.writeInt(property);
mRemote.transact(Stub.TRANSACTION_unsubscribe, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
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
@Override public void startMocking(com.android.car.vehiclenetwork.IVehicleNetworkHalMock mock) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((mock!=null))?(mock.asBinder()):(null)));
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
@Override public void injectHalError(int errorCode, int property, int operation) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(errorCode);
_data.writeInt(property);
_data.writeInt(operation);
mRemote.transact(Stub.TRANSACTION_injectHalError, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void startErrorListening(com.android.car.vehiclenetwork.IVehicleNetworkListener listener) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((listener!=null))?(listener.asBinder()):(null)));
mRemote.transact(Stub.TRANSACTION_startErrorListening, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void stopErrorListening(com.android.car.vehiclenetwork.IVehicleNetworkListener listener) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((listener!=null))?(listener.asBinder()):(null)));
mRemote.transact(Stub.TRANSACTION_stopErrorListening, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void startHalRestartMonitoring(com.android.car.vehiclenetwork.IVehicleNetworkListener listener) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((listener!=null))?(listener.asBinder()):(null)));
mRemote.transact(Stub.TRANSACTION_startHalRestartMonitoring, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void stopHalRestartMonitoring(com.android.car.vehiclenetwork.IVehicleNetworkListener listener) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((listener!=null))?(listener.asBinder()):(null)));
mRemote.transact(Stub.TRANSACTION_stopHalRestartMonitoring, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
}
static final int TRANSACTION_listProperties = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_setProperty = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_getProperty = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
static final int TRANSACTION_subscribe = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
static final int TRANSACTION_unsubscribe = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
static final int TRANSACTION_injectEvent = (android.os.IBinder.FIRST_CALL_TRANSACTION + 5);
static final int TRANSACTION_startMocking = (android.os.IBinder.FIRST_CALL_TRANSACTION + 6);
static final int TRANSACTION_stopMocking = (android.os.IBinder.FIRST_CALL_TRANSACTION + 7);
static final int TRANSACTION_injectHalError = (android.os.IBinder.FIRST_CALL_TRANSACTION + 8);
static final int TRANSACTION_startErrorListening = (android.os.IBinder.FIRST_CALL_TRANSACTION + 9);
static final int TRANSACTION_stopErrorListening = (android.os.IBinder.FIRST_CALL_TRANSACTION + 10);
static final int TRANSACTION_startHalRestartMonitoring = (android.os.IBinder.FIRST_CALL_TRANSACTION + 11);
static final int TRANSACTION_stopHalRestartMonitoring = (android.os.IBinder.FIRST_CALL_TRANSACTION + 12);
}
public com.android.car.vehiclenetwork.VehiclePropConfigsParcelable listProperties(int property) throws android.os.RemoteException;
/** For error case, exception will be thrown. */
public void setProperty(com.android.car.vehiclenetwork.VehiclePropValueParcelable value) throws android.os.RemoteException;
public com.android.car.vehiclenetwork.VehiclePropValueParcelable getProperty(com.android.car.vehiclenetwork.VehiclePropValueParcelable value) throws android.os.RemoteException;
/** For error case, exception will be thrown. */
public void subscribe(com.android.car.vehiclenetwork.IVehicleNetworkListener listener, int property, float sampleRate, int zones) throws android.os.RemoteException;
public void unsubscribe(com.android.car.vehiclenetwork.IVehicleNetworkListener listener, int property) throws android.os.RemoteException;
/** For testing only. inject events. */
public void injectEvent(com.android.car.vehiclenetwork.VehiclePropValueParcelable value) throws android.os.RemoteException;
/** For testing only. Start in mocking mode. */
public void startMocking(com.android.car.vehiclenetwork.IVehicleNetworkHalMock mock) throws android.os.RemoteException;
/** Finish mocking mode. */
public void stopMocking(com.android.car.vehiclenetwork.IVehicleNetworkHalMock mock) throws android.os.RemoteException;
public void injectHalError(int errorCode, int property, int operation) throws android.os.RemoteException;
public void startErrorListening(com.android.car.vehiclenetwork.IVehicleNetworkListener listener) throws android.os.RemoteException;
public void stopErrorListening(com.android.car.vehiclenetwork.IVehicleNetworkListener listener) throws android.os.RemoteException;
public void startHalRestartMonitoring(com.android.car.vehiclenetwork.IVehicleNetworkListener listener) throws android.os.RemoteException;
public void stopHalRestartMonitoring(com.android.car.vehiclenetwork.IVehicleNetworkListener listener) throws android.os.RemoteException;
}
