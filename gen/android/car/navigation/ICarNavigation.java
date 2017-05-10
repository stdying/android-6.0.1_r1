/*___Generated_by_IDEA___*/

/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: /home/useradmin/aosp7.0.0r3/packages/services/Car/car-lib/src/android/car/navigation/ICarNavigation.aidl
 */
package android.car.navigation;
/**
 * Binder API for CarNavigationManager.
 * @hide
 */
public interface ICarNavigation extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements android.car.navigation.ICarNavigation
{
private static final java.lang.String DESCRIPTOR = "android.car.navigation.ICarNavigation";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an android.car.navigation.ICarNavigation interface,
 * generating a proxy if needed.
 */
public static android.car.navigation.ICarNavigation asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof android.car.navigation.ICarNavigation))) {
return ((android.car.navigation.ICarNavigation)iin);
}
return new android.car.navigation.ICarNavigation.Stub.Proxy(obj);
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
case TRANSACTION_sendNavigationStatus:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
this.sendNavigationStatus(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_sendNavigationTurnEvent:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
java.lang.String _arg1;
_arg1 = data.readString();
int _arg2;
_arg2 = data.readInt();
int _arg3;
_arg3 = data.readInt();
android.graphics.Bitmap _arg4;
if ((0!=data.readInt())) {
_arg4 = android.graphics.Bitmap.CREATOR.createFromParcel(data);
}
else {
_arg4 = null;
}
int _arg5;
_arg5 = data.readInt();
this.sendNavigationTurnEvent(_arg0, _arg1, _arg2, _arg3, _arg4, _arg5);
reply.writeNoException();
return true;
}
case TRANSACTION_sendNavigationTurnDistanceEvent:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
int _arg1;
_arg1 = data.readInt();
this.sendNavigationTurnDistanceEvent(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_isInstrumentClusterSupported:
{
data.enforceInterface(DESCRIPTOR);
boolean _result = this.isInstrumentClusterSupported();
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_getInstrumentClusterInfo:
{
data.enforceInterface(DESCRIPTOR);
android.car.navigation.CarNavigationInstrumentCluster _result = this.getInstrumentClusterInfo();
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
case TRANSACTION_registerEventListener:
{
data.enforceInterface(DESCRIPTOR);
android.car.navigation.ICarNavigationEventListener _arg0;
_arg0 = android.car.navigation.ICarNavigationEventListener.Stub.asInterface(data.readStrongBinder());
boolean _result = this.registerEventListener(_arg0);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_unregisterEventListener:
{
data.enforceInterface(DESCRIPTOR);
android.car.navigation.ICarNavigationEventListener _arg0;
_arg0 = android.car.navigation.ICarNavigationEventListener.Stub.asInterface(data.readStrongBinder());
boolean _result = this.unregisterEventListener(_arg0);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements android.car.navigation.ICarNavigation
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
@Override public void sendNavigationStatus(int status) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(status);
mRemote.transact(Stub.TRANSACTION_sendNavigationStatus, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void sendNavigationTurnEvent(int event, java.lang.String road, int turnAngle, int turnNumber, android.graphics.Bitmap image, int turnSide) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(event);
_data.writeString(road);
_data.writeInt(turnAngle);
_data.writeInt(turnNumber);
if ((image!=null)) {
_data.writeInt(1);
image.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeInt(turnSide);
mRemote.transact(Stub.TRANSACTION_sendNavigationTurnEvent, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void sendNavigationTurnDistanceEvent(int distanceMeters, int timeSeconds) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(distanceMeters);
_data.writeInt(timeSeconds);
mRemote.transact(Stub.TRANSACTION_sendNavigationTurnDistanceEvent, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public boolean isInstrumentClusterSupported() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_isInstrumentClusterSupported, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public android.car.navigation.CarNavigationInstrumentCluster getInstrumentClusterInfo() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
android.car.navigation.CarNavigationInstrumentCluster _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getInstrumentClusterInfo, _data, _reply, 0);
_reply.readException();
if ((0!=_reply.readInt())) {
_result = android.car.navigation.CarNavigationInstrumentCluster.CREATOR.createFromParcel(_reply);
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
@Override public boolean registerEventListener(android.car.navigation.ICarNavigationEventListener listener) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((listener!=null))?(listener.asBinder()):(null)));
mRemote.transact(Stub.TRANSACTION_registerEventListener, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public boolean unregisterEventListener(android.car.navigation.ICarNavigationEventListener listener) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((listener!=null))?(listener.asBinder()):(null)));
mRemote.transact(Stub.TRANSACTION_unregisterEventListener, _data, _reply, 0);
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
static final int TRANSACTION_sendNavigationStatus = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_sendNavigationTurnEvent = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_sendNavigationTurnDistanceEvent = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
static final int TRANSACTION_isInstrumentClusterSupported = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
static final int TRANSACTION_getInstrumentClusterInfo = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
static final int TRANSACTION_registerEventListener = (android.os.IBinder.FIRST_CALL_TRANSACTION + 5);
static final int TRANSACTION_unregisterEventListener = (android.os.IBinder.FIRST_CALL_TRANSACTION + 6);
}
public void sendNavigationStatus(int status) throws android.os.RemoteException;
public void sendNavigationTurnEvent(int event, java.lang.String road, int turnAngle, int turnNumber, android.graphics.Bitmap image, int turnSide) throws android.os.RemoteException;
public void sendNavigationTurnDistanceEvent(int distanceMeters, int timeSeconds) throws android.os.RemoteException;
public boolean isInstrumentClusterSupported() throws android.os.RemoteException;
public android.car.navigation.CarNavigationInstrumentCluster getInstrumentClusterInfo() throws android.os.RemoteException;
public boolean registerEventListener(android.car.navigation.ICarNavigationEventListener listener) throws android.os.RemoteException;
public boolean unregisterEventListener(android.car.navigation.ICarNavigationEventListener listener) throws android.os.RemoteException;
}
