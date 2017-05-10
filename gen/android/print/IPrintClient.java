/*___Generated_by_IDEA___*/

/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: /media/li/old/asop/aosp/frameworks/base/core/java/android/print/IPrintClient.aidl
 */
package android.print;
/**
 * Interface for communication with a printing app.
 *
 * @see android.print.IPrintClientCallback
 *
 * @hide
 */
public interface IPrintClient extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements android.print.IPrintClient
{
private static final java.lang.String DESCRIPTOR = "android.print.IPrintClient";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an android.print.IPrintClient interface,
 * generating a proxy if needed.
 */
public static android.print.IPrintClient asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof android.print.IPrintClient))) {
return ((android.print.IPrintClient)iin);
}
return new android.print.IPrintClient.Stub.Proxy(obj);
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
case TRANSACTION_startPrintJobConfigActivity:
{
data.enforceInterface(DESCRIPTOR);
android.content.IntentSender _arg0;
if ((0!=data.readInt())) {
_arg0 = android.content.IntentSender.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
this.startPrintJobConfigActivity(_arg0);
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements android.print.IPrintClient
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
@Override public void startPrintJobConfigActivity(android.content.IntentSender intent) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((intent!=null)) {
_data.writeInt(1);
intent.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_startPrintJobConfigActivity, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
}
static final int TRANSACTION_startPrintJobConfigActivity = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
}
public void startPrintJobConfigActivity(android.content.IntentSender intent) throws android.os.RemoteException;
}
