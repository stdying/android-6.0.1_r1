/*___Generated_by_IDEA___*/

/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: /home/useradmin/aosp7.0.0r3/packages/services/Car/bluetooth/bt-map-client-lib/src/com/google/android/auto/mapservice/IBluetoothMapService.aidl
 */
package com.google.android.auto.mapservice;
/**
 * Bluetooth Message service provides the API for Car to send and receive messages by using the MAP
 * protocol over Bluetooth. The current set of functions that may be achieved are:
 * A) Send SMS/MMS over bluetooth.
 * B) Receive notifications for all SMS/MMS events on the phone (see Callback AIDL).
 * @hide
 */
public interface IBluetoothMapService extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements com.google.android.auto.mapservice.IBluetoothMapService
{
private static final java.lang.String DESCRIPTOR = "com.google.android.auto.mapservice.IBluetoothMapService";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an com.google.android.auto.mapservice.IBluetoothMapService interface,
 * generating a proxy if needed.
 */
public static com.google.android.auto.mapservice.IBluetoothMapService asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof com.google.android.auto.mapservice.IBluetoothMapService))) {
return ((com.google.android.auto.mapservice.IBluetoothMapService)iin);
}
return new com.google.android.auto.mapservice.IBluetoothMapService.Stub.Proxy(obj);
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
case TRANSACTION_connect:
{
data.enforceInterface(DESCRIPTOR);
com.google.android.auto.mapservice.IBluetoothMapServiceCallbacks _arg0;
_arg0 = com.google.android.auto.mapservice.IBluetoothMapServiceCallbacks.Stub.asInterface(data.readStrongBinder());
android.bluetooth.BluetoothDevice _arg1;
if ((0!=data.readInt())) {
_arg1 = android.bluetooth.BluetoothDevice.CREATOR.createFromParcel(data);
}
else {
_arg1 = null;
}
boolean _result = this.connect(_arg0, _arg1);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_disconnect:
{
data.enforceInterface(DESCRIPTOR);
com.google.android.auto.mapservice.IBluetoothMapServiceCallbacks _arg0;
_arg0 = com.google.android.auto.mapservice.IBluetoothMapServiceCallbacks.Stub.asInterface(data.readStrongBinder());
this.disconnect(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_enableNotifications:
{
data.enforceInterface(DESCRIPTOR);
com.google.android.auto.mapservice.IBluetoothMapServiceCallbacks _arg0;
_arg0 = com.google.android.auto.mapservice.IBluetoothMapServiceCallbacks.Stub.asInterface(data.readStrongBinder());
boolean _arg1;
_arg1 = (0!=data.readInt());
boolean _result = this.enableNotifications(_arg0, _arg1);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_pushMessage:
{
data.enforceInterface(DESCRIPTOR);
com.google.android.auto.mapservice.IBluetoothMapServiceCallbacks _arg0;
_arg0 = com.google.android.auto.mapservice.IBluetoothMapServiceCallbacks.Stub.asInterface(data.readStrongBinder());
com.google.android.auto.mapservice.BluetoothMapMessage _arg1;
if ((0!=data.readInt())) {
_arg1 = com.google.android.auto.mapservice.BluetoothMapMessage.CREATOR.createFromParcel(data);
}
else {
_arg1 = null;
}
boolean _result = this.pushMessage(_arg0, _arg1);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_getMessage:
{
data.enforceInterface(DESCRIPTOR);
com.google.android.auto.mapservice.IBluetoothMapServiceCallbacks _arg0;
_arg0 = com.google.android.auto.mapservice.IBluetoothMapServiceCallbacks.Stub.asInterface(data.readStrongBinder());
java.lang.String _arg1;
_arg1 = data.readString();
boolean _result = this.getMessage(_arg0, _arg1);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_getMessagesListing:
{
data.enforceInterface(DESCRIPTOR);
com.google.android.auto.mapservice.IBluetoothMapServiceCallbacks _arg0;
_arg0 = com.google.android.auto.mapservice.IBluetoothMapServiceCallbacks.Stub.asInterface(data.readStrongBinder());
java.lang.String _arg1;
_arg1 = data.readString();
int _arg2;
_arg2 = data.readInt();
int _arg3;
_arg3 = data.readInt();
boolean _result = this.getMessagesListing(_arg0, _arg1, _arg2, _arg3);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements com.google.android.auto.mapservice.IBluetoothMapService
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
// NOTE: Function calls that return a boolean status indicate the success or failure of the call
// itself. For example a false return status could mean that the service is not connected and
// that the client should not expect a callback (if one was going to be sent back) OR the
// successful execution of the request (for instance delete message).
// Connect a manager with a callback.
// After connect is called any events that happen on remote
// end of MAP protocol (Phone side) will be reported to the client
// (see IBluetoothMapCallbacks interface). Also, ONLY after callback is called should it make
// sense to use the other functions in the protocol here.
// @callback - Callback to receive events from Bluetooth MAP protocol.

@Override public boolean connect(com.google.android.auto.mapservice.IBluetoothMapServiceCallbacks callback, android.bluetooth.BluetoothDevice device) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((callback!=null))?(callback.asBinder()):(null)));
if ((device!=null)) {
_data.writeInt(1);
device.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_connect, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
// Disconnect the client from the service.

@Override public void disconnect(com.google.android.auto.mapservice.IBluetoothMapServiceCallbacks callback) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((callback!=null))?(callback.asBinder()):(null)));
mRemote.transact(Stub.TRANSACTION_disconnect, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
// Enable/Disable notifications.
// @status: Whether to enable or disable the notifications.

@Override public boolean enableNotifications(com.google.android.auto.mapservice.IBluetoothMapServiceCallbacks callbacks, boolean status) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((callbacks!=null))?(callbacks.asBinder()):(null)));
_data.writeInt(((status)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_enableNotifications, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
// Pushes the message to the outbox of remote device.
// Sending message is only supported for text based messages.
// @message - Message to be sent.

@Override public boolean pushMessage(com.google.android.auto.mapservice.IBluetoothMapServiceCallbacks callback, com.google.android.auto.mapservice.BluetoothMapMessage message) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((callback!=null))?(callback.asBinder()):(null)));
if ((message!=null)) {
_data.writeInt(1);
message.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_pushMessage, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
// Fetch a message with a given handle.
// @handle - Handle of the message most likely obtained from a BluetoothMapEventReport object.

@Override public boolean getMessage(com.google.android.auto.mapservice.IBluetoothMapServiceCallbacks callback, java.lang.String handle) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((callback!=null))?(callback.asBinder()):(null)));
_data.writeString(handle);
mRemote.transact(Stub.TRANSACTION_getMessage, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
// Get a listing of message handles.
// @folder - Folder to fetch the messages from.
// @count - Number of messages to fetch, if 0 is provided then no message listings are fetched.
// @offset - When paging (to be done by the client), offset can be provided to fetch further
// messages. Client should be careful of new messages/deletions/message moves which could
// invalidate the paging and it has to be done over.

@Override public boolean getMessagesListing(com.google.android.auto.mapservice.IBluetoothMapServiceCallbacks callback, java.lang.String folder, int count, int offset) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((callback!=null))?(callback.asBinder()):(null)));
_data.writeString(folder);
_data.writeInt(count);
_data.writeInt(offset);
mRemote.transact(Stub.TRANSACTION_getMessagesListing, _data, _reply, 0);
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
static final int TRANSACTION_connect = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_disconnect = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_enableNotifications = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
static final int TRANSACTION_pushMessage = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
static final int TRANSACTION_getMessage = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
static final int TRANSACTION_getMessagesListing = (android.os.IBinder.FIRST_CALL_TRANSACTION + 5);
}
// NOTE: Function calls that return a boolean status indicate the success or failure of the call
// itself. For example a false return status could mean that the service is not connected and
// that the client should not expect a callback (if one was going to be sent back) OR the
// successful execution of the request (for instance delete message).
// Connect a manager with a callback.
// After connect is called any events that happen on remote
// end of MAP protocol (Phone side) will be reported to the client
// (see IBluetoothMapCallbacks interface). Also, ONLY after callback is called should it make
// sense to use the other functions in the protocol here.
// @callback - Callback to receive events from Bluetooth MAP protocol.

