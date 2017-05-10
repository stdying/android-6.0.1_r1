/*___Generated_by_IDEA___*/

/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: /home/useradmin/aosp7.0.0r3/frameworks/base/wifi/java/android/net/wifi/nan/IWifiNanEventListener.aidl
 */
package android.net.wifi.nan;
/**
 * Callback interface that WifiNanManager implements
 *
 * {@hide}
 */
public interface IWifiNanEventListener extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements android.net.wifi.nan.IWifiNanEventListener
{
private static final java.lang.String DESCRIPTOR = "android.net.wifi.nan.IWifiNanEventListener";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an android.net.wifi.nan.IWifiNanEventListener interface,
 * generating a proxy if needed.
 */
public static android.net.wifi.nan.IWifiNanEventListener asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof android.net.wifi.nan.IWifiNanEventListener))) {
return ((android.net.wifi.nan.IWifiNanEventListener)iin);
}
return new android.net.wifi.nan.IWifiNanEventListener.Stub.Proxy(obj);
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
case TRANSACTION_onConfigCompleted:
{
data.enforceInterface(DESCRIPTOR);
android.net.wifi.nan.ConfigRequest _arg0;
if ((0!=data.readInt())) {
_arg0 = android.net.wifi.nan.ConfigRequest.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
this.onConfigCompleted(_arg0);
return true;
}
case TRANSACTION_onConfigFailed:
{
data.enforceInterface(DESCRIPTOR);
android.net.wifi.nan.ConfigRequest _arg0;
if ((0!=data.readInt())) {
_arg0 = android.net.wifi.nan.ConfigRequest.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
int _arg1;
_arg1 = data.readInt();
this.onConfigFailed(_arg0, _arg1);
return true;
}
case TRANSACTION_onNanDown:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
this.onNanDown(_arg0);
return true;
}
case TRANSACTION_onIdentityChanged:
{
data.enforceInterface(DESCRIPTOR);
this.onIdentityChanged();
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements android.net.wifi.nan.IWifiNanEventListener
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
@Override public void onConfigCompleted(android.net.wifi.nan.ConfigRequest completedConfig) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((completedConfig!=null)) {
_data.writeInt(1);
completedConfig.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_onConfigCompleted, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void onConfigFailed(android.net.wifi.nan.ConfigRequest failedConfig, int reason) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((failedConfig!=null)) {
_data.writeInt(1);
failedConfig.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeInt(reason);
mRemote.transact(Stub.TRANSACTION_onConfigFailed, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void onNanDown(int reason) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(reason);
mRemote.transact(Stub.TRANSACTION_onNanDown, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void onIdentityChanged() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_onIdentityChanged, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
}
static final int TRANSACTION_onConfigCompleted = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_onConfigFailed = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_onNanDown = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
static final int TRANSACTION_onIdentityChanged = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
}
public void onConfigCompleted(android.net.wifi.nan.ConfigRequest completedConfig) throws android.os.RemoteException;
public void onConfigFailed(android.net.wifi.nan.ConfigRequest failedConfig, int reason) throws android.os.RemoteException;
public void onNanDown(int reason) throws android.os.RemoteException;
public void onIdentityChanged() throws android.os.RemoteException;
}
