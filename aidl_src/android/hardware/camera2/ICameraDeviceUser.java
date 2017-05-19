/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: frameworks/base/core/java/android/hardware/camera2/ICameraDeviceUser.aidl
 */
package android.hardware.camera2;
/** @hide */
public interface ICameraDeviceUser extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements android.hardware.camera2.ICameraDeviceUser
{
private static final java.lang.String DESCRIPTOR = "android.hardware.camera2.ICameraDeviceUser";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an android.hardware.camera2.ICameraDeviceUser interface,
 * generating a proxy if needed.
 */
public static android.hardware.camera2.ICameraDeviceUser asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof android.hardware.camera2.ICameraDeviceUser))) {
return ((android.hardware.camera2.ICameraDeviceUser)iin);
}
return new android.hardware.camera2.ICameraDeviceUser.Stub.Proxy(obj);
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
case TRANSACTION_disconnect:
{
data.enforceInterface(DESCRIPTOR);
this.disconnect();
reply.writeNoException();
return true;
}
case TRANSACTION_submitRequest:
{
data.enforceInterface(DESCRIPTOR);
android.hardware.camera2.CaptureRequest _arg0;
if ((0!=data.readInt())) {
_arg0 = android.hardware.camera2.CaptureRequest.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
boolean _arg1;
_arg1 = (0!=data.readInt());
android.hardware.camera2.utils.LongParcelable _arg2;
_arg2 = new android.hardware.camera2.utils.LongParcelable();
int _result = this.submitRequest(_arg0, _arg1, _arg2);
reply.writeNoException();
reply.writeInt(_result);
if ((_arg2!=null)) {
reply.writeInt(1);
_arg2.writeToParcel(reply, android.os.Parcelable.PARCELABLE_WRITE_RETURN_VALUE);
}
else {
reply.writeInt(0);
}
return true;
}
case TRANSACTION_submitRequestList:
{
data.enforceInterface(DESCRIPTOR);
java.util.List<android.hardware.camera2.CaptureRequest> _arg0;
_arg0 = data.createTypedArrayList(android.hardware.camera2.CaptureRequest.CREATOR);
boolean _arg1;
_arg1 = (0!=data.readInt());
android.hardware.camera2.utils.LongParcelable _arg2;
_arg2 = new android.hardware.camera2.utils.LongParcelable();
int _result = this.submitRequestList(_arg0, _arg1, _arg2);
reply.writeNoException();
reply.writeInt(_result);
if ((_arg2!=null)) {
reply.writeInt(1);
_arg2.writeToParcel(reply, android.os.Parcelable.PARCELABLE_WRITE_RETURN_VALUE);
}
else {
reply.writeInt(0);
}
return true;
}
case TRANSACTION_cancelRequest:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
android.hardware.camera2.utils.LongParcelable _arg1;
_arg1 = new android.hardware.camera2.utils.LongParcelable();
int _result = this.cancelRequest(_arg0, _arg1);
reply.writeNoException();
reply.writeInt(_result);
if ((_arg1!=null)) {
reply.writeInt(1);
_arg1.writeToParcel(reply, android.os.Parcelable.PARCELABLE_WRITE_RETURN_VALUE);
}
else {
reply.writeInt(0);
}
return true;
}
case TRANSACTION_beginConfigure:
{
data.enforceInterface(DESCRIPTOR);
int _result = this.beginConfigure();
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_endConfigure:
{
data.enforceInterface(DESCRIPTOR);
boolean _arg0;
_arg0 = (0!=data.readInt());
int _result = this.endConfigure(_arg0);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_deleteStream:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
int _result = this.deleteStream(_arg0);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_createStream:
{
data.enforceInterface(DESCRIPTOR);
android.hardware.camera2.params.OutputConfiguration _arg0;
if ((0!=data.readInt())) {
_arg0 = android.hardware.camera2.params.OutputConfiguration.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
int _result = this.createStream(_arg0);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_createInputStream:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
int _arg1;
_arg1 = data.readInt();
int _arg2;
_arg2 = data.readInt();
int _result = this.createInputStream(_arg0, _arg1, _arg2);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_getInputSurface:
{
data.enforceInterface(DESCRIPTOR);
android.view.Surface _arg0;
_arg0 = new android.view.Surface();
int _result = this.getInputSurface(_arg0);
reply.writeNoException();
reply.writeInt(_result);
if ((_arg0!=null)) {
reply.writeInt(1);
_arg0.writeToParcel(reply, android.os.Parcelable.PARCELABLE_WRITE_RETURN_VALUE);
}
else {
reply.writeInt(0);
}
return true;
}
case TRANSACTION_createDefaultRequest:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
android.hardware.camera2.impl.CameraMetadataNative _arg1;
_arg1 = new android.hardware.camera2.impl.CameraMetadataNative();
int _result = this.createDefaultRequest(_arg0, _arg1);
reply.writeNoException();
reply.writeInt(_result);
if ((_arg1!=null)) {
reply.writeInt(1);
_arg1.writeToParcel(reply, android.os.Parcelable.PARCELABLE_WRITE_RETURN_VALUE);
}
else {
reply.writeInt(0);
}
return true;
}
case TRANSACTION_getCameraInfo:
{
data.enforceInterface(DESCRIPTOR);
android.hardware.camera2.impl.CameraMetadataNative _arg0;
_arg0 = new android.hardware.camera2.impl.CameraMetadataNative();
int _result = this.getCameraInfo(_arg0);
reply.writeNoException();
reply.writeInt(_result);
if ((_arg0!=null)) {
reply.writeInt(1);
_arg0.writeToParcel(reply, android.os.Parcelable.PARCELABLE_WRITE_RETURN_VALUE);
}
else {
reply.writeInt(0);
}
return true;
}
case TRANSACTION_waitUntilIdle:
{
data.enforceInterface(DESCRIPTOR);
int _result = this.waitUntilIdle();
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_flush:
{
data.enforceInterface(DESCRIPTOR);
android.hardware.camera2.utils.LongParcelable _arg0;
_arg0 = new android.hardware.camera2.utils.LongParcelable();
int _result = this.flush(_arg0);
reply.writeNoException();
reply.writeInt(_result);
if ((_arg0!=null)) {
reply.writeInt(1);
_arg0.writeToParcel(reply, android.os.Parcelable.PARCELABLE_WRITE_RETURN_VALUE);
}
else {
reply.writeInt(0);
}
return true;
}
case TRANSACTION_prepare:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
int _result = this.prepare(_arg0);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_tearDown:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
int _result = this.tearDown(_arg0);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_prepare2:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
int _arg1;
_arg1 = data.readInt();
int _result = this.prepare2(_arg0, _arg1);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements android.hardware.camera2.ICameraDeviceUser
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
/**
     * Keep up-to-date with frameworks/av/include/camera/camera2/ICameraDeviceUser.h and
     * frameworks/base/core/java/android/hardware/camera2/legacy/CameraDeviceUserShim.java
     */
@Override public void disconnect() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_disconnect, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
// ints here are status_t
// non-negative value is the requestId. negative value is status_t

@Override public int submitRequest(android.hardware.camera2.CaptureRequest request, boolean streaming, android.hardware.camera2.utils.LongParcelable lastFrameNumber) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((request!=null)) {
_data.writeInt(1);
request.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeInt(((streaming)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_submitRequest, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
if ((0!=_reply.readInt())) {
lastFrameNumber.readFromParcel(_reply);
}
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public int submitRequestList(java.util.List<android.hardware.camera2.CaptureRequest> requestList, boolean streaming, android.hardware.camera2.utils.LongParcelable lastFrameNumber) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeTypedList(requestList);
_data.writeInt(((streaming)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_submitRequestList, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
if ((0!=_reply.readInt())) {
lastFrameNumber.readFromParcel(_reply);
}
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public int cancelRequest(int requestId, android.hardware.camera2.utils.LongParcelable lastFrameNumber) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(requestId);
mRemote.transact(Stub.TRANSACTION_cancelRequest, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
if ((0!=_reply.readInt())) {
lastFrameNumber.readFromParcel(_reply);
}
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/**
     * Begin the device configuration.
     *
     * <p>
     * beginConfigure must be called before any call to deleteStream, createStream,
     * or endConfigure.  It is not valid to call this when the device is not idle.
     * <p>
     */
@Override public int beginConfigure() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_beginConfigure, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/**
     * End the device configuration.
     *
     * <p>
     * endConfigure must be called after stream configuration is complete (i.e. after
     * a call to beginConfigure and subsequent createStream/deleteStream calls).  This
     * must be called before any requests can be submitted.
     * <p>
     */
@Override public int endConfigure(boolean isConstrainedHighSpeed) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(((isConstrainedHighSpeed)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_endConfigure, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public int deleteStream(int streamId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(streamId);
mRemote.transact(Stub.TRANSACTION_deleteStream, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
// non-negative value is the stream ID. negative value is status_t

@Override public int createStream(android.hardware.camera2.params.OutputConfiguration outputConfiguration) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((outputConfiguration!=null)) {
_data.writeInt(1);
outputConfiguration.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_createStream, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/**
     * Create an input stream
     *
     * <p>Create an input stream of width, height, and format</p>
     *
     * @param width Width of the input buffers
     * @param height Height of the input buffers
     * @param format Format of the input buffers. One of HAL_PIXEL_FORMAT_*.
     *
     * @return stream ID if it's a non-negative value. status_t if it's a negative value.
     */
@Override public int createInputStream(int width, int height, int format) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(width);
_data.writeInt(height);
_data.writeInt(format);
mRemote.transact(Stub.TRANSACTION_createInputStream, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/**
     * Get the surface of the input stream.
     *
     * <p>It's valid to call this method only after a stream configuration is completed
     * successfully and the stream configuration includes a input stream.</p>
     *
     * @param surface An output argument for the surface of the input stream buffer queue.
     */
@Override public int getInputSurface(android.view.Surface surface) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getInputSurface, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
if ((0!=_reply.readInt())) {
surface.readFromParcel(_reply);
}
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public int createDefaultRequest(int templateId, android.hardware.camera2.impl.CameraMetadataNative request) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(templateId);
mRemote.transact(Stub.TRANSACTION_createDefaultRequest, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
if ((0!=_reply.readInt())) {
request.readFromParcel(_reply);
}
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public int getCameraInfo(android.hardware.camera2.impl.CameraMetadataNative info) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getCameraInfo, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
if ((0!=_reply.readInt())) {
info.readFromParcel(_reply);
}
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public int waitUntilIdle() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_waitUntilIdle, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public int flush(android.hardware.camera2.utils.LongParcelable lastFrameNumber) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_flush, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
if ((0!=_reply.readInt())) {
lastFrameNumber.readFromParcel(_reply);
}
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public int prepare(int streamId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(streamId);
mRemote.transact(Stub.TRANSACTION_prepare, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public int tearDown(int streamId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(streamId);
mRemote.transact(Stub.TRANSACTION_tearDown, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public int prepare2(int maxCount, int streamId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(maxCount);
_data.writeInt(streamId);
mRemote.transact(Stub.TRANSACTION_prepare2, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
}
static final int TRANSACTION_disconnect = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_submitRequest = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_submitRequestList = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
static final int TRANSACTION_cancelRequest = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
static final int TRANSACTION_beginConfigure = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
static final int TRANSACTION_endConfigure = (android.os.IBinder.FIRST_CALL_TRANSACTION + 5);
static final int TRANSACTION_deleteStream = (android.os.IBinder.FIRST_CALL_TRANSACTION + 6);
static final int TRANSACTION_createStream = (android.os.IBinder.FIRST_CALL_TRANSACTION + 7);
static final int TRANSACTION_createInputStream = (android.os.IBinder.FIRST_CALL_TRANSACTION + 8);
static final int TRANSACTION_getInputSurface = (android.os.IBinder.FIRST_CALL_TRANSACTION + 9);
static final int TRANSACTION_createDefaultRequest = (android.os.IBinder.FIRST_CALL_TRANSACTION + 10);
static final int TRANSACTION_getCameraInfo = (android.os.IBinder.FIRST_CALL_TRANSACTION + 11);
static final int TRANSACTION_waitUntilIdle = (android.os.IBinder.FIRST_CALL_TRANSACTION + 12);
static final int TRANSACTION_flush = (android.os.IBinder.FIRST_CALL_TRANSACTION + 13);
static final int TRANSACTION_prepare = (android.os.IBinder.FIRST_CALL_TRANSACTION + 14);
static final int TRANSACTION_tearDown = (android.os.IBinder.FIRST_CALL_TRANSACTION + 15);
static final int TRANSACTION_prepare2 = (android.os.IBinder.FIRST_CALL_TRANSACTION + 16);
}
/**
     * Keep up-to-date with frameworks/av/include/camera/camera2/ICameraDeviceUser.h and
     * frameworks/base/core/java/android/hardware/camera2/legacy/CameraDeviceUserShim.java
     */
public void disconnect() throws android.os.RemoteException;
// ints here are status_t
// non-negative value is the requestId. negative value is status_t

public int submitRequest(android.hardware.camera2.CaptureRequest request, boolean streaming, android.hardware.camera2.utils.LongParcelable lastFrameNumber) throws android.os.RemoteException;
public int submitRequestList(java.util.List<android.hardware.camera2.CaptureRequest> requestList, boolean streaming, android.hardware.camera2.utils.LongParcelable lastFrameNumber) throws android.os.RemoteException;
public int cancelRequest(int requestId, android.hardware.camera2.utils.LongParcelable lastFrameNumber) throws android.os.RemoteException;
/**
     * Begin the device configuration.
     *
     * <p>
     * beginConfigure must be called before any call to deleteStream, createStream,
     * or endConfigure.  It is not valid to call this when the device is not idle.
     * <p>
     */
public int beginConfigure() throws android.os.RemoteException;
/**
     * End the device configuration.
     *
     * <p>
     * endConfigure must be called after stream configuration is complete (i.e. after
     * a call to beginConfigure and subsequent createStream/deleteStream calls).  This
     * must be called before any requests can be submitted.
     * <p>
     */
public int endConfigure(boolean isConstrainedHighSpeed) throws android.os.RemoteException;
public int deleteStream(int streamId) throws android.os.RemoteException;
// non-negative value is the stream ID. negative value is status_t

public int createStream(android.hardware.camera2.params.OutputConfiguration outputConfiguration) throws android.os.RemoteException;
/**
     * Create an input stream
     *
     * <p>Create an input stream of width, height, and format</p>
     *
     * @param width Width of the input buffers
     * @param height Height of the input buffers
     * @param format Format of the input buffers. One of HAL_PIXEL_FORMAT_*.
     *
     * @return stream ID if it's a non-negative value. status_t if it's a negative value.
     */
public int createInputStream(int width, int height, int format) throws android.os.RemoteException;
/**
     * Get the surface of the input stream.
     *
     * <p>It's valid to call this method only after a stream configuration is completed
     * successfully and the stream configuration includes a input stream.</p>
     *
     * @param surface An output argument for the surface of the input stream buffer queue.
     */
public int getInputSurface(android.view.Surface surface) throws android.os.RemoteException;
public int createDefaultRequest(int templateId, android.hardware.camera2.impl.CameraMetadataNative request) throws android.os.RemoteException;
public int getCameraInfo(android.hardware.camera2.impl.CameraMetadataNative info) throws android.os.RemoteException;
public int waitUntilIdle() throws android.os.RemoteException;
public int flush(android.hardware.camera2.utils.LongParcelable lastFrameNumber) throws android.os.RemoteException;
public int prepare(int streamId) throws android.os.RemoteException;
public int tearDown(int streamId) throws android.os.RemoteException;
public int prepare2(int maxCount, int streamId) throws android.os.RemoteException;
}
