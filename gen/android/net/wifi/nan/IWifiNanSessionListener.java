/*___Generated_by_IDEA___*/

/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: /home/useradmin/aosp7.0.0r3/frameworks/base/wifi/java/android/net/wifi/nan/IWifiNanSessionListener.aidl
 */
package android.net.wifi.nan;
/**
 * Callback interface that WifiNanManager implements
 *
 * {@hide}
 */
public interface IWifiNanSessionListener extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements android.net.wifi.nan.IWifiNanSessionListener
{
private static final java.lang.String DESCRIPTOR = "android.net.wifi.nan.IWifiNanSessionListener";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an android.net.wifi.nan.IWifiNanSessionListener interface,
 * generating a proxy if needed.
 */
public static android.net.wifi.nan.IWifiNanSessionListener asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof android.net.wifi.nan.IWifiNanSessionListener))) {
return ((android.net.wifi.nan.IWifiNanSessionListener)iin);
}
return new android.net.wifi.nan.IWifiNanSessionListener.Stub.Proxy(obj);
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
case TRANSACTION_onPublishFail:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
this.onPublishFail(_arg0);
return true;
}
case TRANSACTION_onPublishTerminated:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
this.onPublishTerminated(_arg0);
return true;
}
case TRANSACTION_onSubscribeFail:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
this.onSubscribeFail(_arg0);
return true;
}
case TRANSACTION_onSubscribeTerminated:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
this.onSubscribeTerminated(_arg0);
return true;
}
case TRANSACTION_onMatch:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
byte[] _arg1;
_arg1 = data.createByteArray();
int _arg2;
_arg2 = data.readInt();
byte[] _arg3;
_arg3 = data.createByteArray();
int _arg4;
_arg4 = data.readInt();
this.onMatch(_arg0, _arg1, _arg2, _arg3, _arg4);
return true;
}
case TRANSACTION_onMessageSendSuccess:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
this.onMessageSendSuccess(_arg0);
return true;
}
case TRANSACTION_onMessageSendFail:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
int _arg1;
_arg1 = data.readInt();
this.onMessageSendFail(_arg0, _arg1);
return true;
}
case TRANSACTION_onMessageReceived:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
byte[] _arg1;
_arg1 = data.createByteArray();
int _arg2;
_arg2 = data.readInt();
this.onMessageReceived(_arg0, _arg1, _arg2);
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements android.net.wifi.nan.IWifiNanSessionListener
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
@Override public void onPublishFail(int reason) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(reason);
mRemote.transact(Stub.TRANSACTION_onPublishFail, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void onPublishTerminated(int reason) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(reason);
mRemote.transact(Stub.TRANSACTION_onPublishTerminated, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void onSubscribeFail(int reason) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(reason);
mRemote.transact(Stub.TRANSACTION_onSubscribeFail, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void onSubscribeTerminated(int reason) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(reason);
mRemote.transact(Stub.TRANSACTION_onSubscribeTerminated, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void onMatch(int peerId, byte[] serviceSpecificInfo, int serviceSpecificInfoLength, byte[] matchFilter, int matchFilterLength) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(peerId);
_data.writeByteArray(serviceSpecificInfo);
_data.writeInt(serviceSpecificInfoLength);
_data.writeByteArray(matchFilter);
_data.writeInt(matchFilterLength);
mRemote.transact(Stub.TRANSACTION_onMatch, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void onMessageSendSuccess(int messageId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(messageId);
mRemote.transact(Stub.TRANSACTION_onMessageSendSuccess, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void onMessageSendFail(int messageId, int reason) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(messageId);
_data.writeInt(reason);
mRemote.transact(Stub.TRANSACTION_onMessageSendFail, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void onMessageReceived(int peerId, byte[] message, int messageLength) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(peerId);
_data.writeByteArray(message);
_data.writeInt(messageLength);
mRemote.transact(Stub.TRANSACTION_onMessageReceived, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
}
static final int TRANSACTION_onPublishFail = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_onPublishTerminated = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_onSubscribeFail = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
static final int TRANSACTION_onSubscribeTerminated = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
static final int TRANSACTION_onMatch = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
static final int TRANSACTION_onMessageSendSuccess = (android.os.IBinder.FIRST_CALL_TRANSACTION + 5);
static final int TRANSACTION_onMessageSendFail = (android.os.IBinder.FIRST_CALL_TRANSACTION + 6);
static final int TRANSACTION_onMessageReceived = (android.os.IBinder.FIRST_CALL_TRANSACTION + 7);
}
public void onPublishFail(int reason) throws android.os.RemoteException;
public void onPublishTerminated(int reason) throws android.os.RemoteException;
public void onSubscribeFail(int reason) throws android.os.RemoteException;
public void onSubscribeTerminated(int reason) throws android.os.RemoteException;
public void onMatch(int peerId, byte[] serviceSpecificInfo, int serviceSpecificInfoLength, byte[] matchFilter, int matchFilterLength) throws android.os.RemoteException;
public void onMessageSendSuccess(int messageId) throws android.os.RemoteException;
public void onMessageSendFail(int messageId, int reason) throws android.os.RemoteException;
public void onMessageReceived(int peerId, byte[] message, int messageLength) throws android.os.RemoteException;
}
