/*___Generated_by_IDEA___*/

/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: /home/useradmin/aosp7.0.0r3/packages/services/Car/bluetooth/bt-map-client-lib/src/com/google/android/auto/mapservice/IBluetoothMapServiceCallbacks.aidl
 */
package com.google.android.auto.mapservice;
/**
 * Any binder to IBluetoothMapService will have to provide this class as the callbacks so that
 * it can listen to various events that happen in the inbox of the phone such as new messages or
 * message delivery reports (see BluetoothMapEventReport above). Additionally it also informs the
 * binder about the state of service connection (see onConnect and onDisconnect functions below).
 *
 * NOTE: Callbacks which are initiated by client i.e. callbacks in response to any of the API
 * functions defined in IBluetoothMapService will be executed in order of functions called. i.e.
 * if getMessage(handle1) is called followed by getMessage(handle2) then the reply of handle1 will
 * be received before handle2. Hence there's synchronization in order of callbacks. Although there
 * is no order for onEvent calls because they are not initiated by client in
 * IBluetoothMapService.
 * @hide
 */
public interface IBluetoothMapServiceCallbacks extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements com.google.android.auto.mapservice.IBluetoothMapServiceCallbacks
{
private static final java.lang.String DESCRIPTOR = "com.google.android.auto.mapservice.IBluetoothMapServiceCallbacks";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an com.google.android.auto.mapservice.IBluetoothMapServiceCallbacks interface,
 * generating a proxy if needed.
 */
public static com.google.android.auto.mapservice.IBluetoothMapServiceCallbacks asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof com.google.android.auto.mapservice.IBluetoothMapServiceCallbacks))) {
return ((com.google.android.auto.mapservice.IBluetoothMapServiceCallbacks)iin);
}
return new com.google.android.auto.mapservice.IBluetoothMapServiceCallbacks.Stub.Proxy(obj);
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
case TRANSACTION_onConnect:
{
data.enforceInterface(DESCRIPTOR);
this.onConnect();
return true;
}
case TRANSACTION_onConnectFailed:
{
data.enforceInterface(DESCRIPTOR);
this.onConnectFailed();
return true;
}
case TRANSACTION_onEnableNotifications:
{
data.enforceInterface(DESCRIPTOR);
this.onEnableNotifications();
return true;
}
case TRANSACTION_onPushMessage:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
this.onPushMessage(_arg0);
return true;
}
case TRANSACTION_onGetMessage:
{
data.enforceInterface(DESCRIPTOR);
com.google.android.auto.mapservice.BluetoothMapMessage _arg0;
if ((0!=data.readInt())) {
_arg0 = com.google.android.auto.mapservice.BluetoothMapMessage.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
this.onGetMessage(_arg0);
return true;
}
case TRANSACTION_onGetMessagesListing:
{
data.enforceInterface(DESCRIPTOR);
java.util.List<com.google.android.auto.mapservice.BluetoothMapMessagesListing> _arg0;
_arg0 = data.createTypedArrayList(com.google.android.auto.mapservice.BluetoothMapMessagesListing.CREATOR);
this.onGetMessagesListing(_arg0);
return true;
}
case TRANSACTION_onEvent:
{
data.enforceInterface(DESCRIPTOR);
com.google.android.auto.mapservice.BluetoothMapEventReport _arg0;
if ((0!=data.readInt())) {
_arg0 = com.google.android.auto.mapservice.BluetoothMapEventReport.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
this.onEvent(_arg0);
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements com.google.android.auto.mapservice.IBluetoothMapServiceCallbacks
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
// Notifies the client binding to the service if the callback has been registered successfully.

@Override public void onConnect() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_onConnect, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
// Notifies the client binding to the service if the callback is registered but not connected to
// external Map profile via any device. The client should wait until it receives onConnect()
// again before using the API.

@Override public void onConnectFailed() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_onConnectFailed, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
// Callback for notification registration.
// @status - The final status of the notifications.

@Override public void onEnableNotifications() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_onEnableNotifications, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
// Returns the string handle for a pushMessage request.

@Override public void onPushMessage(java.lang.String handle) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(handle);
mRemote.transact(Stub.TRANSACTION_onPushMessage, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
// Callback for getMessage().
// @message - The message.

@Override public void onGetMessage(com.google.android.auto.mapservice.BluetoothMapMessage message) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((message!=null)) {
_data.writeInt(1);
message.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_onGetMessage, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
// Callback for getMessagesListing().

@Override public void onGetMessagesListing(java.util.List<com.google.android.auto.mapservice.BluetoothMapMessagesListing> msgsListing) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeTypedList(msgsListing);
mRemote.transact(Stub.TRANSACTION_onGetMessagesListing, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
// Whenever there is an event (see list of events on top of BluetoothMapEventReport) this
// callback will be executed with the event report. Client can take subsequent action on each
// such report.
//
// Eg. If the report is NEW_MESSAGE then the client should grab the handle from the event report
// and send a getMessage request to fetch the message.
// @eventReport - The event report which contains details of how to proceed with notification.

@Override public void onEvent(com.google.android.auto.mapservice.BluetoothMapEventReport eventReport) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((eventReport!=null)) {
_data.writeInt(1);
eventReport.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_onEvent, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
}
static final int TRANSACTION_onConnect = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_onConnectFailed = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_onEnableNotifications = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
static final int TRANSACTION_onPushMessage = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
static final int TRANSACTION_onGetMessage = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
static final int TRANSACTION_onGetMessagesListing = (android.os.IBinder.FIRST_CALL_TRANSACTION + 5);
static final int TRANSACTION_onEvent = (android.os.IBinder.FIRST_CALL_TRANSACTION + 6);
}
// Notifies the client binding to the service if the callback has been registered successfully.

public void onConnect() throws android.os.RemoteException;
// Notifies the client binding to the service if the callback is registered but not connected to
// external Map profile via any device. The client should wait until it receives onConnect()
// again before using the API.

public void onConnectFailed() throws android.os.RemoteException;
// Callback for notification registration.
// @status - The final status of the notifications.

public void onEnableNotifications() throws android.os.RemoteException;
// Returns the string handle for a pushMessage request.

public void onPushMessage(java.lang.String handle) throws android.os.RemoteException;
// Callback for getMessage().
// @message - The message.

public void onGetMessage(com.google.android.auto.mapservice.BluetoothMapMessage message) throws android.os.RemoteException;
// Callback for getMessagesListing().

public void onGetMessagesListing(java.util.List<com.google.android.auto.mapservice.BluetoothMapMessagesListing> msgsListing) throws android.os.RemoteException;
// Whenever there is an event (see list of events on top of BluetoothMapEventReport) this
// callback will be executed with the event report. Client can take subsequent action on each
// such report.
//
// Eg. If the report is NEW_MESSAGE then the client should grab the handle from the event report
// and send a getMessage request to fetch the message.
// @eventReport - The event report which contains details of how to proceed with notification.

public void onEvent(com.google.android.auto.mapservice.BluetoothMapEventReport eventReport) throws android.os.RemoteException;
}
