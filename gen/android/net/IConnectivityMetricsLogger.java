/*___Generated_by_IDEA___*/

/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: /home/useradmin/aosp7.0.0r3/frameworks/base/core/java/android/net/IConnectivityMetricsLogger.aidl
 */
package android.net;
/** {@hide} */
public interface IConnectivityMetricsLogger extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements android.net.IConnectivityMetricsLogger
{
private static final java.lang.String DESCRIPTOR = "android.net.IConnectivityMetricsLogger";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an android.net.IConnectivityMetricsLogger interface,
 * generating a proxy if needed.
 */
public static android.net.IConnectivityMetricsLogger asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof android.net.IConnectivityMetricsLogger))) {
return ((android.net.IConnectivityMetricsLogger)iin);
}
return new android.net.IConnectivityMetricsLogger.Stub.Proxy(obj);
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
case TRANSACTION_logEvent:
{
data.enforceInterface(DESCRIPTOR);
android.net.ConnectivityMetricsEvent _arg0;
if ((0!=data.readInt())) {
_arg0 = android.net.ConnectivityMetricsEvent.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
long _result = this.logEvent(_arg0);
reply.writeNoException();
reply.writeLong(_result);
return true;
}
case TRANSACTION_logEvents:
{
data.enforceInterface(DESCRIPTOR);
android.net.ConnectivityMetricsEvent[] _arg0;
_arg0 = data.createTypedArray(android.net.ConnectivityMetricsEvent.CREATOR);
long _result = this.logEvents(_arg0);
reply.writeNoException();
reply.writeLong(_result);
return true;
}
case TRANSACTION_getEvents:
{
data.enforceInterface(DESCRIPTOR);
android.net.ConnectivityMetricsEvent.Reference _arg0;
if ((0!=data.readInt())) {
_arg0 = android.net.ConnectivityMetricsEvent.Reference.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
android.net.ConnectivityMetricsEvent[] _result = this.getEvents(_arg0);
reply.writeNoException();
reply.writeTypedArray(_result, android.os.Parcelable.PARCELABLE_WRITE_RETURN_VALUE);
if ((_arg0!=null)) {
reply.writeInt(1);
_arg0.writeToParcel(reply, android.os.Parcelable.PARCELABLE_WRITE_RETURN_VALUE);
}
else {
reply.writeInt(0);
}
return true;
}
case TRANSACTION_register:
{
data.enforceInterface(DESCRIPTOR);
android.app.PendingIntent _arg0;
if ((0!=data.readInt())) {
_arg0 = android.app.PendingIntent.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
boolean _result = this.register(_arg0);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_unregister:
{
data.enforceInterface(DESCRIPTOR);
android.app.PendingIntent _arg0;
if ((0!=data.readInt())) {
_arg0 = android.app.PendingIntent.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
this.unregister(_arg0);
reply.writeNoException();
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements android.net.IConnectivityMetricsLogger
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
     * @return 0 on success
     *        <0 if error happened
     *        >0 timestamp after which new events will be accepted
     */
@Override public long logEvent(android.net.ConnectivityMetricsEvent event) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
long _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((event!=null)) {
_data.writeInt(1);
event.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_logEvent, _data, _reply, 0);
_reply.readException();
_result = _reply.readLong();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public long logEvents(android.net.ConnectivityMetricsEvent[] events) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
long _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeTypedArray(events, 0);
mRemote.transact(Stub.TRANSACTION_logEvents, _data, _reply, 0);
_reply.readException();
_result = _reply.readLong();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/**
     * @param reference of the last event previously returned. The function will return
     *                  events following it.
     *                  If 0 then all events will be returned.
     *                  After the function call it will contain reference of the last event.
     */
@Override public android.net.ConnectivityMetricsEvent[] getEvents(android.net.ConnectivityMetricsEvent.Reference reference) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
android.net.ConnectivityMetricsEvent[] _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((reference!=null)) {
_data.writeInt(1);
reference.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_getEvents, _data, _reply, 0);
_reply.readException();
_result = _reply.createTypedArray(android.net.ConnectivityMetricsEvent.CREATOR);
if ((0!=_reply.readInt())) {
reference.readFromParcel(_reply);
}
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public boolean register(android.app.PendingIntent newEventsIntent) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((newEventsIntent!=null)) {
_data.writeInt(1);
newEventsIntent.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_register, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public void unregister(android.app.PendingIntent newEventsIntent) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((newEventsIntent!=null)) {
_data.writeInt(1);
newEventsIntent.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_unregister, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
}
static final int TRANSACTION_logEvent = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_logEvents = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_getEvents = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
static final int TRANSACTION_register = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
static final int TRANSACTION_unregister = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
}
/**
     * @return 0 on success
     *        <0 if error happened
     *        >0 timestamp after which new events will be accepted
     */
public long logEvent(android.net.ConnectivityMetricsEvent event) throws android.os.RemoteException;
public long logEvents(android.net.ConnectivityMetricsEvent[] events) throws android.os.RemoteException;
/**
     * @param reference of the last event previously returned. The function will return
     *                  events following it.
     *                  If 0 then all events will be returned.
     *                  After the function call it will contain reference of the last event.
     */
public android.net.ConnectivityMetricsEvent[] getEvents(android.net.ConnectivityMetricsEvent.Reference reference) throws android.os.RemoteException;
public boolean register(android.app.PendingIntent newEventsIntent) throws android.os.RemoteException;
public void unregister(android.app.PendingIntent newEventsIntent) throws android.os.RemoteException;
}
