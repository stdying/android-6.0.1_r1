/*___Generated_by_IDEA___*/

/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: /media/li/old/asop/aosp/frameworks/base/keystore/java/android/security/IKeyChainAliasCallback.aidl
 */
package android.security;
/**
 * Used by the {@code KeyChainActivity} to return alias for {@link KeyStore#chooseAlias}.
 *
 * @hide
 */
public interface IKeyChainAliasCallback extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements android.security.IKeyChainAliasCallback
{
private static final java.lang.String DESCRIPTOR = "android.security.IKeyChainAliasCallback";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an android.security.IKeyChainAliasCallback interface,
 * generating a proxy if needed.
 */
public static android.security.IKeyChainAliasCallback asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof android.security.IKeyChainAliasCallback))) {
return ((android.security.IKeyChainAliasCallback)iin);
}
return new android.security.IKeyChainAliasCallback.Stub.Proxy(obj);
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
case TRANSACTION_alias:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
this.alias(_arg0);
reply.writeNoException();
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements android.security.IKeyChainAliasCallback
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
@Override public void alias(java.lang.String alias) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(alias);
mRemote.transact(Stub.TRANSACTION_alias, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
}
static final int TRANSACTION_alias = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
}
public void alias(java.lang.String alias) throws android.os.RemoteException;
}
