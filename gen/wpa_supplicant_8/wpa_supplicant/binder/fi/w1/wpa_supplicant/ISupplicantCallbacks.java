/*___Generated_by_IDEA___*/

/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: /home/useradmin/aosp7.0.0r3/external/wpa_supplicant_8/wpa_supplicant/binder/fi/w1/wpa_supplicant/ISupplicantCallbacks.aidl
 */
package fi.w1.wpa_supplicant;
/**
 * Callback Interface exposed by the wpa_supplicant service. Clients need
 * to host an instance of this binder object and pass a reference of the object
 * to wpa_supplicant via the registerCallbacksObject method.
 */
public interface ISupplicantCallbacks extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements fi.w1.wpa_supplicant.ISupplicantCallbacks
{
private static final java.lang.String DESCRIPTOR = "fi.w1.wpa_supplicant.ISupplicantCallbacks";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an fi.w1.wpa_supplicant.ISupplicantCallbacks interface,
 * generating a proxy if needed.
 */
public static fi.w1.wpa_supplicant.ISupplicantCallbacks asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof fi.w1.wpa_supplicant.ISupplicantCallbacks))) {
return ((fi.w1.wpa_supplicant.ISupplicantCallbacks)iin);
}
return new fi.w1.wpa_supplicant.ISupplicantCallbacks.Stub.Proxy(obj);
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
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements fi.w1.wpa_supplicant.ISupplicantCallbacks
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
}
}
}
