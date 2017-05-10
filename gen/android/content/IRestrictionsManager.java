/*___Generated_by_IDEA___*/

/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: /media/li/old/asop/aosp/frameworks/base/core/java/android/content/IRestrictionsManager.aidl
 */
package android.content;
/**
 * Interface used by the RestrictionsManager
 * @hide
 */
public interface IRestrictionsManager extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements android.content.IRestrictionsManager
{
private static final java.lang.String DESCRIPTOR = "android.content.IRestrictionsManager";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an android.content.IRestrictionsManager interface,
 * generating a proxy if needed.
 */
public static android.content.IRestrictionsManager asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof android.content.IRestrictionsManager))) {
return ((android.content.IRestrictionsManager)iin);
}
return new android.content.IRestrictionsManager.Stub.Proxy(obj);
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
case TRANSACTION_getApplicationRestrictions:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
android.os.Bundle _result = this.getApplicationRestrictions(_arg0);
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
case TRANSACTION_hasRestrictionsProvider:
{
data.enforceInterface(DESCRIPTOR);
boolean _result = this.hasRestrictionsProvider();
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_requestPermission:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
java.lang.String _arg1;
_arg1 = data.readString();
java.lang.String _arg2;
_arg2 = data.readString();
android.os.PersistableBundle _arg3;
if ((0!=data.readInt())) {
_arg3 = android.os.PersistableBundle.CREATOR.createFromParcel(data);
}
else {
_arg3 = null;
}
this.requestPermission(_arg0, _arg1, _arg2, _arg3);
reply.writeNoException();
return true;
}
case TRANSACTION_notifyPermissionResponse:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
android.os.PersistableBundle _arg1;
if ((0!=data.readInt())) {
_arg1 = android.os.PersistableBundle.CREATOR.createFromParcel(data);
}
else {
_arg1 = null;
}
this.notifyPermissionResponse(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_createLocalApprovalIntent:
{
data.enforceInterface(DESCRIPTOR);
android.content.Intent _result = this.createLocalApprovalIntent();
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
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements android.content.IRestrictionsManager
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
@Override public android.os.Bundle getApplicationRestrictions(java.lang.String packageName) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
android.os.Bundle _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(packageName);
mRemote.transact(Stub.TRANSACTION_getApplicationRestrictions, _data, _reply, 0);
_reply.readException();
if ((0!=_reply.readInt())) {
_result = android.os.Bundle.CREATOR.createFromParcel(_reply);
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
@Override public boolean hasRestrictionsProvider() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_hasRestrictionsProvider, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public void requestPermission(java.lang.String packageName, java.lang.String requestType, java.lang.String requestId, android.os.PersistableBundle requestData) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(packageName);
_data.writeString(requestType);
_data.writeString(requestId);
if ((requestData!=null)) {
_data.writeInt(1);
requestData.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_requestPermission, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void notifyPermissionResponse(java.lang.String packageName, android.os.PersistableBundle response) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(packageName);
if ((response!=null)) {
_data.writeInt(1);
response.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_notifyPermissionResponse, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public android.content.Intent createLocalApprovalIntent() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
android.content.Intent _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_createLocalApprovalIntent, _data, _reply, 0);
_reply.readException();
if ((0!=_reply.readInt())) {
_result = android.content.Intent.CREATOR.createFromParcel(_reply);
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
}
static final int TRANSACTION_getApplicationRestrictions = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_hasRestrictionsProvider = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_requestPermission = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
static final int TRANSACTION_notifyPermissionResponse = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
static final int TRANSACTION_createLocalApprovalIntent = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
}
public android.os.Bundle getApplicationRestrictions(java.lang.String packageName) throws android.os.RemoteException;
public boolean hasRestrictionsProvider() throws android.os.RemoteException;
public void requestPermission(java.lang.String packageName, java.lang.String requestType, java.lang.String requestId, android.os.PersistableBundle requestData) throws android.os.RemoteException;
public void notifyPermissionResponse(java.lang.String packageName, android.os.PersistableBundle response) throws android.os.RemoteException;
public android.content.Intent createLocalApprovalIntent() throws android.os.RemoteException;
}
