/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: frameworks/base/core/java/android/printservice/IPrintService.aidl
 */
package android.printservice;
/**
 * Top-level interface to a print service component.
 *
 * @hide
 */
public interface IPrintService extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements android.printservice.IPrintService
{
private static final java.lang.String DESCRIPTOR = "android.printservice.IPrintService";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an android.printservice.IPrintService interface,
 * generating a proxy if needed.
 */
public static android.printservice.IPrintService asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof android.printservice.IPrintService))) {
return ((android.printservice.IPrintService)iin);
}
return new android.printservice.IPrintService.Stub.Proxy(obj);
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
case TRANSACTION_setClient:
{
data.enforceInterface(DESCRIPTOR);
android.printservice.IPrintServiceClient _arg0;
_arg0 = android.printservice.IPrintServiceClient.Stub.asInterface(data.readStrongBinder());
this.setClient(_arg0);
return true;
}
case TRANSACTION_requestCancelPrintJob:
{
data.enforceInterface(DESCRIPTOR);
android.print.PrintJobInfo _arg0;
if ((0!=data.readInt())) {
_arg0 = android.print.PrintJobInfo.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
this.requestCancelPrintJob(_arg0);
return true;
}
case TRANSACTION_onPrintJobQueued:
{
data.enforceInterface(DESCRIPTOR);
android.print.PrintJobInfo _arg0;
if ((0!=data.readInt())) {
_arg0 = android.print.PrintJobInfo.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
this.onPrintJobQueued(_arg0);
return true;
}
case TRANSACTION_createPrinterDiscoverySession:
{
data.enforceInterface(DESCRIPTOR);
this.createPrinterDiscoverySession();
return true;
}
case TRANSACTION_startPrinterDiscovery:
{
data.enforceInterface(DESCRIPTOR);
java.util.List<android.print.PrinterId> _arg0;
_arg0 = data.createTypedArrayList(android.print.PrinterId.CREATOR);
this.startPrinterDiscovery(_arg0);
return true;
}
case TRANSACTION_stopPrinterDiscovery:
{
data.enforceInterface(DESCRIPTOR);
this.stopPrinterDiscovery();
return true;
}
case TRANSACTION_validatePrinters:
{
data.enforceInterface(DESCRIPTOR);
java.util.List<android.print.PrinterId> _arg0;
_arg0 = data.createTypedArrayList(android.print.PrinterId.CREATOR);
this.validatePrinters(_arg0);
return true;
}
case TRANSACTION_startPrinterStateTracking:
{
data.enforceInterface(DESCRIPTOR);
android.print.PrinterId _arg0;
if ((0!=data.readInt())) {
_arg0 = android.print.PrinterId.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
this.startPrinterStateTracking(_arg0);
return true;
}
case TRANSACTION_stopPrinterStateTracking:
{
data.enforceInterface(DESCRIPTOR);
android.print.PrinterId _arg0;
if ((0!=data.readInt())) {
_arg0 = android.print.PrinterId.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
this.stopPrinterStateTracking(_arg0);
return true;
}
case TRANSACTION_destroyPrinterDiscoverySession:
{
data.enforceInterface(DESCRIPTOR);
this.destroyPrinterDiscoverySession();
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements android.printservice.IPrintService
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
@Override public void setClient(android.printservice.IPrintServiceClient client) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((client!=null))?(client.asBinder()):(null)));
mRemote.transact(Stub.TRANSACTION_setClient, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void requestCancelPrintJob(android.print.PrintJobInfo printJobInfo) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((printJobInfo!=null)) {
_data.writeInt(1);
printJobInfo.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_requestCancelPrintJob, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void onPrintJobQueued(android.print.PrintJobInfo printJobInfo) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((printJobInfo!=null)) {
_data.writeInt(1);
printJobInfo.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_onPrintJobQueued, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void createPrinterDiscoverySession() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_createPrinterDiscoverySession, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void startPrinterDiscovery(java.util.List<android.print.PrinterId> priorityList) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeTypedList(priorityList);
mRemote.transact(Stub.TRANSACTION_startPrinterDiscovery, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void stopPrinterDiscovery() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_stopPrinterDiscovery, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void validatePrinters(java.util.List<android.print.PrinterId> printerIds) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeTypedList(printerIds);
mRemote.transact(Stub.TRANSACTION_validatePrinters, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void startPrinterStateTracking(android.print.PrinterId printerId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((printerId!=null)) {
_data.writeInt(1);
printerId.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_startPrinterStateTracking, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void stopPrinterStateTracking(android.print.PrinterId printerId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((printerId!=null)) {
_data.writeInt(1);
printerId.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_stopPrinterStateTracking, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void destroyPrinterDiscoverySession() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_destroyPrinterDiscoverySession, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
}
static final int TRANSACTION_setClient = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_requestCancelPrintJob = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_onPrintJobQueued = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
static final int TRANSACTION_createPrinterDiscoverySession = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
static final int TRANSACTION_startPrinterDiscovery = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
static final int TRANSACTION_stopPrinterDiscovery = (android.os.IBinder.FIRST_CALL_TRANSACTION + 5);
static final int TRANSACTION_validatePrinters = (android.os.IBinder.FIRST_CALL_TRANSACTION + 6);
static final int TRANSACTION_startPrinterStateTracking = (android.os.IBinder.FIRST_CALL_TRANSACTION + 7);
static final int TRANSACTION_stopPrinterStateTracking = (android.os.IBinder.FIRST_CALL_TRANSACTION + 8);
static final int TRANSACTION_destroyPrinterDiscoverySession = (android.os.IBinder.FIRST_CALL_TRANSACTION + 9);
}
public void setClient(android.printservice.IPrintServiceClient client) throws android.os.RemoteException;
public void requestCancelPrintJob(android.print.PrintJobInfo printJobInfo) throws android.os.RemoteException;
public void onPrintJobQueued(android.print.PrintJobInfo printJobInfo) throws android.os.RemoteException;
public void createPrinterDiscoverySession() throws android.os.RemoteException;
public void startPrinterDiscovery(java.util.List<android.print.PrinterId> priorityList) throws android.os.RemoteException;
public void stopPrinterDiscovery() throws android.os.RemoteException;
public void validatePrinters(java.util.List<android.print.PrinterId> printerIds) throws android.os.RemoteException;
public void startPrinterStateTracking(android.print.PrinterId printerId) throws android.os.RemoteException;
public void stopPrinterStateTracking(android.print.PrinterId printerId) throws android.os.RemoteException;
public void destroyPrinterDiscoverySession() throws android.os.RemoteException;
}
