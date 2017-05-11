/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: frameworks/base/core/java/com/android/internal/widget/ILockSettings.aidl
 */
package com.android.internal.widget;
/** {@hide} */
public interface ILockSettings extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements com.android.internal.widget.ILockSettings
{
private static final java.lang.String DESCRIPTOR = "com.android.internal.widget.ILockSettings";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an com.android.internal.widget.ILockSettings interface,
 * generating a proxy if needed.
 */
public static com.android.internal.widget.ILockSettings asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof com.android.internal.widget.ILockSettings))) {
return ((com.android.internal.widget.ILockSettings)iin);
}
return new com.android.internal.widget.ILockSettings.Stub.Proxy(obj);
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
case TRANSACTION_setBoolean:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
boolean _arg1;
_arg1 = (0!=data.readInt());
int _arg2;
_arg2 = data.readInt();
this.setBoolean(_arg0, _arg1, _arg2);
reply.writeNoException();
return true;
}
case TRANSACTION_setLong:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
long _arg1;
_arg1 = data.readLong();
int _arg2;
_arg2 = data.readInt();
this.setLong(_arg0, _arg1, _arg2);
reply.writeNoException();
return true;
}
case TRANSACTION_setString:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
java.lang.String _arg1;
_arg1 = data.readString();
int _arg2;
_arg2 = data.readInt();
this.setString(_arg0, _arg1, _arg2);
reply.writeNoException();
return true;
}
case TRANSACTION_getBoolean:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
boolean _arg1;
_arg1 = (0!=data.readInt());
int _arg2;
_arg2 = data.readInt();
boolean _result = this.getBoolean(_arg0, _arg1, _arg2);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_getLong:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
long _arg1;
_arg1 = data.readLong();
int _arg2;
_arg2 = data.readInt();
long _result = this.getLong(_arg0, _arg1, _arg2);
reply.writeNoException();
reply.writeLong(_result);
return true;
}
case TRANSACTION_getString:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
java.lang.String _arg1;
_arg1 = data.readString();
int _arg2;
_arg2 = data.readInt();
java.lang.String _result = this.getString(_arg0, _arg1, _arg2);
reply.writeNoException();
reply.writeString(_result);
return true;
}
case TRANSACTION_setLockPattern:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
java.lang.String _arg1;
_arg1 = data.readString();
int _arg2;
_arg2 = data.readInt();
this.setLockPattern(_arg0, _arg1, _arg2);
reply.writeNoException();
return true;
}
case TRANSACTION_checkPattern:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
int _arg1;
_arg1 = data.readInt();
com.android.internal.widget.VerifyCredentialResponse _result = this.checkPattern(_arg0, _arg1);
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
case TRANSACTION_verifyPattern:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
long _arg1;
_arg1 = data.readLong();
int _arg2;
_arg2 = data.readInt();
com.android.internal.widget.VerifyCredentialResponse _result = this.verifyPattern(_arg0, _arg1, _arg2);
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
case TRANSACTION_setLockPassword:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
java.lang.String _arg1;
_arg1 = data.readString();
int _arg2;
_arg2 = data.readInt();
this.setLockPassword(_arg0, _arg1, _arg2);
reply.writeNoException();
return true;
}
case TRANSACTION_checkPassword:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
int _arg1;
_arg1 = data.readInt();
com.android.internal.widget.VerifyCredentialResponse _result = this.checkPassword(_arg0, _arg1);
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
case TRANSACTION_verifyPassword:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
long _arg1;
_arg1 = data.readLong();
int _arg2;
_arg2 = data.readInt();
com.android.internal.widget.VerifyCredentialResponse _result = this.verifyPassword(_arg0, _arg1, _arg2);
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
case TRANSACTION_checkVoldPassword:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
boolean _result = this.checkVoldPassword(_arg0);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_havePattern:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
boolean _result = this.havePattern(_arg0);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_havePassword:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
boolean _result = this.havePassword(_arg0);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_registerStrongAuthTracker:
{
data.enforceInterface(DESCRIPTOR);
android.app.trust.IStrongAuthTracker _arg0;
_arg0 = android.app.trust.IStrongAuthTracker.Stub.asInterface(data.readStrongBinder());
this.registerStrongAuthTracker(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_unregisterStrongAuthTracker:
{
data.enforceInterface(DESCRIPTOR);
android.app.trust.IStrongAuthTracker _arg0;
_arg0 = android.app.trust.IStrongAuthTracker.Stub.asInterface(data.readStrongBinder());
this.unregisterStrongAuthTracker(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_requireStrongAuth:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
int _arg1;
_arg1 = data.readInt();
this.requireStrongAuth(_arg0, _arg1);
reply.writeNoException();
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements com.android.internal.widget.ILockSettings
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
@Override public void setBoolean(java.lang.String key, boolean value, int userId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(key);
_data.writeInt(((value)?(1):(0)));
_data.writeInt(userId);
mRemote.transact(Stub.TRANSACTION_setBoolean, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void setLong(java.lang.String key, long value, int userId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(key);
_data.writeLong(value);
_data.writeInt(userId);
mRemote.transact(Stub.TRANSACTION_setLong, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void setString(java.lang.String key, java.lang.String value, int userId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(key);
_data.writeString(value);
_data.writeInt(userId);
mRemote.transact(Stub.TRANSACTION_setString, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public boolean getBoolean(java.lang.String key, boolean defaultValue, int userId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(key);
_data.writeInt(((defaultValue)?(1):(0)));
_data.writeInt(userId);
mRemote.transact(Stub.TRANSACTION_getBoolean, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public long getLong(java.lang.String key, long defaultValue, int userId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
long _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(key);
_data.writeLong(defaultValue);
_data.writeInt(userId);
mRemote.transact(Stub.TRANSACTION_getLong, _data, _reply, 0);
_reply.readException();
_result = _reply.readLong();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public java.lang.String getString(java.lang.String key, java.lang.String defaultValue, int userId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.lang.String _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(key);
_data.writeString(defaultValue);
_data.writeInt(userId);
mRemote.transact(Stub.TRANSACTION_getString, _data, _reply, 0);
_reply.readException();
_result = _reply.readString();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public void setLockPattern(java.lang.String pattern, java.lang.String savedPattern, int userId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(pattern);
_data.writeString(savedPattern);
_data.writeInt(userId);
mRemote.transact(Stub.TRANSACTION_setLockPattern, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public com.android.internal.widget.VerifyCredentialResponse checkPattern(java.lang.String pattern, int userId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
com.android.internal.widget.VerifyCredentialResponse _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(pattern);
_data.writeInt(userId);
mRemote.transact(Stub.TRANSACTION_checkPattern, _data, _reply, 0);
_reply.readException();
if ((0!=_reply.readInt())) {
_result = com.android.internal.widget.VerifyCredentialResponse.CREATOR.createFromParcel(_reply);
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
@Override public com.android.internal.widget.VerifyCredentialResponse verifyPattern(java.lang.String pattern, long challenge, int userId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
com.android.internal.widget.VerifyCredentialResponse _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(pattern);
_data.writeLong(challenge);
_data.writeInt(userId);
mRemote.transact(Stub.TRANSACTION_verifyPattern, _data, _reply, 0);
_reply.readException();
if ((0!=_reply.readInt())) {
_result = com.android.internal.widget.VerifyCredentialResponse.CREATOR.createFromParcel(_reply);
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
@Override public void setLockPassword(java.lang.String password, java.lang.String savedPassword, int userId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(password);
_data.writeString(savedPassword);
_data.writeInt(userId);
mRemote.transact(Stub.TRANSACTION_setLockPassword, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public com.android.internal.widget.VerifyCredentialResponse checkPassword(java.lang.String password, int userId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
com.android.internal.widget.VerifyCredentialResponse _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(password);
_data.writeInt(userId);
mRemote.transact(Stub.TRANSACTION_checkPassword, _data, _reply, 0);
_reply.readException();
if ((0!=_reply.readInt())) {
_result = com.android.internal.widget.VerifyCredentialResponse.CREATOR.createFromParcel(_reply);
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
@Override public com.android.internal.widget.VerifyCredentialResponse verifyPassword(java.lang.String password, long challenge, int userId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
com.android.internal.widget.VerifyCredentialResponse _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(password);
_data.writeLong(challenge);
_data.writeInt(userId);
mRemote.transact(Stub.TRANSACTION_verifyPassword, _data, _reply, 0);
_reply.readException();
if ((0!=_reply.readInt())) {
_result = com.android.internal.widget.VerifyCredentialResponse.CREATOR.createFromParcel(_reply);
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
@Override public boolean checkVoldPassword(int userId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(userId);
mRemote.transact(Stub.TRANSACTION_checkVoldPassword, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public boolean havePattern(int userId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(userId);
mRemote.transact(Stub.TRANSACTION_havePattern, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public boolean havePassword(int userId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(userId);
mRemote.transact(Stub.TRANSACTION_havePassword, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public void registerStrongAuthTracker(android.app.trust.IStrongAuthTracker tracker) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((tracker!=null))?(tracker.asBinder()):(null)));
mRemote.transact(Stub.TRANSACTION_registerStrongAuthTracker, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void unregisterStrongAuthTracker(android.app.trust.IStrongAuthTracker tracker) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((tracker!=null))?(tracker.asBinder()):(null)));
mRemote.transact(Stub.TRANSACTION_unregisterStrongAuthTracker, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void requireStrongAuth(int strongAuthReason, int userId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(strongAuthReason);
_data.writeInt(userId);
mRemote.transact(Stub.TRANSACTION_requireStrongAuth, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
}
static final int TRANSACTION_setBoolean = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_setLong = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_setString = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
static final int TRANSACTION_getBoolean = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
static final int TRANSACTION_getLong = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
static final int TRANSACTION_getString = (android.os.IBinder.FIRST_CALL_TRANSACTION + 5);
static final int TRANSACTION_setLockPattern = (android.os.IBinder.FIRST_CALL_TRANSACTION + 6);
static final int TRANSACTION_checkPattern = (android.os.IBinder.FIRST_CALL_TRANSACTION + 7);
static final int TRANSACTION_verifyPattern = (android.os.IBinder.FIRST_CALL_TRANSACTION + 8);
static final int TRANSACTION_setLockPassword = (android.os.IBinder.FIRST_CALL_TRANSACTION + 9);
static final int TRANSACTION_checkPassword = (android.os.IBinder.FIRST_CALL_TRANSACTION + 10);
static final int TRANSACTION_verifyPassword = (android.os.IBinder.FIRST_CALL_TRANSACTION + 11);
static final int TRANSACTION_checkVoldPassword = (android.os.IBinder.FIRST_CALL_TRANSACTION + 12);
static final int TRANSACTION_havePattern = (android.os.IBinder.FIRST_CALL_TRANSACTION + 13);
static final int TRANSACTION_havePassword = (android.os.IBinder.FIRST_CALL_TRANSACTION + 14);
static final int TRANSACTION_registerStrongAuthTracker = (android.os.IBinder.FIRST_CALL_TRANSACTION + 15);
static final int TRANSACTION_unregisterStrongAuthTracker = (android.os.IBinder.FIRST_CALL_TRANSACTION + 16);
static final int TRANSACTION_requireStrongAuth = (android.os.IBinder.FIRST_CALL_TRANSACTION + 17);
}
public void setBoolean(java.lang.String key, boolean value, int userId) throws android.os.RemoteException;
public void setLong(java.lang.String key, long value, int userId) throws android.os.RemoteException;
public void setString(java.lang.String key, java.lang.String value, int userId) throws android.os.RemoteException;
public boolean getBoolean(java.lang.String key, boolean defaultValue, int userId) throws android.os.RemoteException;
public long getLong(java.lang.String key, long defaultValue, int userId) throws android.os.RemoteException;
public java.lang.String getString(java.lang.String key, java.lang.String defaultValue, int userId) throws android.os.RemoteException;
public void setLockPattern(java.lang.String pattern, java.lang.String savedPattern, int userId) throws android.os.RemoteException;
public com.android.internal.widget.VerifyCredentialResponse checkPattern(java.lang.String pattern, int userId) throws android.os.RemoteException;
public com.android.internal.widget.VerifyCredentialResponse verifyPattern(java.lang.String pattern, long challenge, int userId) throws android.os.RemoteException;
public void setLockPassword(java.lang.String password, java.lang.String savedPassword, int userId) throws android.os.RemoteException;
public com.android.internal.widget.VerifyCredentialResponse checkPassword(java.lang.String password, int userId) throws android.os.RemoteException;
public com.android.internal.widget.VerifyCredentialResponse verifyPassword(java.lang.String password, long challenge, int userId) throws android.os.RemoteException;
public boolean checkVoldPassword(int userId) throws android.os.RemoteException;
public boolean havePattern(int userId) throws android.os.RemoteException;
public boolean havePassword(int userId) throws android.os.RemoteException;
public void registerStrongAuthTracker(android.app.trust.IStrongAuthTracker tracker) throws android.os.RemoteException;
public void unregisterStrongAuthTracker(android.app.trust.IStrongAuthTracker tracker) throws android.os.RemoteException;
public void requireStrongAuth(int strongAuthReason, int userId) throws android.os.RemoteException;
}
