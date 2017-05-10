/*___Generated_by_IDEA___*/

/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: /home/useradmin/aosp7.0.0r3/packages/services/Car/car-lib/src/android/car/media/ICarAudio.aidl
 */
package android.car.media;
/**
 * Binder interface for {@link android.car.media.CarAudioManager}.
 * Check {@link android.car.media.CarAudioManager} APIs for expected behavior of each calls.
 *
 * @hide
 */
public interface ICarAudio extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements android.car.media.ICarAudio
{
private static final java.lang.String DESCRIPTOR = "android.car.media.ICarAudio";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an android.car.media.ICarAudio interface,
 * generating a proxy if needed.
 */
public static android.car.media.ICarAudio asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof android.car.media.ICarAudio))) {
return ((android.car.media.ICarAudio)iin);
}
return new android.car.media.ICarAudio.Stub.Proxy(obj);
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
case TRANSACTION_getAudioAttributesForCarUsage:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
android.media.AudioAttributes _result = this.getAudioAttributesForCarUsage(_arg0);
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
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements android.car.media.ICarAudio
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
@Override public android.media.AudioAttributes getAudioAttributesForCarUsage(int carUsage) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
android.media.AudioAttributes _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(carUsage);
mRemote.transact(Stub.TRANSACTION_getAudioAttributesForCarUsage, _data, _reply, 0);
_reply.readException();
if ((0!=_reply.readInt())) {
_result = android.media.AudioAttributes.CREATOR.createFromParcel(_reply);
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
}
static final int TRANSACTION_getAudioAttributesForCarUsage = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
}
public android.media.AudioAttributes getAudioAttributesForCarUsage(int carUsage) throws android.os.RemoteException;
}
