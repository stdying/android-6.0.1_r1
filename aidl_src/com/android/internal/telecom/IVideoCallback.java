/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: frameworks/base/telecomm/java/com/android/internal/telecom/IVideoCallback.aidl
 */
package com.android.internal.telecom;
/**
  * Internal definition of a callback interface, used for an InCallUi to respond to video
  * telephony changes.
  *
  * @see android.telecom.InCallService.VideoCall.Listener
  *
  * {@hide}
  */
public interface IVideoCallback extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements com.android.internal.telecom.IVideoCallback
{
private static final java.lang.String DESCRIPTOR = "com.android.internal.telecom.IVideoCallback";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an com.android.internal.telecom.IVideoCallback interface,
 * generating a proxy if needed.
 */
public static com.android.internal.telecom.IVideoCallback asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof com.android.internal.telecom.IVideoCallback))) {
return ((com.android.internal.telecom.IVideoCallback)iin);
}
return new com.android.internal.telecom.IVideoCallback.Stub.Proxy(obj);
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
case TRANSACTION_receiveSessionModifyRequest:
{
data.enforceInterface(DESCRIPTOR);
android.telecom.VideoProfile _arg0;
if ((0!=data.readInt())) {
_arg0 = android.telecom.VideoProfile.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
this.receiveSessionModifyRequest(_arg0);
return true;
}
case TRANSACTION_receiveSessionModifyResponse:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
android.telecom.VideoProfile _arg1;
if ((0!=data.readInt())) {
_arg1 = android.telecom.VideoProfile.CREATOR.createFromParcel(data);
}
else {
_arg1 = null;
}
android.telecom.VideoProfile _arg2;
if ((0!=data.readInt())) {
_arg2 = android.telecom.VideoProfile.CREATOR.createFromParcel(data);
}
else {
_arg2 = null;
}
this.receiveSessionModifyResponse(_arg0, _arg1, _arg2);
return true;
}
case TRANSACTION_handleCallSessionEvent:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
this.handleCallSessionEvent(_arg0);
return true;
}
case TRANSACTION_changePeerDimensions:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
int _arg1;
_arg1 = data.readInt();
this.changePeerDimensions(_arg0, _arg1);
return true;
}
case TRANSACTION_changeCallDataUsage:
{
data.enforceInterface(DESCRIPTOR);
long _arg0;
_arg0 = data.readLong();
this.changeCallDataUsage(_arg0);
return true;
}
case TRANSACTION_changeCameraCapabilities:
{
data.enforceInterface(DESCRIPTOR);
android.telecom.VideoProfile.CameraCapabilities _arg0;
if ((0!=data.readInt())) {
_arg0 = android.telecom.VideoProfile.CameraCapabilities.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
this.changeCameraCapabilities(_arg0);
return true;
}
case TRANSACTION_changeVideoQuality:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
this.changeVideoQuality(_arg0);
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements com.android.internal.telecom.IVideoCallback
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
@Override public void receiveSessionModifyRequest(android.telecom.VideoProfile videoProfile) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((videoProfile!=null)) {
_data.writeInt(1);
videoProfile.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_receiveSessionModifyRequest, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void receiveSessionModifyResponse(int status, android.telecom.VideoProfile requestedProfile, android.telecom.VideoProfile responseProfile) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(status);
if ((requestedProfile!=null)) {
_data.writeInt(1);
requestedProfile.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
if ((responseProfile!=null)) {
_data.writeInt(1);
responseProfile.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_receiveSessionModifyResponse, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void handleCallSessionEvent(int event) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(event);
mRemote.transact(Stub.TRANSACTION_handleCallSessionEvent, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void changePeerDimensions(int width, int height) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(width);
_data.writeInt(height);
mRemote.transact(Stub.TRANSACTION_changePeerDimensions, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void changeCallDataUsage(long dataUsage) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeLong(dataUsage);
mRemote.transact(Stub.TRANSACTION_changeCallDataUsage, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void changeCameraCapabilities(android.telecom.VideoProfile.CameraCapabilities cameraCapabilities) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((cameraCapabilities!=null)) {
_data.writeInt(1);
cameraCapabilities.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_changeCameraCapabilities, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void changeVideoQuality(int videoQuality) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(videoQuality);
mRemote.transact(Stub.TRANSACTION_changeVideoQuality, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
}
static final int TRANSACTION_receiveSessionModifyRequest = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_receiveSessionModifyResponse = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_handleCallSessionEvent = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
static final int TRANSACTION_changePeerDimensions = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
static final int TRANSACTION_changeCallDataUsage = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
static final int TRANSACTION_changeCameraCapabilities = (android.os.IBinder.FIRST_CALL_TRANSACTION + 5);
static final int TRANSACTION_changeVideoQuality = (android.os.IBinder.FIRST_CALL_TRANSACTION + 6);
}
public void receiveSessionModifyRequest(android.telecom.VideoProfile videoProfile) throws android.os.RemoteException;
public void receiveSessionModifyResponse(int status, android.telecom.VideoProfile requestedProfile, android.telecom.VideoProfile responseProfile) throws android.os.RemoteException;
public void handleCallSessionEvent(int event) throws android.os.RemoteException;
public void changePeerDimensions(int width, int height) throws android.os.RemoteException;
public void changeCallDataUsage(long dataUsage) throws android.os.RemoteException;
public void changeCameraCapabilities(android.telecom.VideoProfile.CameraCapabilities cameraCapabilities) throws android.os.RemoteException;
public void changeVideoQuality(int videoQuality) throws android.os.RemoteException;
}
