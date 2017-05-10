/*___Generated_by_IDEA___*/

/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: /home/useradmin/aosp7.0.0r3/frameworks/base/core/java/com/android/internal/app/ISoundTriggerService.aidl
 */
package com.android.internal.app;
/**
 * Service interface for a generic sound recognition model.
 * @hide
 */
public interface ISoundTriggerService extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements com.android.internal.app.ISoundTriggerService
{
private static final java.lang.String DESCRIPTOR = "com.android.internal.app.ISoundTriggerService";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an com.android.internal.app.ISoundTriggerService interface,
 * generating a proxy if needed.
 */
public static com.android.internal.app.ISoundTriggerService asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof com.android.internal.app.ISoundTriggerService))) {
return ((com.android.internal.app.ISoundTriggerService)iin);
}
return new com.android.internal.app.ISoundTriggerService.Stub.Proxy(obj);
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
case TRANSACTION_getSoundModel:
{
data.enforceInterface(DESCRIPTOR);
android.os.ParcelUuid _arg0;
if ((0!=data.readInt())) {
_arg0 = android.os.ParcelUuid.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
android.hardware.soundtrigger.SoundTrigger.GenericSoundModel _result = this.getSoundModel(_arg0);
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
case TRANSACTION_updateSoundModel:
{
data.enforceInterface(DESCRIPTOR);
android.hardware.soundtrigger.SoundTrigger.GenericSoundModel _arg0;
if ((0!=data.readInt())) {
_arg0 = android.hardware.soundtrigger.SoundTrigger.GenericSoundModel.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
this.updateSoundModel(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_deleteSoundModel:
{
data.enforceInterface(DESCRIPTOR);
android.os.ParcelUuid _arg0;
if ((0!=data.readInt())) {
_arg0 = android.os.ParcelUuid.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
this.deleteSoundModel(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_startRecognition:
{
data.enforceInterface(DESCRIPTOR);
android.os.ParcelUuid _arg0;
if ((0!=data.readInt())) {
_arg0 = android.os.ParcelUuid.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
android.hardware.soundtrigger.IRecognitionStatusCallback _arg1;
_arg1 = android.hardware.soundtrigger.IRecognitionStatusCallback.Stub.asInterface(data.readStrongBinder());
android.hardware.soundtrigger.SoundTrigger.RecognitionConfig _arg2;
if ((0!=data.readInt())) {
_arg2 = android.hardware.soundtrigger.SoundTrigger.RecognitionConfig.CREATOR.createFromParcel(data);
}
else {
_arg2 = null;
}
int _result = this.startRecognition(_arg0, _arg1, _arg2);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_stopRecognition:
{
data.enforceInterface(DESCRIPTOR);
android.os.ParcelUuid _arg0;
if ((0!=data.readInt())) {
_arg0 = android.os.ParcelUuid.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
android.hardware.soundtrigger.IRecognitionStatusCallback _arg1;
_arg1 = android.hardware.soundtrigger.IRecognitionStatusCallback.Stub.asInterface(data.readStrongBinder());
int _result = this.stopRecognition(_arg0, _arg1);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements com.android.internal.app.ISoundTriggerService
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
@Override public android.hardware.soundtrigger.SoundTrigger.GenericSoundModel getSoundModel(android.os.ParcelUuid soundModelId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
android.hardware.soundtrigger.SoundTrigger.GenericSoundModel _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((soundModelId!=null)) {
_data.writeInt(1);
soundModelId.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_getSoundModel, _data, _reply, 0);
_reply.readException();
if ((0!=_reply.readInt())) {
_result = android.hardware.soundtrigger.SoundTrigger.GenericSoundModel.CREATOR.createFromParcel(_reply);
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
@Override public void updateSoundModel(android.hardware.soundtrigger.SoundTrigger.GenericSoundModel soundModel) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((soundModel!=null)) {
_data.writeInt(1);
soundModel.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_updateSoundModel, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void deleteSoundModel(android.os.ParcelUuid soundModelId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((soundModelId!=null)) {
_data.writeInt(1);
soundModelId.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_deleteSoundModel, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public int startRecognition(android.os.ParcelUuid soundModelId, android.hardware.soundtrigger.IRecognitionStatusCallback callback, android.hardware.soundtrigger.SoundTrigger.RecognitionConfig config) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((soundModelId!=null)) {
_data.writeInt(1);
soundModelId.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeStrongBinder((((callback!=null))?(callback.asBinder()):(null)));
if ((config!=null)) {
_data.writeInt(1);
config.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_startRecognition, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public int stopRecognition(android.os.ParcelUuid soundModelId, android.hardware.soundtrigger.IRecognitionStatusCallback callback) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((soundModelId!=null)) {
_data.writeInt(1);
soundModelId.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeStrongBinder((((callback!=null))?(callback.asBinder()):(null)));
mRemote.transact(Stub.TRANSACTION_stopRecognition, _data, _reply, 0);
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
static final int TRANSACTION_getSoundModel = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_updateSoundModel = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_deleteSoundModel = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
static final int TRANSACTION_startRecognition = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
static final int TRANSACTION_stopRecognition = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
}
public android.hardware.soundtrigger.SoundTrigger.GenericSoundModel getSoundModel(android.os.ParcelUuid soundModelId) throws android.os.RemoteException;
public void updateSoundModel(android.hardware.soundtrigger.SoundTrigger.GenericSoundModel soundModel) throws android.os.RemoteException;
public void deleteSoundModel(android.os.ParcelUuid soundModelId) throws android.os.RemoteException;
public int startRecognition(android.os.ParcelUuid soundModelId, android.hardware.soundtrigger.IRecognitionStatusCallback callback, android.hardware.soundtrigger.SoundTrigger.RecognitionConfig config) throws android.os.RemoteException;
public int stopRecognition(android.os.ParcelUuid soundModelId, android.hardware.soundtrigger.IRecognitionStatusCallback callback) throws android.os.RemoteException;
}
