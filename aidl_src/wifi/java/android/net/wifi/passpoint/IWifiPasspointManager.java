/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: frameworks/base/wifi/java/android/net/wifi/passpoint/IWifiPasspointManager.aidl
 */
package android.net.wifi.passpoint;
/**
 * Interface that allows controlling and querying Wifi Passpoint connectivity.
 *
 * {@hide}
 */
public interface IWifiPasspointManager extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements android.net.wifi.passpoint.IWifiPasspointManager
{
private static final java.lang.String DESCRIPTOR = "android.net.wifi.passpoint.IWifiPasspointManager";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an android.net.wifi.passpoint.IWifiPasspointManager interface,
 * generating a proxy if needed.
 */
public static android.net.wifi.passpoint.IWifiPasspointManager asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof android.net.wifi.passpoint.IWifiPasspointManager))) {
return ((android.net.wifi.passpoint.IWifiPasspointManager)iin);
}
return new android.net.wifi.passpoint.IWifiPasspointManager.Stub.Proxy(obj);
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
case TRANSACTION_getMessenger:
{
data.enforceInterface(DESCRIPTOR);
android.os.Messenger _result = this.getMessenger();
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
case TRANSACTION_getPasspointState:
{
data.enforceInterface(DESCRIPTOR);
int _result = this.getPasspointState();
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_requestCredentialMatch:
{
data.enforceInterface(DESCRIPTOR);
java.util.List<android.net.wifi.ScanResult> _arg0;
_arg0 = data.createTypedArrayList(android.net.wifi.ScanResult.CREATOR);
java.util.List<android.net.wifi.passpoint.WifiPasspointPolicy> _result = this.requestCredentialMatch(_arg0);
reply.writeNoException();
reply.writeTypedList(_result);
return true;
}
case TRANSACTION_getCredentials:
{
data.enforceInterface(DESCRIPTOR);
java.util.List<android.net.wifi.passpoint.WifiPasspointCredential> _result = this.getCredentials();
reply.writeNoException();
reply.writeTypedList(_result);
return true;
}
case TRANSACTION_addCredential:
{
data.enforceInterface(DESCRIPTOR);
android.net.wifi.passpoint.WifiPasspointCredential _arg0;
if ((0!=data.readInt())) {
_arg0 = android.net.wifi.passpoint.WifiPasspointCredential.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
boolean _result = this.addCredential(_arg0);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_updateCredential:
{
data.enforceInterface(DESCRIPTOR);
android.net.wifi.passpoint.WifiPasspointCredential _arg0;
if ((0!=data.readInt())) {
_arg0 = android.net.wifi.passpoint.WifiPasspointCredential.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
boolean _result = this.updateCredential(_arg0);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_removeCredential:
{
data.enforceInterface(DESCRIPTOR);
android.net.wifi.passpoint.WifiPasspointCredential _arg0;
if ((0!=data.readInt())) {
_arg0 = android.net.wifi.passpoint.WifiPasspointCredential.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
boolean _result = this.removeCredential(_arg0);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements android.net.wifi.passpoint.IWifiPasspointManager
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
@Override public android.os.Messenger getMessenger() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
android.os.Messenger _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getMessenger, _data, _reply, 0);
_reply.readException();
if ((0!=_reply.readInt())) {
_result = android.os.Messenger.CREATOR.createFromParcel(_reply);
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
@Override public int getPasspointState() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getPasspointState, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public java.util.List<android.net.wifi.passpoint.WifiPasspointPolicy> requestCredentialMatch(java.util.List<android.net.wifi.ScanResult> requested) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.util.List<android.net.wifi.passpoint.WifiPasspointPolicy> _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeTypedList(requested);
mRemote.transact(Stub.TRANSACTION_requestCredentialMatch, _data, _reply, 0);
_reply.readException();
_result = _reply.createTypedArrayList(android.net.wifi.passpoint.WifiPasspointPolicy.CREATOR);
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public java.util.List<android.net.wifi.passpoint.WifiPasspointCredential> getCredentials() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.util.List<android.net.wifi.passpoint.WifiPasspointCredential> _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getCredentials, _data, _reply, 0);
_reply.readException();
_result = _reply.createTypedArrayList(android.net.wifi.passpoint.WifiPasspointCredential.CREATOR);
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public boolean addCredential(android.net.wifi.passpoint.WifiPasspointCredential cred) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((cred!=null)) {
_data.writeInt(1);
cred.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_addCredential, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public boolean updateCredential(android.net.wifi.passpoint.WifiPasspointCredential cred) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((cred!=null)) {
_data.writeInt(1);
cred.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_updateCredential, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public boolean removeCredential(android.net.wifi.passpoint.WifiPasspointCredential cred) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((cred!=null)) {
_data.writeInt(1);
cred.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_removeCredential, _data, _reply, 0);
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
static final int TRANSACTION_getMessenger = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_getPasspointState = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_requestCredentialMatch = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
static final int TRANSACTION_getCredentials = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
static final int TRANSACTION_addCredential = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
static final int TRANSACTION_updateCredential = (android.os.IBinder.FIRST_CALL_TRANSACTION + 5);
static final int TRANSACTION_removeCredential = (android.os.IBinder.FIRST_CALL_TRANSACTION + 6);
}
public android.os.Messenger getMessenger() throws android.os.RemoteException;
public int getPasspointState() throws android.os.RemoteException;
public java.util.List<android.net.wifi.passpoint.WifiPasspointPolicy> requestCredentialMatch(java.util.List<android.net.wifi.ScanResult> requested) throws android.os.RemoteException;
public java.util.List<android.net.wifi.passpoint.WifiPasspointCredential> getCredentials() throws android.os.RemoteException;
public boolean addCredential(android.net.wifi.passpoint.WifiPasspointCredential cred) throws android.os.RemoteException;
public boolean updateCredential(android.net.wifi.passpoint.WifiPasspointCredential cred) throws android.os.RemoteException;
public boolean removeCredential(android.net.wifi.passpoint.WifiPasspointCredential cred) throws android.os.RemoteException;
}