public boolean connect(com.google.android.auto.mapservice.IBluetoothMapServiceCallbacks callback, android.bluetooth.BluetoothDevice device) throws android.os.RemoteException;
// Disconnect the client from the service.

public void disconnect(com.google.android.auto.mapservice.IBluetoothMapServiceCallbacks callback) throws android.os.RemoteException;
// Enable/Disable notifications.
// @status: Whether to enable or disable the notifications.

public boolean enableNotifications(com.google.android.auto.mapservice.IBluetoothMapServiceCallbacks callbacks, boolean status) throws android.os.RemoteException;
// Pushes the message to the outbox of remote device.
// Sending message is only supported for text based messages.
// @message - Message to be sent.

public boolean pushMessage(com.google.android.auto.mapservice.IBluetoothMapServiceCallbacks callback, com.google.android.auto.mapservice.BluetoothMapMessage message) throws android.os.RemoteException;
// Fetch a message with a given handle.
// @handle - Handle of the message most likely obtained from a BluetoothMapEventReport object.

public boolean getMessage(com.google.android.auto.mapservice.IBluetoothMapServiceCallbacks callback, java.lang.String handle) throws android.os.RemoteException;
// Get a listing of message handles.
// @folder - Folder to fetch the messages from.
// @count - Number of messages to fetch, if 0 is provided then no message listings are fetched.
// @offset - When paging (to be done by the client), offset can be provided to fetch further
// messages. Client should be careful of new messages/deletions/message moves which could
// invalidate the paging and it has to be done over.

public boolean getMessagesListing(com.google.android.auto.mapservice.IBluetoothMapServiceCallbacks callback, java.lang.String folder, int count, int offset) throws android.os.RemoteException;
}
