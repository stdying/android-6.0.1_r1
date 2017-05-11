/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: frameworks/base/telephony/java/com/android/ims/internal/IImsRegistrationListener.aidl
 */
package com.android.ims.internal;
/**
 * A listener type for receiving notifications about the changes to
 * the IMS connection(registration).
 *
 * {@hide}
 */
public interface IImsRegistrationListener extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements com.android.ims.internal.IImsRegistrationListener
{
private static final java.lang.String DESCRIPTOR = "com.android.ims.internal.IImsRegistrationListener";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an com.android.ims.internal.IImsRegistrationListener interface,
 * generating a proxy if needed.
 */
public static com.android.ims.internal.IImsRegistrationListener asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof com.android.ims.internal.IImsRegistrationListener))) {
return ((com.android.ims.internal.IImsRegistrationListener)iin);
}
return new com.android.ims.internal.IImsRegistrationListener.Stub.Proxy(obj);
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
case TRANSACTION_registrationConnected:
{
data.enforceInterface(DESCRIPTOR);
this.registrationConnected();
reply.writeNoException();
return true;
}
case TRANSACTION_registrationProgressing:
{
data.enforceInterface(DESCRIPTOR);
this.registrationProgressing();
reply.writeNoException();
return true;
}
case TRANSACTION_registrationDisconnected:
{
data.enforceInterface(DESCRIPTOR);
com.android.ims.ImsReasonInfo _arg0;
if ((0!=data.readInt())) {
_arg0 = com.android.ims.ImsReasonInfo.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
this.registrationDisconnected(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_registrationResumed:
{
data.enforceInterface(DESCRIPTOR);
this.registrationResumed();
reply.writeNoException();
return true;
}
case TRANSACTION_registrationSuspended:
{
data.enforceInterface(DESCRIPTOR);
this.registrationSuspended();
reply.writeNoException();
return true;
}
case TRANSACTION_registrationServiceCapabilityChanged:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
int _arg1;
_arg1 = data.readInt();
this.registrationServiceCapabilityChanged(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_registrationFeatureCapabilityChanged:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
int[] _arg1;
_arg1 = data.createIntArray();
int[] _arg2;
_arg2 = data.createIntArray();
this.registrationFeatureCapabilityChanged(_arg0, _arg1, _arg2);
reply.writeNoException();
return true;
}
case TRANSACTION_voiceMessageCountUpdate:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
this.voiceMessageCountUpdate(_arg0);
reply.writeNoException();
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements com.android.ims.internal.IImsRegistrationListener
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
     * Notifies the application when the device is connected to the IMS network.
     */
@Override public void registrationConnected() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_registrationConnected, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/**
     * Notifies the application when the device is trying to connect the IMS network.
     */
@Override public void registrationProgressing() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_registrationProgressing, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/**
     * Notifies the application when the device is disconnected from the IMS network.
     */
@Override public void registrationDisconnected(com.android.ims.ImsReasonInfo imsReasonInfo) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((imsReasonInfo!=null)) {
_data.writeInt(1);
imsReasonInfo.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_registrationDisconnected, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/**
     * Notifies the application when its suspended IMS connection is resumed,
     * meaning the connection now allows throughput.
     */
@Override public void registrationResumed() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_registrationResumed, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/**
     * Notifies the application when its current IMS connection is suspended,
     * meaning there is no data throughput.
     */
@Override public void registrationSuspended() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_registrationSuspended, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/**
     * Notifies the application when its current IMS connection is updated
     * since the service setting is changed or the service is added/removed.
     *
     * @param serviceClass a service class specified in {@link ImsServiceClass}
     * @param event an event type when this callback is called
     *    If {@code event} is 0, meaning the specified service is removed from the IMS connection.
     *    Else ({@code event} is 1), meaning the specified service is added to the IMS connection.
     */
@Override public void registrationServiceCapabilityChanged(int serviceClass, int event) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(serviceClass);
_data.writeInt(event);
mRemote.transact(Stub.TRANSACTION_registrationServiceCapabilityChanged, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/**
     * Notifies the application when features on a particular service enabled or
     * disabled successfully based on user preferences.
     *
     * @param serviceClass a service class specified in {@link ImsServiceClass}
     * @param enabledFeatures features enabled as defined in com.android.ims.ImsConfig#FeatureConstants.
     * @param disabledFeatures features disabled as defined in com.android.ims.ImsConfig#FeatureConstants.
     */
@Override public void registrationFeatureCapabilityChanged(int serviceClass, int[] enabledFeatures, int[] disabledFeatures) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(serviceClass);
_data.writeIntArray(enabledFeatures);
_data.writeIntArray(disabledFeatures);
mRemote.transact(Stub.TRANSACTION_registrationFeatureCapabilityChanged, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/**
     * Updates the application with the waiting voice message count.
     * @param count The number of waiting voice messages.
     */
@Override public void voiceMessageCountUpdate(int count) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(count);
mRemote.transact(Stub.TRANSACTION_voiceMessageCountUpdate, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
}
static final int TRANSACTION_registrationConnected = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_registrationProgressing = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_registrationDisconnected = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
static final int TRANSACTION_registrationResumed = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
static final int TRANSACTION_registrationSuspended = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
static final int TRANSACTION_registrationServiceCapabilityChanged = (android.os.IBinder.FIRST_CALL_TRANSACTION + 5);
static final int TRANSACTION_registrationFeatureCapabilityChanged = (android.os.IBinder.FIRST_CALL_TRANSACTION + 6);
static final int TRANSACTION_voiceMessageCountUpdate = (android.os.IBinder.FIRST_CALL_TRANSACTION + 7);
}
/**
     * Notifies the application when the device is connected to the IMS network.
     */
public void registrationConnected() throws android.os.RemoteException;
/**
     * Notifies the application when the device is trying to connect the IMS network.
     */
public void registrationProgressing() throws android.os.RemoteException;
/**
     * Notifies the application when the device is disconnected from the IMS network.
     */
public void registrationDisconnected(com.android.ims.ImsReasonInfo imsReasonInfo) throws android.os.RemoteException;
/**
     * Notifies the application when its suspended IMS connection is resumed,
     * meaning the connection now allows throughput.
     */
public void registrationResumed() throws android.os.RemoteException;
/**
     * Notifies the application when its current IMS connection is suspended,
     * meaning there is no data throughput.
     */
public void registrationSuspended() throws android.os.RemoteException;
/**
     * Notifies the application when its current IMS connection is updated
     * since the service setting is changed or the service is added/removed.
     *
     * @param serviceClass a service class specified in {@link ImsServiceClass}
     * @param event an event type when this callback is called
     *    If {@code event} is 0, meaning the specified service is removed from the IMS connection.
     *    Else ({@code event} is 1), meaning the specified service is added to the IMS connection.
     */
public void registrationServiceCapabilityChanged(int serviceClass, int event) throws android.os.RemoteException;
/**
     * Notifies the application when features on a particular service enabled or
     * disabled successfully based on user preferences.
     *
     * @param serviceClass a service class specified in {@link ImsServiceClass}
     * @param enabledFeatures features enabled as defined in com.android.ims.ImsConfig#FeatureConstants.
     * @param disabledFeatures features disabled as defined in com.android.ims.ImsConfig#FeatureConstants.
     */
public void registrationFeatureCapabilityChanged(int serviceClass, int[] enabledFeatures, int[] disabledFeatures) throws android.os.RemoteException;
/**
     * Updates the application with the waiting voice message count.
     * @param count The number of waiting voice messages.
     */
public void voiceMessageCountUpdate(int count) throws android.os.RemoteException;
}
