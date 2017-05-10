/*___Generated_by_IDEA___*/

/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: /home/useradmin/aosp7.0.0r3/frameworks/base/core/java/android/printservice/recommendation/IRecommendationService.aidl
 */
package android.printservice.recommendation;
/**
 * Interface for communication with the print service recommendation service.
 *
 * @see android.print.IPrintServiceRecommendationServiceCallbacks
 *
 * @hide
 */
public interface IRecommendationService extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements android.printservice.recommendation.IRecommendationService
{
private static final java.lang.String DESCRIPTOR = "android.printservice.recommendation.IRecommendationService";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an android.printservice.recommendation.IRecommendationService interface,
 * generating a proxy if needed.
 */
public static android.printservice.recommendation.IRecommendationService asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof android.printservice.recommendation.IRecommendationService))) {
return ((android.printservice.recommendation.IRecommendationService)iin);
}
return new android.printservice.recommendation.IRecommendationService.Stub.Proxy(obj);
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
case TRANSACTION_registerCallbacks:
{
data.enforceInterface(DESCRIPTOR);
android.printservice.recommendation.IRecommendationServiceCallbacks _arg0;
_arg0 = android.printservice.recommendation.IRecommendationServiceCallbacks.Stub.asInterface(data.readStrongBinder());
this.registerCallbacks(_arg0);
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements android.printservice.recommendation.IRecommendationService
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
@Override public void registerCallbacks(android.printservice.recommendation.IRecommendationServiceCallbacks callbacks) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((callbacks!=null))?(callbacks.asBinder()):(null)));
mRemote.transact(Stub.TRANSACTION_registerCallbacks, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
}
static final int TRANSACTION_registerCallbacks = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
}
public void registerCallbacks(android.printservice.recommendation.IRecommendationServiceCallbacks callbacks) throws android.os.RemoteException;
}
