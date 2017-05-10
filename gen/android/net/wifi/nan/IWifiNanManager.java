/*___Generated_by_IDEA___*/

/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: /home/useradmin/aosp7.0.0r3/frameworks/base/wifi/java/android/net/wifi/nan/IWifiNanManager.aidl
 */
package android.net.wifi.nan;
/**
 * Interface that WifiNanService implements
 *
 * {@hide}
 */
public interface IWifiNanManager extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements android.net.wifi.nan.IWifiNanManager
{
private static final java.lang.String DESCRIPTOR = "android.net.wifi.nan.IWifiNanManager";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an android.net.wifi.nan.IWifiNanManager interface,
 * generating a proxy if needed.
 */
public static android.net.wifi.nan.IWifiNanManager asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof android.net.wifi.nan.IWifiNanManager))) {
return ((android.net.wifi.nan.IWifiNanManager)iin);
}
return new android.net.wifi.nan.IWifiNanManager.Stub.Proxy(obj);
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
android.os.IBinder _arg0;
_arg0 = data.readStrongBinder();
android.net.wifi.nan.IWifiNanEventListener _arg1;
_arg1 = android.net.wifi.nan.IWifiNanEventListener.Stub.asInterface(data.readStrongBinder());
int _arg2;
_arg2 = data.readInt();
this.connect(_arg0, _arg1, _arg2);
reply.writeNoException();
return true;
}
case TRANSACTION_disconnect:
{
data.enforceInterface(DESCRIPTOR);
android.os.IBinder _arg0;
_arg0 = data.readStrongBinder();
this.disconnect(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_requestConfig:
{
data.enforceInterface(DESCRIPTOR);
android.net.wifi.nan.ConfigRequest _arg0;
if ((0!=data.readInt())) {
_arg0 = android.net.wifi.nan.ConfigRequest.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
this.requestConfig(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_createSession:
{
data.enforceInterface(DESCRIPTOR);
android.net.wifi.nan.IWifiNanSessionListener _arg0;
_arg0 = android.net.wifi.nan.IWifiNanSessionListener.Stub.asInterface(data.readStrongBinder());
int _arg1;
_arg1 = data.readInt();
int _result = this.createSession(_arg0, _arg1);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_publish:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
android.net.wifi.nan.PublishData _arg1;
if ((0!=data.readInt())) {
_arg1 = android.net.wifi.nan.PublishData.CREATOR.createFromParcel(data);
}
else {
_arg1 = null;
}
android.net.wifi.nan.PublishSettings _arg2;
if ((0!=data.readInt())) {
_arg2 = android.net.wifi.nan.PublishSettings.CREATOR.createFromParcel(data);
}
else {
_arg2 = null;
}
this.publish(_arg0, _arg1, _arg2);
reply.writeNoException();
return true;
}
case TRANSACTION_subscribe:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
android.net.wifi.nan.SubscribeData _arg1;
if ((0!=data.readInt())) {
_arg1 = android.net.wifi.nan.SubscribeData.CREATOR.createFromParcel(data);
}
else {
_arg1 = null;
}
android.net.wifi.nan.SubscribeSettings _arg2;
if ((0!=data.readInt())) {
_arg2 = android.net.wifi.nan.SubscribeSettings.CREATOR.createFromParcel(data);
}
else {
_arg2 = null;
}
this.subscribe(_arg0, _arg1, _arg2);
reply.writeNoException();
return true;
}
case TRANSACTION_sendMessage:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
int _arg1;
_arg1 = data.readInt();
byte[] _arg2;
_arg2 = data.createByteArray();
int _arg3;
_arg3 = data.readInt();
int _arg4;
_arg4 = data.readInt();
this.sendMessage(_arg0, _arg1, _arg2, _arg3, _arg4);
reply.writeNoException();
return true;
}
case TRANSACTION_stopSession:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
this.stopSession(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_destroySession:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
this.destroySession(_arg0);
reply.writeNoException();
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements android.net.wifi.nan.IWifiNanManager
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
// client API

@Override public void connect(android.os.IBinder binder, android.net.wifi.nan.IWifiNanEventListener listener, int events) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder(binder);
_data.writeStrongBinder((((listener!=null))?(listener.asBinder()):(null)));
_data.writeInt(events);
mRemote.transact(Stub.TRANSACTION_connect, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void disconnect(android.os.IBinder binder) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder(binder);
mRemote.transact(Stub.TRANSACTION_disconnect, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void requestConfig(android.net.wifi.nan.ConfigRequest configRequest) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((configRequest!=null)) {
_data.writeInt(1);
configRequest.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_requestConfig, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public int createSession(android.net.wifi.nan.IWifiNanSessionListener listener, int events) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((listener!=null))?(listener.asBinder()):(null)));
_data.writeInt(events);
mRemote.transact(Stub.TRANSACTION_createSession, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public void publish(int sessionId, android.net.wifi.nan.PublishData publishData, android.net.wifi.nan.PublishSettings publishSettings) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(sessionId);
if ((publishData!=null)) {
_data.writeInt(1);
publishData.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
if ((publishSettings!=null)) {
_data.writeInt(1);
publishSettings.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_publish, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void subscribe(int sessionId, android.net.wifi.nan.SubscribeData subscribeData, android.net.wifi.nan.SubscribeSettings subscribeSettings) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(sessionId);
if ((subscribeData!=null)) {
_data.writeInt(1);
subscribeData.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
if ((subscribeSettings!=null)) {
_data.writeInt(1);
subscribeSettings.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_subscribe, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void sendMessage(int sessionId, int peerId, byte[] message, int messageLength, int messageId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(sessionId);
_data.writeInt(peerId);
_data.writeByteArray(message);
_data.writeInt(messageLength);
_data.writeInt(messageId);
mRemote.transact(Stub.TRANSACTION_sendMessage, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void stopSession(int sessionId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(sessionId);
mRemote.transact(Stub.TRANSACTION_stopSession, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void destroySession(int sessionId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(sessionId);
mRemote.transact(Stub.TRANSACTION_destroySession, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
}
static final int TRANSACTION_connect = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_disconnect = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_requestConfig = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
static final int TRANSACTION_createSession = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
static final int TRANSACTION_publish = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
static final int TRANSACTION_subscribe = (android.os.IBinder.FIRST_CALL_TRANSACTION + 5);
static final int TRANSACTION_sendMessage = (android.os.IBinder.FIRST_CALL_TRANSACTION + 6);
static final int TRANSACTION_stopSession = (android.os.IBinder.FIRST_CALL_TRANSACTION + 7);
static final int TRANSACTION_destroySession = (android.os.IBinder.FIRST_CALL_TRANSACTION + 8);
}
// client API

public void connect(android.os.IBinder binder, android.net.wifi.nan.IWifiNanEventListener listener, int events) throws android.os.RemoteException;
public void disconnect(android.os.IBinder binder) throws android.os.RemoteException;
public void requestConfig(android.net.wifi.nan.ConfigRequest configRequest) throws android.os.RemoteException;
public int createSession(android.net.wifi.nan.IWifiNanSessionListener listener, int events) throws android.os.RemoteException;
public void publish(int sessionId, android.net.wifi.nan.PublishData publishData, android.net.wifi.nan.PublishSettings publishSettings) throws android.os.RemoteException;
public void subscribe(int sessionId, android.net.wifi.nan.SubscribeData subscribeData, android.net.wifi.nan.SubscribeSettings subscribeSettings) throws android.os.RemoteException;
public void sendMessage(int sessionId, int peerId, byte[] message, int messageLength, int messageId) throws android.os.RemoteException;
public void stopSession(int sessionId) throws android.os.RemoteException;
public void destroySession(int sessionId) throws android.os.RemoteException;
}
