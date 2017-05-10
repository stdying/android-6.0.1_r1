/*___Generated_by_IDEA___*/

/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: /home/useradmin/aosp7.0.0r3/frameworks/base/media/java/android/media/IRecordingConfigDispatcher.aidl
 */
package android.media;
/**
 * AIDL for the RecordingActivity monitor in AudioService to signal audio recording updates.
 *
 * {@hide}
 */
public interface IRecordingConfigDispatcher extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements android.media.IRecordingConfigDispatcher
{
private static final java.lang.String DESCRIPTOR = "android.media.IRecordingConfigDispatcher";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an android.media.IRecordingConfigDispatcher interface,
 * generating a proxy if needed.
 */
public static android.media.IRecordingConfigDispatcher asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof android.media.IRecordingConfigDispatcher))) {
return ((android.media.IRecordingConfigDispatcher)iin);
}
return new android.media.IRecordingConfigDispatcher.Stub.Proxy(obj);
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
case TRANSACTION_dispatchRecordingConfigChange:
{
data.enforceInterface(DESCRIPTOR);
java.util.List<android.media.AudioRecordingConfiguration> _arg0;
_arg0 = data.createTypedArrayList(android.media.AudioRecordingConfiguration.CREATOR);
this.dispatchRecordingConfigChange(_arg0);
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements android.media.IRecordingConfigDispatcher
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
@Override public void dispatchRecordingConfigChange(java.util.List<android.media.AudioRecordingConfiguration> configs) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeTypedList(configs);
mRemote.transact(Stub.TRANSACTION_dispatchRecordingConfigChange, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
}
static final int TRANSACTION_dispatchRecordingConfigChange = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
}
public void dispatchRecordingConfigChange(java.util.List<android.media.AudioRecordingConfiguration> configs) throws android.os.RemoteException;
}
