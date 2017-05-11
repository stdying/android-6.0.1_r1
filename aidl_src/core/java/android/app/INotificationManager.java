/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: frameworks/base/core/java/android/app/INotificationManager.aidl
 */
package android.app;
/** {@hide} */
public interface INotificationManager extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements android.app.INotificationManager
{
private static final java.lang.String DESCRIPTOR = "android.app.INotificationManager";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an android.app.INotificationManager interface,
 * generating a proxy if needed.
 */
public static android.app.INotificationManager asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof android.app.INotificationManager))) {
return ((android.app.INotificationManager)iin);
}
return new android.app.INotificationManager.Stub.Proxy(obj);
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
case TRANSACTION_cancelAllNotifications:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
int _arg1;
_arg1 = data.readInt();
this.cancelAllNotifications(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_enqueueToast:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
android.app.ITransientNotification _arg1;
_arg1 = android.app.ITransientNotification.Stub.asInterface(data.readStrongBinder());
int _arg2;
_arg2 = data.readInt();
this.enqueueToast(_arg0, _arg1, _arg2);
reply.writeNoException();
return true;
}
case TRANSACTION_cancelToast:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
android.app.ITransientNotification _arg1;
_arg1 = android.app.ITransientNotification.Stub.asInterface(data.readStrongBinder());
this.cancelToast(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_enqueueNotificationWithTag:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
java.lang.String _arg1;
_arg1 = data.readString();
java.lang.String _arg2;
_arg2 = data.readString();
int _arg3;
_arg3 = data.readInt();
android.app.Notification _arg4;
if ((0!=data.readInt())) {
_arg4 = android.app.Notification.CREATOR.createFromParcel(data);
}
else {
_arg4 = null;
}
int[] _arg5;
_arg5 = data.createIntArray();
int _arg6;
_arg6 = data.readInt();
this.enqueueNotificationWithTag(_arg0, _arg1, _arg2, _arg3, _arg4, _arg5, _arg6);
reply.writeNoException();
reply.writeIntArray(_arg5);
return true;
}
case TRANSACTION_cancelNotificationWithTag:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
java.lang.String _arg1;
_arg1 = data.readString();
int _arg2;
_arg2 = data.readInt();
int _arg3;
_arg3 = data.readInt();
this.cancelNotificationWithTag(_arg0, _arg1, _arg2, _arg3);
reply.writeNoException();
return true;
}
case TRANSACTION_setNotificationsEnabledForPackage:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
int _arg1;
_arg1 = data.readInt();
boolean _arg2;
_arg2 = (0!=data.readInt());
this.setNotificationsEnabledForPackage(_arg0, _arg1, _arg2);
reply.writeNoException();
return true;
}
case TRANSACTION_areNotificationsEnabledForPackage:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
int _arg1;
_arg1 = data.readInt();
boolean _result = this.areNotificationsEnabledForPackage(_arg0, _arg1);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_setPackagePriority:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
int _arg1;
_arg1 = data.readInt();
int _arg2;
_arg2 = data.readInt();
this.setPackagePriority(_arg0, _arg1, _arg2);
reply.writeNoException();
return true;
}
case TRANSACTION_getPackagePriority:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
int _arg1;
_arg1 = data.readInt();
int _result = this.getPackagePriority(_arg0, _arg1);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_setPackagePeekable:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
int _arg1;
_arg1 = data.readInt();
boolean _arg2;
_arg2 = (0!=data.readInt());
this.setPackagePeekable(_arg0, _arg1, _arg2);
reply.writeNoException();
return true;
}
case TRANSACTION_getPackagePeekable:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
int _arg1;
_arg1 = data.readInt();
boolean _result = this.getPackagePeekable(_arg0, _arg1);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_setPackageVisibilityOverride:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
int _arg1;
_arg1 = data.readInt();
int _arg2;
_arg2 = data.readInt();
this.setPackageVisibilityOverride(_arg0, _arg1, _arg2);
reply.writeNoException();
return true;
}
case TRANSACTION_getPackageVisibilityOverride:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
int _arg1;
_arg1 = data.readInt();
int _result = this.getPackageVisibilityOverride(_arg0, _arg1);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_getActiveNotifications:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
android.service.notification.StatusBarNotification[] _result = this.getActiveNotifications(_arg0);
reply.writeNoException();
reply.writeTypedArray(_result, android.os.Parcelable.PARCELABLE_WRITE_RETURN_VALUE);
return true;
}
case TRANSACTION_getHistoricalNotifications:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
int _arg1;
_arg1 = data.readInt();
android.service.notification.StatusBarNotification[] _result = this.getHistoricalNotifications(_arg0, _arg1);
reply.writeNoException();
reply.writeTypedArray(_result, android.os.Parcelable.PARCELABLE_WRITE_RETURN_VALUE);
return true;
}
case TRANSACTION_registerListener:
{
data.enforceInterface(DESCRIPTOR);
android.service.notification.INotificationListener _arg0;
_arg0 = android.service.notification.INotificationListener.Stub.asInterface(data.readStrongBinder());
android.content.ComponentName _arg1;
if ((0!=data.readInt())) {
_arg1 = android.content.ComponentName.CREATOR.createFromParcel(data);
}
else {
_arg1 = null;
}
int _arg2;
_arg2 = data.readInt();
this.registerListener(_arg0, _arg1, _arg2);
reply.writeNoException();
return true;
}
case TRANSACTION_unregisterListener:
{
data.enforceInterface(DESCRIPTOR);
android.service.notification.INotificationListener _arg0;
_arg0 = android.service.notification.INotificationListener.Stub.asInterface(data.readStrongBinder());
int _arg1;
_arg1 = data.readInt();
this.unregisterListener(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_cancelNotificationFromListener:
{
data.enforceInterface(DESCRIPTOR);
android.service.notification.INotificationListener _arg0;
_arg0 = android.service.notification.INotificationListener.Stub.asInterface(data.readStrongBinder());
java.lang.String _arg1;
_arg1 = data.readString();
java.lang.String _arg2;
_arg2 = data.readString();
int _arg3;
_arg3 = data.readInt();
this.cancelNotificationFromListener(_arg0, _arg1, _arg2, _arg3);
reply.writeNoException();
return true;
}
case TRANSACTION_cancelNotificationsFromListener:
{
data.enforceInterface(DESCRIPTOR);
android.service.notification.INotificationListener _arg0;
_arg0 = android.service.notification.INotificationListener.Stub.asInterface(data.readStrongBinder());
java.lang.String[] _arg1;
_arg1 = data.createStringArray();
this.cancelNotificationsFromListener(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_setNotificationsShownFromListener:
{
data.enforceInterface(DESCRIPTOR);
android.service.notification.INotificationListener _arg0;
_arg0 = android.service.notification.INotificationListener.Stub.asInterface(data.readStrongBinder());
java.lang.String[] _arg1;
_arg1 = data.createStringArray();
this.setNotificationsShownFromListener(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_getActiveNotificationsFromListener:
{
data.enforceInterface(DESCRIPTOR);
android.service.notification.INotificationListener _arg0;
_arg0 = android.service.notification.INotificationListener.Stub.asInterface(data.readStrongBinder());
java.lang.String[] _arg1;
_arg1 = data.createStringArray();
int _arg2;
_arg2 = data.readInt();
android.content.pm.ParceledListSlice _result = this.getActiveNotificationsFromListener(_arg0, _arg1, _arg2);
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
case TRANSACTION_requestHintsFromListener:
{
data.enforceInterface(DESCRIPTOR);
android.service.notification.INotificationListener _arg0;
_arg0 = android.service.notification.INotificationListener.Stub.asInterface(data.readStrongBinder());
int _arg1;
_arg1 = data.readInt();
this.requestHintsFromListener(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_getHintsFromListener:
{
data.enforceInterface(DESCRIPTOR);
android.service.notification.INotificationListener _arg0;
_arg0 = android.service.notification.INotificationListener.Stub.asInterface(data.readStrongBinder());
int _result = this.getHintsFromListener(_arg0);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_requestInterruptionFilterFromListener:
{
data.enforceInterface(DESCRIPTOR);
android.service.notification.INotificationListener _arg0;
_arg0 = android.service.notification.INotificationListener.Stub.asInterface(data.readStrongBinder());
int _arg1;
_arg1 = data.readInt();
this.requestInterruptionFilterFromListener(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_getInterruptionFilterFromListener:
{
data.enforceInterface(DESCRIPTOR);
android.service.notification.INotificationListener _arg0;
_arg0 = android.service.notification.INotificationListener.Stub.asInterface(data.readStrongBinder());
int _result = this.getInterruptionFilterFromListener(_arg0);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_setOnNotificationPostedTrimFromListener:
{
data.enforceInterface(DESCRIPTOR);
android.service.notification.INotificationListener _arg0;
_arg0 = android.service.notification.INotificationListener.Stub.asInterface(data.readStrongBinder());
int _arg1;
_arg1 = data.readInt();
this.setOnNotificationPostedTrimFromListener(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_setInterruptionFilter:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
int _arg1;
_arg1 = data.readInt();
this.setInterruptionFilter(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_getEffectsSuppressor:
{
data.enforceInterface(DESCRIPTOR);
android.content.ComponentName _result = this.getEffectsSuppressor();
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
case TRANSACTION_matchesCallFilter:
{
data.enforceInterface(DESCRIPTOR);
android.os.Bundle _arg0;
if ((0!=data.readInt())) {
_arg0 = android.os.Bundle.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
boolean _result = this.matchesCallFilter(_arg0);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_isSystemConditionProviderEnabled:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
boolean _result = this.isSystemConditionProviderEnabled(_arg0);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_getZenMode:
{
data.enforceInterface(DESCRIPTOR);
int _result = this.getZenMode();
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_getZenModeConfig:
{
data.enforceInterface(DESCRIPTOR);
android.service.notification.ZenModeConfig _result = this.getZenModeConfig();
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
case TRANSACTION_setZenModeConfig:
{
data.enforceInterface(DESCRIPTOR);
android.service.notification.ZenModeConfig _arg0;
if ((0!=data.readInt())) {
_arg0 = android.service.notification.ZenModeConfig.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
java.lang.String _arg1;
_arg1 = data.readString();
boolean _result = this.setZenModeConfig(_arg0, _arg1);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_setZenMode:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
android.net.Uri _arg1;
if ((0!=data.readInt())) {
_arg1 = android.net.Uri.CREATOR.createFromParcel(data);
}
else {
_arg1 = null;
}
java.lang.String _arg2;
_arg2 = data.readString();
this.setZenMode(_arg0, _arg1, _arg2);
return true;
}
case TRANSACTION_notifyConditions:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
android.service.notification.IConditionProvider _arg1;
_arg1 = android.service.notification.IConditionProvider.Stub.asInterface(data.readStrongBinder());
android.service.notification.Condition[] _arg2;
_arg2 = data.createTypedArray(android.service.notification.Condition.CREATOR);
this.notifyConditions(_arg0, _arg1, _arg2);
return true;
}
case TRANSACTION_requestZenModeConditions:
{
data.enforceInterface(DESCRIPTOR);
android.service.notification.IConditionListener _arg0;
_arg0 = android.service.notification.IConditionListener.Stub.asInterface(data.readStrongBinder());
int _arg1;
_arg1 = data.readInt();
this.requestZenModeConditions(_arg0, _arg1);
return true;
}
case TRANSACTION_isNotificationPolicyAccessGranted:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
boolean _result = this.isNotificationPolicyAccessGranted(_arg0);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_getNotificationPolicy:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
android.app.NotificationManager.Policy _result = this.getNotificationPolicy(_arg0);
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
case TRANSACTION_setNotificationPolicy:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
android.app.NotificationManager.Policy _arg1;
if ((0!=data.readInt())) {
_arg1 = android.app.NotificationManager.Policy.CREATOR.createFromParcel(data);
}
else {
_arg1 = null;
}
this.setNotificationPolicy(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_getPackagesRequestingNotificationPolicyAccess:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String[] _result = this.getPackagesRequestingNotificationPolicyAccess();
reply.writeNoException();
reply.writeStringArray(_result);
return true;
}
case TRANSACTION_isNotificationPolicyAccessGrantedForPackage:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
boolean _result = this.isNotificationPolicyAccessGrantedForPackage(_arg0);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_setNotificationPolicyAccessGranted:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
boolean _arg1;
_arg1 = (0!=data.readInt());
this.setNotificationPolicyAccessGranted(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_getBackupPayload:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
byte[] _result = this.getBackupPayload(_arg0);
reply.writeNoException();
reply.writeByteArray(_result);
return true;
}
case TRANSACTION_applyRestore:
{
data.enforceInterface(DESCRIPTOR);
byte[] _arg0;
_arg0 = data.createByteArray();
int _arg1;
_arg1 = data.readInt();
this.applyRestore(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_getAppActiveNotifications:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
int _arg1;
_arg1 = data.readInt();
android.content.pm.ParceledListSlice _result = this.getAppActiveNotifications(_arg0, _arg1);
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
private static class Proxy implements android.app.INotificationManager
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
@Override public void cancelAllNotifications(java.lang.String pkg, int userId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(pkg);
_data.writeInt(userId);
mRemote.transact(Stub.TRANSACTION_cancelAllNotifications, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void enqueueToast(java.lang.String pkg, android.app.ITransientNotification callback, int duration) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(pkg);
_data.writeStrongBinder((((callback!=null))?(callback.asBinder()):(null)));
_data.writeInt(duration);
mRemote.transact(Stub.TRANSACTION_enqueueToast, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void cancelToast(java.lang.String pkg, android.app.ITransientNotification callback) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(pkg);
_data.writeStrongBinder((((callback!=null))?(callback.asBinder()):(null)));
mRemote.transact(Stub.TRANSACTION_cancelToast, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void enqueueNotificationWithTag(java.lang.String pkg, java.lang.String opPkg, java.lang.String tag, int id, android.app.Notification notification, int[] idReceived, int userId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(pkg);
_data.writeString(opPkg);
_data.writeString(tag);
_data.writeInt(id);
if ((notification!=null)) {
_data.writeInt(1);
notification.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeIntArray(idReceived);
_data.writeInt(userId);
mRemote.transact(Stub.TRANSACTION_enqueueNotificationWithTag, _data, _reply, 0);
_reply.readException();
_reply.readIntArray(idReceived);
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void cancelNotificationWithTag(java.lang.String pkg, java.lang.String tag, int id, int userId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(pkg);
_data.writeString(tag);
_data.writeInt(id);
_data.writeInt(userId);
mRemote.transact(Stub.TRANSACTION_cancelNotificationWithTag, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void setNotificationsEnabledForPackage(java.lang.String pkg, int uid, boolean enabled) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(pkg);
_data.writeInt(uid);
_data.writeInt(((enabled)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_setNotificationsEnabledForPackage, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public boolean areNotificationsEnabledForPackage(java.lang.String pkg, int uid) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(pkg);
_data.writeInt(uid);
mRemote.transact(Stub.TRANSACTION_areNotificationsEnabledForPackage, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public void setPackagePriority(java.lang.String pkg, int uid, int priority) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(pkg);
_data.writeInt(uid);
_data.writeInt(priority);
mRemote.transact(Stub.TRANSACTION_setPackagePriority, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public int getPackagePriority(java.lang.String pkg, int uid) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(pkg);
_data.writeInt(uid);
mRemote.transact(Stub.TRANSACTION_getPackagePriority, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public void setPackagePeekable(java.lang.String pkg, int uid, boolean peekable) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(pkg);
_data.writeInt(uid);
_data.writeInt(((peekable)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_setPackagePeekable, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public boolean getPackagePeekable(java.lang.String pkg, int uid) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(pkg);
_data.writeInt(uid);
mRemote.transact(Stub.TRANSACTION_getPackagePeekable, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public void setPackageVisibilityOverride(java.lang.String pkg, int uid, int visibility) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(pkg);
_data.writeInt(uid);
_data.writeInt(visibility);
mRemote.transact(Stub.TRANSACTION_setPackageVisibilityOverride, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public int getPackageVisibilityOverride(java.lang.String pkg, int uid) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(pkg);
_data.writeInt(uid);
mRemote.transact(Stub.TRANSACTION_getPackageVisibilityOverride, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
// TODO: Remove this when callers have been migrated to the equivalent
// INotificationListener method.

@Override public android.service.notification.StatusBarNotification[] getActiveNotifications(java.lang.String callingPkg) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
android.service.notification.StatusBarNotification[] _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(callingPkg);
mRemote.transact(Stub.TRANSACTION_getActiveNotifications, _data, _reply, 0);
_reply.readException();
_result = _reply.createTypedArray(android.service.notification.StatusBarNotification.CREATOR);
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public android.service.notification.StatusBarNotification[] getHistoricalNotifications(java.lang.String callingPkg, int count) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
android.service.notification.StatusBarNotification[] _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(callingPkg);
_data.writeInt(count);
mRemote.transact(Stub.TRANSACTION_getHistoricalNotifications, _data, _reply, 0);
_reply.readException();
_result = _reply.createTypedArray(android.service.notification.StatusBarNotification.CREATOR);
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public void registerListener(android.service.notification.INotificationListener listener, android.content.ComponentName component, int userid) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((listener!=null))?(listener.asBinder()):(null)));
if ((component!=null)) {
_data.writeInt(1);
component.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeInt(userid);
mRemote.transact(Stub.TRANSACTION_registerListener, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void unregisterListener(android.service.notification.INotificationListener listener, int userid) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((listener!=null))?(listener.asBinder()):(null)));
_data.writeInt(userid);
mRemote.transact(Stub.TRANSACTION_unregisterListener, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void cancelNotificationFromListener(android.service.notification.INotificationListener token, java.lang.String pkg, java.lang.String tag, int id) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((token!=null))?(token.asBinder()):(null)));
_data.writeString(pkg);
_data.writeString(tag);
_data.writeInt(id);
mRemote.transact(Stub.TRANSACTION_cancelNotificationFromListener, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void cancelNotificationsFromListener(android.service.notification.INotificationListener token, java.lang.String[] keys) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((token!=null))?(token.asBinder()):(null)));
_data.writeStringArray(keys);
mRemote.transact(Stub.TRANSACTION_cancelNotificationsFromListener, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void setNotificationsShownFromListener(android.service.notification.INotificationListener token, java.lang.String[] keys) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((token!=null))?(token.asBinder()):(null)));
_data.writeStringArray(keys);
mRemote.transact(Stub.TRANSACTION_setNotificationsShownFromListener, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public android.content.pm.ParceledListSlice getActiveNotificationsFromListener(android.service.notification.INotificationListener token, java.lang.String[] keys, int trim) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
android.content.pm.ParceledListSlice _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((token!=null))?(token.asBinder()):(null)));
_data.writeStringArray(keys);
_data.writeInt(trim);
mRemote.transact(Stub.TRANSACTION_getActiveNotificationsFromListener, _data, _reply, 0);
_reply.readException();
if ((0!=_reply.readInt())) {
_result = android.content.pm.ParceledListSlice.CREATOR.createFromParcel(_reply);
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
@Override public void requestHintsFromListener(android.service.notification.INotificationListener token, int hints) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((token!=null))?(token.asBinder()):(null)));
_data.writeInt(hints);
mRemote.transact(Stub.TRANSACTION_requestHintsFromListener, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public int getHintsFromListener(android.service.notification.INotificationListener token) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((token!=null))?(token.asBinder()):(null)));
mRemote.transact(Stub.TRANSACTION_getHintsFromListener, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public void requestInterruptionFilterFromListener(android.service.notification.INotificationListener token, int interruptionFilter) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((token!=null))?(token.asBinder()):(null)));
_data.writeInt(interruptionFilter);
mRemote.transact(Stub.TRANSACTION_requestInterruptionFilterFromListener, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public int getInterruptionFilterFromListener(android.service.notification.INotificationListener token) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((token!=null))?(token.asBinder()):(null)));
mRemote.transact(Stub.TRANSACTION_getInterruptionFilterFromListener, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public void setOnNotificationPostedTrimFromListener(android.service.notification.INotificationListener token, int trim) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((token!=null))?(token.asBinder()):(null)));
_data.writeInt(trim);
mRemote.transact(Stub.TRANSACTION_setOnNotificationPostedTrimFromListener, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void setInterruptionFilter(java.lang.String pkg, int interruptionFilter) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(pkg);
_data.writeInt(interruptionFilter);
mRemote.transact(Stub.TRANSACTION_setInterruptionFilter, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public android.content.ComponentName getEffectsSuppressor() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
android.content.ComponentName _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getEffectsSuppressor, _data, _reply, 0);
_reply.readException();
if ((0!=_reply.readInt())) {
_result = android.content.ComponentName.CREATOR.createFromParcel(_reply);
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
@Override public boolean matchesCallFilter(android.os.Bundle extras) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((extras!=null)) {
_data.writeInt(1);
extras.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_matchesCallFilter, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public boolean isSystemConditionProviderEnabled(java.lang.String path) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(path);
mRemote.transact(Stub.TRANSACTION_isSystemConditionProviderEnabled, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public int getZenMode() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getZenMode, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public android.service.notification.ZenModeConfig getZenModeConfig() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
android.service.notification.ZenModeConfig _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getZenModeConfig, _data, _reply, 0);
_reply.readException();
if ((0!=_reply.readInt())) {
_result = android.service.notification.ZenModeConfig.CREATOR.createFromParcel(_reply);
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
@Override public boolean setZenModeConfig(android.service.notification.ZenModeConfig config, java.lang.String reason) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((config!=null)) {
_data.writeInt(1);
config.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeString(reason);
mRemote.transact(Stub.TRANSACTION_setZenModeConfig, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public void setZenMode(int mode, android.net.Uri conditionId, java.lang.String reason) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(mode);
if ((conditionId!=null)) {
_data.writeInt(1);
conditionId.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeString(reason);
mRemote.transact(Stub.TRANSACTION_setZenMode, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void notifyConditions(java.lang.String pkg, android.service.notification.IConditionProvider provider, android.service.notification.Condition[] conditions) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(pkg);
_data.writeStrongBinder((((provider!=null))?(provider.asBinder()):(null)));
_data.writeTypedArray(conditions, 0);
mRemote.transact(Stub.TRANSACTION_notifyConditions, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void requestZenModeConditions(android.service.notification.IConditionListener callback, int relevance) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((callback!=null))?(callback.asBinder()):(null)));
_data.writeInt(relevance);
mRemote.transact(Stub.TRANSACTION_requestZenModeConditions, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public boolean isNotificationPolicyAccessGranted(java.lang.String pkg) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(pkg);
mRemote.transact(Stub.TRANSACTION_isNotificationPolicyAccessGranted, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public android.app.NotificationManager.Policy getNotificationPolicy(java.lang.String pkg) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
android.app.NotificationManager.Policy _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(pkg);
mRemote.transact(Stub.TRANSACTION_getNotificationPolicy, _data, _reply, 0);
_reply.readException();
if ((0!=_reply.readInt())) {
_result = android.app.NotificationManager.Policy.CREATOR.createFromParcel(_reply);
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
@Override public void setNotificationPolicy(java.lang.String pkg, android.app.NotificationManager.Policy policy) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(pkg);
if ((policy!=null)) {
_data.writeInt(1);
policy.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_setNotificationPolicy, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public java.lang.String[] getPackagesRequestingNotificationPolicyAccess() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.lang.String[] _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getPackagesRequestingNotificationPolicyAccess, _data, _reply, 0);
_reply.readException();
_result = _reply.createStringArray();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public boolean isNotificationPolicyAccessGrantedForPackage(java.lang.String pkg) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(pkg);
mRemote.transact(Stub.TRANSACTION_isNotificationPolicyAccessGrantedForPackage, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public void setNotificationPolicyAccessGranted(java.lang.String pkg, boolean granted) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(pkg);
_data.writeInt(((granted)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_setNotificationPolicyAccessGranted, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public byte[] getBackupPayload(int user) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
byte[] _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(user);
mRemote.transact(Stub.TRANSACTION_getBackupPayload, _data, _reply, 0);
_reply.readException();
_result = _reply.createByteArray();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public void applyRestore(byte[] payload, int user) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeByteArray(payload);
_data.writeInt(user);
mRemote.transact(Stub.TRANSACTION_applyRestore, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public android.content.pm.ParceledListSlice getAppActiveNotifications(java.lang.String callingPkg, int userId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
android.content.pm.ParceledListSlice _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(callingPkg);
_data.writeInt(userId);
mRemote.transact(Stub.TRANSACTION_getAppActiveNotifications, _data, _reply, 0);
_reply.readException();
if ((0!=_reply.readInt())) {
_result = android.content.pm.ParceledListSlice.CREATOR.createFromParcel(_reply);
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
static final int TRANSACTION_cancelAllNotifications = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_enqueueToast = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_cancelToast = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
static final int TRANSACTION_enqueueNotificationWithTag = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
static final int TRANSACTION_cancelNotificationWithTag = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
static final int TRANSACTION_setNotificationsEnabledForPackage = (android.os.IBinder.FIRST_CALL_TRANSACTION + 5);
static final int TRANSACTION_areNotificationsEnabledForPackage = (android.os.IBinder.FIRST_CALL_TRANSACTION + 6);
static final int TRANSACTION_setPackagePriority = (android.os.IBinder.FIRST_CALL_TRANSACTION + 7);
static final int TRANSACTION_getPackagePriority = (android.os.IBinder.FIRST_CALL_TRANSACTION + 8);
static final int TRANSACTION_setPackagePeekable = (android.os.IBinder.FIRST_CALL_TRANSACTION + 9);
static final int TRANSACTION_getPackagePeekable = (android.os.IBinder.FIRST_CALL_TRANSACTION + 10);
static final int TRANSACTION_setPackageVisibilityOverride = (android.os.IBinder.FIRST_CALL_TRANSACTION + 11);
static final int TRANSACTION_getPackageVisibilityOverride = (android.os.IBinder.FIRST_CALL_TRANSACTION + 12);
static final int TRANSACTION_getActiveNotifications = (android.os.IBinder.FIRST_CALL_TRANSACTION + 13);
static final int TRANSACTION_getHistoricalNotifications = (android.os.IBinder.FIRST_CALL_TRANSACTION + 14);
static final int TRANSACTION_registerListener = (android.os.IBinder.FIRST_CALL_TRANSACTION + 15);
static final int TRANSACTION_unregisterListener = (android.os.IBinder.FIRST_CALL_TRANSACTION + 16);
static final int TRANSACTION_cancelNotificationFromListener = (android.os.IBinder.FIRST_CALL_TRANSACTION + 17);
static final int TRANSACTION_cancelNotificationsFromListener = (android.os.IBinder.FIRST_CALL_TRANSACTION + 18);
static final int TRANSACTION_setNotificationsShownFromListener = (android.os.IBinder.FIRST_CALL_TRANSACTION + 19);
static final int TRANSACTION_getActiveNotificationsFromListener = (android.os.IBinder.FIRST_CALL_TRANSACTION + 20);
static final int TRANSACTION_requestHintsFromListener = (android.os.IBinder.FIRST_CALL_TRANSACTION + 21);
static final int TRANSACTION_getHintsFromListener = (android.os.IBinder.FIRST_CALL_TRANSACTION + 22);
static final int TRANSACTION_requestInterruptionFilterFromListener = (android.os.IBinder.FIRST_CALL_TRANSACTION + 23);
static final int TRANSACTION_getInterruptionFilterFromListener = (android.os.IBinder.FIRST_CALL_TRANSACTION + 24);
static final int TRANSACTION_setOnNotificationPostedTrimFromListener = (android.os.IBinder.FIRST_CALL_TRANSACTION + 25);
static final int TRANSACTION_setInterruptionFilter = (android.os.IBinder.FIRST_CALL_TRANSACTION + 26);
static final int TRANSACTION_getEffectsSuppressor = (android.os.IBinder.FIRST_CALL_TRANSACTION + 27);
static final int TRANSACTION_matchesCallFilter = (android.os.IBinder.FIRST_CALL_TRANSACTION + 28);
static final int TRANSACTION_isSystemConditionProviderEnabled = (android.os.IBinder.FIRST_CALL_TRANSACTION + 29);
static final int TRANSACTION_getZenMode = (android.os.IBinder.FIRST_CALL_TRANSACTION + 30);
static final int TRANSACTION_getZenModeConfig = (android.os.IBinder.FIRST_CALL_TRANSACTION + 31);
static final int TRANSACTION_setZenModeConfig = (android.os.IBinder.FIRST_CALL_TRANSACTION + 32);
static final int TRANSACTION_setZenMode = (android.os.IBinder.FIRST_CALL_TRANSACTION + 33);
static final int TRANSACTION_notifyConditions = (android.os.IBinder.FIRST_CALL_TRANSACTION + 34);
static final int TRANSACTION_requestZenModeConditions = (android.os.IBinder.FIRST_CALL_TRANSACTION + 35);
static final int TRANSACTION_isNotificationPolicyAccessGranted = (android.os.IBinder.FIRST_CALL_TRANSACTION + 36);
static final int TRANSACTION_getNotificationPolicy = (android.os.IBinder.FIRST_CALL_TRANSACTION + 37);
static final int TRANSACTION_setNotificationPolicy = (android.os.IBinder.FIRST_CALL_TRANSACTION + 38);
static final int TRANSACTION_getPackagesRequestingNotificationPolicyAccess = (android.os.IBinder.FIRST_CALL_TRANSACTION + 39);
static final int TRANSACTION_isNotificationPolicyAccessGrantedForPackage = (android.os.IBinder.FIRST_CALL_TRANSACTION + 40);
static final int TRANSACTION_setNotificationPolicyAccessGranted = (android.os.IBinder.FIRST_CALL_TRANSACTION + 41);
static final int TRANSACTION_getBackupPayload = (android.os.IBinder.FIRST_CALL_TRANSACTION + 42);
static final int TRANSACTION_applyRestore = (android.os.IBinder.FIRST_CALL_TRANSACTION + 43);
static final int TRANSACTION_getAppActiveNotifications = (android.os.IBinder.FIRST_CALL_TRANSACTION + 44);
}
public void cancelAllNotifications(java.lang.String pkg, int userId) throws android.os.RemoteException;
public void enqueueToast(java.lang.String pkg, android.app.ITransientNotification callback, int duration) throws android.os.RemoteException;
public void cancelToast(java.lang.String pkg, android.app.ITransientNotification callback) throws android.os.RemoteException;
public void enqueueNotificationWithTag(java.lang.String pkg, java.lang.String opPkg, java.lang.String tag, int id, android.app.Notification notification, int[] idReceived, int userId) throws android.os.RemoteException;
public void cancelNotificationWithTag(java.lang.String pkg, java.lang.String tag, int id, int userId) throws android.os.RemoteException;
public void setNotificationsEnabledForPackage(java.lang.String pkg, int uid, boolean enabled) throws android.os.RemoteException;
public boolean areNotificationsEnabledForPackage(java.lang.String pkg, int uid) throws android.os.RemoteException;
public void setPackagePriority(java.lang.String pkg, int uid, int priority) throws android.os.RemoteException;
public int getPackagePriority(java.lang.String pkg, int uid) throws android.os.RemoteException;
public void setPackagePeekable(java.lang.String pkg, int uid, boolean peekable) throws android.os.RemoteException;
public boolean getPackagePeekable(java.lang.String pkg, int uid) throws android.os.RemoteException;
public void setPackageVisibilityOverride(java.lang.String pkg, int uid, int visibility) throws android.os.RemoteException;
public int getPackageVisibilityOverride(java.lang.String pkg, int uid) throws android.os.RemoteException;
// TODO: Remove this when callers have been migrated to the equivalent
// INotificationListener method.

public android.service.notification.StatusBarNotification[] getActiveNotifications(java.lang.String callingPkg) throws android.os.RemoteException;
public android.service.notification.StatusBarNotification[] getHistoricalNotifications(java.lang.String callingPkg, int count) throws android.os.RemoteException;
public void registerListener(android.service.notification.INotificationListener listener, android.content.ComponentName component, int userid) throws android.os.RemoteException;
public void unregisterListener(android.service.notification.INotificationListener listener, int userid) throws android.os.RemoteException;
public void cancelNotificationFromListener(android.service.notification.INotificationListener token, java.lang.String pkg, java.lang.String tag, int id) throws android.os.RemoteException;
public void cancelNotificationsFromListener(android.service.notification.INotificationListener token, java.lang.String[] keys) throws android.os.RemoteException;
public void setNotificationsShownFromListener(android.service.notification.INotificationListener token, java.lang.String[] keys) throws android.os.RemoteException;
public android.content.pm.ParceledListSlice getActiveNotificationsFromListener(android.service.notification.INotificationListener token, java.lang.String[] keys, int trim) throws android.os.RemoteException;
public void requestHintsFromListener(android.service.notification.INotificationListener token, int hints) throws android.os.RemoteException;
public int getHintsFromListener(android.service.notification.INotificationListener token) throws android.os.RemoteException;
public void requestInterruptionFilterFromListener(android.service.notification.INotificationListener token, int interruptionFilter) throws android.os.RemoteException;
public int getInterruptionFilterFromListener(android.service.notification.INotificationListener token) throws android.os.RemoteException;
public void setOnNotificationPostedTrimFromListener(android.service.notification.INotificationListener token, int trim) throws android.os.RemoteException;
public void setInterruptionFilter(java.lang.String pkg, int interruptionFilter) throws android.os.RemoteException;
public android.content.ComponentName getEffectsSuppressor() throws android.os.RemoteException;
public boolean matchesCallFilter(android.os.Bundle extras) throws android.os.RemoteException;
public boolean isSystemConditionProviderEnabled(java.lang.String path) throws android.os.RemoteException;
public int getZenMode() throws android.os.RemoteException;
public android.service.notification.ZenModeConfig getZenModeConfig() throws android.os.RemoteException;
public boolean setZenModeConfig(android.service.notification.ZenModeConfig config, java.lang.String reason) throws android.os.RemoteException;
public void setZenMode(int mode, android.net.Uri conditionId, java.lang.String reason) throws android.os.RemoteException;
public void notifyConditions(java.lang.String pkg, android.service.notification.IConditionProvider provider, android.service.notification.Condition[] conditions) throws android.os.RemoteException;
public void requestZenModeConditions(android.service.notification.IConditionListener callback, int relevance) throws android.os.RemoteException;
public boolean isNotificationPolicyAccessGranted(java.lang.String pkg) throws android.os.RemoteException;
public android.app.NotificationManager.Policy getNotificationPolicy(java.lang.String pkg) throws android.os.RemoteException;
public void setNotificationPolicy(java.lang.String pkg, android.app.NotificationManager.Policy policy) throws android.os.RemoteException;
public java.lang.String[] getPackagesRequestingNotificationPolicyAccess() throws android.os.RemoteException;
public boolean isNotificationPolicyAccessGrantedForPackage(java.lang.String pkg) throws android.os.RemoteException;
public void setNotificationPolicyAccessGranted(java.lang.String pkg, boolean granted) throws android.os.RemoteException;
public byte[] getBackupPayload(int user) throws android.os.RemoteException;
public void applyRestore(byte[] payload, int user) throws android.os.RemoteException;
public android.content.pm.ParceledListSlice getAppActiveNotifications(java.lang.String callingPkg, int userId) throws android.os.RemoteException;
}
