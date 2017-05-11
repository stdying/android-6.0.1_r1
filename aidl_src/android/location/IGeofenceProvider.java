/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: frameworks/base/location/java/android/location/IGeofenceProvider.aidl
 */
package android.location;
/**
 * An interface for location providers implementing the Geofencing service
 *
 * {@hide}
 */
public interface IGeofenceProvider extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements android.location.IGeofenceProvider
{
private static final java.lang.String DESCRIPTOR = "android.location.IGeofenceProvider";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an android.location.IGeofenceProvider interface,
 * generating a proxy if needed.
 */
public static android.location.IGeofenceProvider asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof android.location.IGeofenceProvider))) {
return ((android.location.IGeofenceProvider)iin);
}
return new android.location.IGeofenceProvider.Stub.Proxy(obj);
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
case TRANSACTION_setGeofenceHardware:
{
data.enforceInterface(DESCRIPTOR);
android.hardware.location.IGeofenceHardware _arg0;
_arg0 = android.hardware.location.IGeofenceHardware.Stub.asInterface(data.readStrongBinder());
this.setGeofenceHardware(_arg0);
reply.writeNoException();
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements android.location.IGeofenceProvider
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
@Override public void setGeofenceHardware(android.hardware.location.IGeofenceHardware proxy) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((proxy!=null))?(proxy.asBinder()):(null)));
mRemote.transact(Stub.TRANSACTION_setGeofenceHardware, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
}
static final int TRANSACTION_setGeofenceHardware = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
}
public void setGeofenceHardware(android.hardware.location.IGeofenceHardware proxy) throws android.os.RemoteException;
}
