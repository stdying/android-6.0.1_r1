/*___Generated_by_IDEA___*/

/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: /media/li/old/asop/aosp/frameworks/base/telephony/java/com/android/internal/telephony/ITelephony.aidl
 */
package com.android.internal.telephony;
/**
 * Interface used to interact with the phone.  Mostly this is used by the
 * TelephonyManager class.  A few places are still using this directly.
 * Please clean them up if possible and use TelephonyManager instead.
 *
 * {@hide}
 */
public interface ITelephony extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements com.android.internal.telephony.ITelephony
{
private static final java.lang.String DESCRIPTOR = "com.android.internal.telephony.ITelephony";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an com.android.internal.telephony.ITelephony interface,
 * generating a proxy if needed.
 */
public static com.android.internal.telephony.ITelephony asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof com.android.internal.telephony.ITelephony))) {
return ((com.android.internal.telephony.ITelephony)iin);
}
return new com.android.internal.telephony.ITelephony.Stub.Proxy(obj);
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
case TRANSACTION_dial:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
this.dial(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_call:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
java.lang.String _arg1;
_arg1 = data.readString();
this.call(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_endCall:
{
data.enforceInterface(DESCRIPTOR);
boolean _result = this.endCall();
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_endCallForSubscriber:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
boolean _result = this.endCallForSubscriber(_arg0);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_answerRingingCall:
{
data.enforceInterface(DESCRIPTOR);
this.answerRingingCall();
reply.writeNoException();
return true;
}
case TRANSACTION_answerRingingCallForSubscriber:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
this.answerRingingCallForSubscriber(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_silenceRinger:
{
data.enforceInterface(DESCRIPTOR);
this.silenceRinger();
reply.writeNoException();
return true;
}
case TRANSACTION_isOffhook:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
boolean _result = this.isOffhook(_arg0);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_isOffhookForSubscriber:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
java.lang.String _arg1;
_arg1 = data.readString();
boolean _result = this.isOffhookForSubscriber(_arg0, _arg1);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_isRingingForSubscriber:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
java.lang.String _arg1;
_arg1 = data.readString();
boolean _result = this.isRingingForSubscriber(_arg0, _arg1);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_isRinging:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
boolean _result = this.isRinging(_arg0);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_isIdle:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
boolean _result = this.isIdle(_arg0);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_isIdleForSubscriber:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
java.lang.String _arg1;
_arg1 = data.readString();
boolean _result = this.isIdleForSubscriber(_arg0, _arg1);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_isRadioOn:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
boolean _result = this.isRadioOn(_arg0);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_isRadioOnForSubscriber:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
java.lang.String _arg1;
_arg1 = data.readString();
boolean _result = this.isRadioOnForSubscriber(_arg0, _arg1);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_isSimPinEnabled:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
boolean _result = this.isSimPinEnabled(_arg0);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_supplyPin:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
boolean _result = this.supplyPin(_arg0);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_supplyPinForSubscriber:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
java.lang.String _arg1;
_arg1 = data.readString();
boolean _result = this.supplyPinForSubscriber(_arg0, _arg1);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_supplyPuk:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
java.lang.String _arg1;
_arg1 = data.readString();
boolean _result = this.supplyPuk(_arg0, _arg1);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_supplyPukForSubscriber:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
java.lang.String _arg1;
_arg1 = data.readString();
java.lang.String _arg2;
_arg2 = data.readString();
boolean _result = this.supplyPukForSubscriber(_arg0, _arg1, _arg2);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_supplyPinReportResult:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
int[] _result = this.supplyPinReportResult(_arg0);
reply.writeNoException();
reply.writeIntArray(_result);
return true;
}
case TRANSACTION_supplyPinReportResultForSubscriber:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
java.lang.String _arg1;
_arg1 = data.readString();
int[] _result = this.supplyPinReportResultForSubscriber(_arg0, _arg1);
reply.writeNoException();
reply.writeIntArray(_result);
return true;
}
case TRANSACTION_supplyPukReportResult:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
java.lang.String _arg1;
_arg1 = data.readString();
int[] _result = this.supplyPukReportResult(_arg0, _arg1);
reply.writeNoException();
reply.writeIntArray(_result);
return true;
}
case TRANSACTION_supplyPukReportResultForSubscriber:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
java.lang.String _arg1;
_arg1 = data.readString();
java.lang.String _arg2;
_arg2 = data.readString();
int[] _result = this.supplyPukReportResultForSubscriber(_arg0, _arg1, _arg2);
reply.writeNoException();
reply.writeIntArray(_result);
return true;
}
case TRANSACTION_handlePinMmi:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
boolean _result = this.handlePinMmi(_arg0);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_handlePinMmiForSubscriber:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
java.lang.String _arg1;
_arg1 = data.readString();
boolean _result = this.handlePinMmiForSubscriber(_arg0, _arg1);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_toggleRadioOnOff:
{
data.enforceInterface(DESCRIPTOR);
this.toggleRadioOnOff();
reply.writeNoException();
return true;
}
case TRANSACTION_toggleRadioOnOffForSubscriber:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
this.toggleRadioOnOffForSubscriber(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_setRadio:
{
data.enforceInterface(DESCRIPTOR);
boolean _arg0;
_arg0 = (0!=data.readInt());
boolean _result = this.setRadio(_arg0);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_setRadioForSubscriber:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
boolean _arg1;
_arg1 = (0!=data.readInt());
boolean _result = this.setRadioForSubscriber(_arg0, _arg1);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_setRadioPower:
{
data.enforceInterface(DESCRIPTOR);
boolean _arg0;
_arg0 = (0!=data.readInt());
boolean _result = this.setRadioPower(_arg0);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_updateServiceLocation:
{
data.enforceInterface(DESCRIPTOR);
this.updateServiceLocation();
reply.writeNoException();
return true;
}
case TRANSACTION_updateServiceLocationForSubscriber:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
this.updateServiceLocationForSubscriber(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_enableLocationUpdates:
{
data.enforceInterface(DESCRIPTOR);
this.enableLocationUpdates();
reply.writeNoException();
return true;
}
case TRANSACTION_enableLocationUpdatesForSubscriber:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
this.enableLocationUpdatesForSubscriber(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_disableLocationUpdates:
{
data.enforceInterface(DESCRIPTOR);
this.disableLocationUpdates();
reply.writeNoException();
return true;
}
case TRANSACTION_disableLocationUpdatesForSubscriber:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
this.disableLocationUpdatesForSubscriber(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_enableDataConnectivity:
{
data.enforceInterface(DESCRIPTOR);
boolean _result = this.enableDataConnectivity();
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_disableDataConnectivity:
{
data.enforceInterface(DESCRIPTOR);
boolean _result = this.disableDataConnectivity();
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_isDataConnectivityPossible:
{
data.enforceInterface(DESCRIPTOR);
boolean _result = this.isDataConnectivityPossible();
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_getCellLocation:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
android.os.Bundle _result = this.getCellLocation(_arg0);
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
case TRANSACTION_getNeighboringCellInfo:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
java.util.List<android.telephony.NeighboringCellInfo> _result = this.getNeighboringCellInfo(_arg0);
reply.writeNoException();
reply.writeTypedList(_result);
return true;
}
case TRANSACTION_getCallState:
{
data.enforceInterface(DESCRIPTOR);
int _result = this.getCallState();
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_getCallStateForSubscriber:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
int _result = this.getCallStateForSubscriber(_arg0);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_getDataActivity:
{
data.enforceInterface(DESCRIPTOR);
int _result = this.getDataActivity();
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_getDataState:
{
data.enforceInterface(DESCRIPTOR);
int _result = this.getDataState();
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_getActivePhoneType:
{
data.enforceInterface(DESCRIPTOR);
int _result = this.getActivePhoneType();
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_getActivePhoneTypeForSubscriber:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
int _result = this.getActivePhoneTypeForSubscriber(_arg0);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_getCdmaEriIconIndex:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
int _result = this.getCdmaEriIconIndex(_arg0);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_getCdmaEriIconIndexForSubscriber:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
java.lang.String _arg1;
_arg1 = data.readString();
int _result = this.getCdmaEriIconIndexForSubscriber(_arg0, _arg1);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_getCdmaEriIconMode:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
int _result = this.getCdmaEriIconMode(_arg0);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_getCdmaEriIconModeForSubscriber:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
java.lang.String _arg1;
_arg1 = data.readString();
int _result = this.getCdmaEriIconModeForSubscriber(_arg0, _arg1);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_getCdmaEriText:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
java.lang.String _result = this.getCdmaEriText(_arg0);
reply.writeNoException();
reply.writeString(_result);
return true;
}
case TRANSACTION_getCdmaEriTextForSubscriber:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
java.lang.String _arg1;
_arg1 = data.readString();
java.lang.String _result = this.getCdmaEriTextForSubscriber(_arg0, _arg1);
reply.writeNoException();
reply.writeString(_result);
return true;
}
case TRANSACTION_needsOtaServiceProvisioning:
{
data.enforceInterface(DESCRIPTOR);
boolean _result = this.needsOtaServiceProvisioning();
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_setVoiceMailNumber:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
java.lang.String _arg1;
_arg1 = data.readString();
java.lang.String _arg2;
_arg2 = data.readString();
boolean _result = this.setVoiceMailNumber(_arg0, _arg1, _arg2);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_getVoiceMessageCount:
{
data.enforceInterface(DESCRIPTOR);
int _result = this.getVoiceMessageCount();
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_getVoiceMessageCountForSubscriber:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
int _result = this.getVoiceMessageCountForSubscriber(_arg0);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_getNetworkType:
{
data.enforceInterface(DESCRIPTOR);
int _result = this.getNetworkType();
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_getNetworkTypeForSubscriber:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
java.lang.String _arg1;
_arg1 = data.readString();
int _result = this.getNetworkTypeForSubscriber(_arg0, _arg1);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_getDataNetworkType:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
int _result = this.getDataNetworkType(_arg0);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_getDataNetworkTypeForSubscriber:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
java.lang.String _arg1;
_arg1 = data.readString();
int _result = this.getDataNetworkTypeForSubscriber(_arg0, _arg1);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_getVoiceNetworkTypeForSubscriber:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
java.lang.String _arg1;
_arg1 = data.readString();
int _result = this.getVoiceNetworkTypeForSubscriber(_arg0, _arg1);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_hasIccCard:
{
data.enforceInterface(DESCRIPTOR);
boolean _result = this.hasIccCard();
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_hasIccCardUsingSlotId:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
boolean _result = this.hasIccCardUsingSlotId(_arg0);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_getLteOnCdmaMode:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
int _result = this.getLteOnCdmaMode(_arg0);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_getLteOnCdmaModeForSubscriber:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
java.lang.String _arg1;
_arg1 = data.readString();
int _result = this.getLteOnCdmaModeForSubscriber(_arg0, _arg1);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_getAllCellInfo:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
java.util.List<android.telephony.CellInfo> _result = this.getAllCellInfo(_arg0);
reply.writeNoException();
reply.writeTypedList(_result);
return true;
}
case TRANSACTION_setCellInfoListRate:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
this.setCellInfoListRate(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_getDefaultSim:
{
data.enforceInterface(DESCRIPTOR);
int _result = this.getDefaultSim();
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_iccOpenLogicalChannel:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
android.telephony.IccOpenLogicalChannelResponse _result = this.iccOpenLogicalChannel(_arg0);
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
case TRANSACTION_iccCloseLogicalChannel:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
boolean _result = this.iccCloseLogicalChannel(_arg0);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_iccTransmitApduLogicalChannel:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
int _arg1;
_arg1 = data.readInt();
int _arg2;
_arg2 = data.readInt();
int _arg3;
_arg3 = data.readInt();
int _arg4;
_arg4 = data.readInt();
int _arg5;
_arg5 = data.readInt();
java.lang.String _arg6;
_arg6 = data.readString();
java.lang.String _result = this.iccTransmitApduLogicalChannel(_arg0, _arg1, _arg2, _arg3, _arg4, _arg5, _arg6);
reply.writeNoException();
reply.writeString(_result);
return true;
}
case TRANSACTION_iccTransmitApduBasicChannel:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
int _arg1;
_arg1 = data.readInt();
int _arg2;
_arg2 = data.readInt();
int _arg3;
_arg3 = data.readInt();
int _arg4;
_arg4 = data.readInt();
java.lang.String _arg5;
_arg5 = data.readString();
java.lang.String _result = this.iccTransmitApduBasicChannel(_arg0, _arg1, _arg2, _arg3, _arg4, _arg5);
reply.writeNoException();
reply.writeString(_result);
return true;
}
case TRANSACTION_iccExchangeSimIO:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
int _arg1;
_arg1 = data.readInt();
int _arg2;
_arg2 = data.readInt();
int _arg3;
_arg3 = data.readInt();
int _arg4;
_arg4 = data.readInt();
java.lang.String _arg5;
_arg5 = data.readString();
byte[] _result = this.iccExchangeSimIO(_arg0, _arg1, _arg2, _arg3, _arg4, _arg5);
reply.writeNoException();
reply.writeByteArray(_result);
return true;
}
case TRANSACTION_sendEnvelopeWithStatus:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
java.lang.String _result = this.sendEnvelopeWithStatus(_arg0);
reply.writeNoException();
reply.writeString(_result);
return true;
}
case TRANSACTION_nvReadItem:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
java.lang.String _result = this.nvReadItem(_arg0);
reply.writeNoException();
reply.writeString(_result);
return true;
}
case TRANSACTION_nvWriteItem:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
java.lang.String _arg1;
_arg1 = data.readString();
boolean _result = this.nvWriteItem(_arg0, _arg1);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_nvWriteCdmaPrl:
{
data.enforceInterface(DESCRIPTOR);
byte[] _arg0;
_arg0 = data.createByteArray();
boolean _result = this.nvWriteCdmaPrl(_arg0);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_nvResetConfig:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
boolean _result = this.nvResetConfig(_arg0);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_getCalculatedPreferredNetworkType:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
int _result = this.getCalculatedPreferredNetworkType(_arg0);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_getPreferredNetworkType:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
int _result = this.getPreferredNetworkType(_arg0);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_getTetherApnRequired:
{
data.enforceInterface(DESCRIPTOR);
int _result = this.getTetherApnRequired();
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_setNetworkSelectionModeAutomatic:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
this.setNetworkSelectionModeAutomatic(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_getCellNetworkScanResults:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
com.android.internal.telephony.CellNetworkScanResult _result = this.getCellNetworkScanResults(_arg0);
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
case TRANSACTION_setNetworkSelectionModeManual:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
com.android.internal.telephony.OperatorInfo _arg1;
if ((0!=data.readInt())) {
_arg1 = com.android.internal.telephony.OperatorInfo.CREATOR.createFromParcel(data);
}
else {
_arg1 = null;
}
boolean _arg2;
_arg2 = (0!=data.readInt());
boolean _result = this.setNetworkSelectionModeManual(_arg0, _arg1, _arg2);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_setPreferredNetworkType:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
int _arg1;
_arg1 = data.readInt();
boolean _result = this.setPreferredNetworkType(_arg0, _arg1);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_setDataEnabled:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
boolean _arg1;
_arg1 = (0!=data.readInt());
this.setDataEnabled(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_getDataEnabled:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
boolean _result = this.getDataEnabled(_arg0);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_getPcscfAddress:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
java.lang.String _arg1;
_arg1 = data.readString();
java.lang.String[] _result = this.getPcscfAddress(_arg0, _arg1);
reply.writeNoException();
reply.writeStringArray(_result);
return true;
}
case TRANSACTION_setImsRegistrationState:
{
data.enforceInterface(DESCRIPTOR);
boolean _arg0;
_arg0 = (0!=data.readInt());
this.setImsRegistrationState(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_getCdmaMdn:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
java.lang.String _result = this.getCdmaMdn(_arg0);
reply.writeNoException();
reply.writeString(_result);
return true;
}
case TRANSACTION_getCdmaMin:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
java.lang.String _result = this.getCdmaMin(_arg0);
reply.writeNoException();
reply.writeString(_result);
return true;
}
case TRANSACTION_getCarrierPrivilegeStatus:
{
data.enforceInterface(DESCRIPTOR);
int _result = this.getCarrierPrivilegeStatus();
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_checkCarrierPrivilegesForPackage:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
int _result = this.checkCarrierPrivilegesForPackage(_arg0);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_checkCarrierPrivilegesForPackageAnyPhone:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
int _result = this.checkCarrierPrivilegesForPackageAnyPhone(_arg0);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_getCarrierPackageNamesForIntentAndPhone:
{
data.enforceInterface(DESCRIPTOR);
android.content.Intent _arg0;
if ((0!=data.readInt())) {
_arg0 = android.content.Intent.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
int _arg1;
_arg1 = data.readInt();
java.util.List<java.lang.String> _result = this.getCarrierPackageNamesForIntentAndPhone(_arg0, _arg1);
reply.writeNoException();
reply.writeStringList(_result);
return true;
}
case TRANSACTION_setLine1NumberForDisplayForSubscriber:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
java.lang.String _arg1;
_arg1 = data.readString();
java.lang.String _arg2;
_arg2 = data.readString();
boolean _result = this.setLine1NumberForDisplayForSubscriber(_arg0, _arg1, _arg2);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_getLine1NumberForDisplay:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
java.lang.String _arg1;
_arg1 = data.readString();
java.lang.String _result = this.getLine1NumberForDisplay(_arg0, _arg1);
reply.writeNoException();
reply.writeString(_result);
return true;
}
case TRANSACTION_getLine1AlphaTagForDisplay:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
java.lang.String _arg1;
_arg1 = data.readString();
java.lang.String _result = this.getLine1AlphaTagForDisplay(_arg0, _arg1);
reply.writeNoException();
reply.writeString(_result);
return true;
}
case TRANSACTION_getMergedSubscriberIds:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
java.lang.String[] _result = this.getMergedSubscriberIds(_arg0);
reply.writeNoException();
reply.writeStringArray(_result);
return true;
}
case TRANSACTION_setOperatorBrandOverride:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
boolean _result = this.setOperatorBrandOverride(_arg0);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_setRoamingOverride:
{
data.enforceInterface(DESCRIPTOR);
java.util.List<java.lang.String> _arg0;
_arg0 = data.createStringArrayList();
java.util.List<java.lang.String> _arg1;
_arg1 = data.createStringArrayList();
java.util.List<java.lang.String> _arg2;
_arg2 = data.createStringArrayList();
java.util.List<java.lang.String> _arg3;
_arg3 = data.createStringArrayList();
boolean _result = this.setRoamingOverride(_arg0, _arg1, _arg2, _arg3);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_invokeOemRilRequestRaw:
{
data.enforceInterface(DESCRIPTOR);
byte[] _arg0;
_arg0 = data.createByteArray();
byte[] _arg1;
int _arg1_length = data.readInt();
if ((_arg1_length<0)) {
_arg1 = null;
}
else {
_arg1 = new byte[_arg1_length];
}
int _result = this.invokeOemRilRequestRaw(_arg0, _arg1);
reply.writeNoException();
reply.writeInt(_result);
reply.writeByteArray(_arg1);
return true;
}
case TRANSACTION_needMobileRadioShutdown:
{
data.enforceInterface(DESCRIPTOR);
boolean _result = this.needMobileRadioShutdown();
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_shutdownMobileRadios:
{
data.enforceInterface(DESCRIPTOR);
this.shutdownMobileRadios();
reply.writeNoException();
return true;
}
case TRANSACTION_setRadioCapability:
{
data.enforceInterface(DESCRIPTOR);
android.telephony.RadioAccessFamily[] _arg0;
_arg0 = data.createTypedArray(android.telephony.RadioAccessFamily.CREATOR);
this.setRadioCapability(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_getRadioAccessFamily:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
java.lang.String _arg1;
_arg1 = data.readString();
int _result = this.getRadioAccessFamily(_arg0, _arg1);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_enableVideoCalling:
{
data.enforceInterface(DESCRIPTOR);
boolean _arg0;
_arg0 = (0!=data.readInt());
this.enableVideoCalling(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_isVideoCallingEnabled:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
boolean _result = this.isVideoCallingEnabled(_arg0);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_canChangeDtmfToneLength:
{
data.enforceInterface(DESCRIPTOR);
boolean _result = this.canChangeDtmfToneLength();
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_isWorldPhone:
{
data.enforceInterface(DESCRIPTOR);
boolean _result = this.isWorldPhone();
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_isTtyModeSupported:
{
data.enforceInterface(DESCRIPTOR);
boolean _result = this.isTtyModeSupported();
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_isHearingAidCompatibilitySupported:
{
data.enforceInterface(DESCRIPTOR);
boolean _result = this.isHearingAidCompatibilitySupported();
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_isImsRegistered:
{
data.enforceInterface(DESCRIPTOR);
boolean _result = this.isImsRegistered();
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_isWifiCallingAvailable:
{
data.enforceInterface(DESCRIPTOR);
boolean _result = this.isWifiCallingAvailable();
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_isVolteAvailable:
{
data.enforceInterface(DESCRIPTOR);
boolean _result = this.isVolteAvailable();
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_isVideoTelephonyAvailable:
{
data.enforceInterface(DESCRIPTOR);
boolean _result = this.isVideoTelephonyAvailable();
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_getDeviceId:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
java.lang.String _result = this.getDeviceId(_arg0);
reply.writeNoException();
reply.writeString(_result);
return true;
}
case TRANSACTION_getSubIdForPhoneAccount:
{
data.enforceInterface(DESCRIPTOR);
android.telecom.PhoneAccount _arg0;
if ((0!=data.readInt())) {
_arg0 = android.telecom.PhoneAccount.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
int _result = this.getSubIdForPhoneAccount(_arg0);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_factoryReset:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
this.factoryReset(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_getLocaleFromDefaultSim:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _result = this.getLocaleFromDefaultSim();
reply.writeNoException();
reply.writeString(_result);
return true;
}
case TRANSACTION_getModemActivityInfo:
{
data.enforceInterface(DESCRIPTOR);
android.telephony.ModemActivityInfo _result = this.getModemActivityInfo();
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
private static class Proxy implements com.android.internal.telephony.ITelephony
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
/**
     * Dial a number. This doesn't place the call. It displays
     * the Dialer screen.
     * @param number the number to be dialed. If null, this
     * would display the Dialer screen with no number pre-filled.
     */
@Override public void dial(java.lang.String number) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(number);
mRemote.transact(Stub.TRANSACTION_dial, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/**
     * Place a call to the specified number.
     * @param callingPackage The package making the call.
     * @param number the number to be called.
     */
@Override public void call(java.lang.String callingPackage, java.lang.String number) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(callingPackage);
_data.writeString(number);
mRemote.transact(Stub.TRANSACTION_call, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/**
     * End call if there is a call in progress, otherwise does nothing.
     *
     * @return whether it hung up
     */
@Override public boolean endCall() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_endCall, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/**
     * End call on particular subId or go to the Home screen
     * @param subId user preferred subId.
     * @return whether it hung up
     */
@Override public boolean endCallForSubscriber(int subId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(subId);
mRemote.transact(Stub.TRANSACTION_endCallForSubscriber, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/**
     * Answer the currently-ringing call.
     *
     * If there's already a current active call, that call will be
     * automatically put on hold.  If both lines are currently in use, the
     * current active call will be ended.
     *
     * TODO: provide a flag to let the caller specify what policy to use
     * if both lines are in use.  (The current behavior is hardwired to
     * "answer incoming, end ongoing", which is how the CALL button
     * is specced to behave.)
     *
     * TODO: this should be a oneway call (especially since it's called
     * directly from the key queue thread).
     */
@Override public void answerRingingCall() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_answerRingingCall, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/**
     * Answer the currently-ringing call on particular subId .
     *
     * If there's already a current active call, that call will be
     * automatically put on hold.  If both lines are currently in use, the
     * current active call will be ended.
     *
     * TODO: provide a flag to let the caller specify what policy to use
     * if both lines are in use.  (The current behavior is hardwired to
     * "answer incoming, end ongoing", which is how the CALL button
     * is specced to behave.)
     *
     * TODO: this should be a oneway call (especially since it's called
     * directly from the key queue thread).
     */
@Override public void answerRingingCallForSubscriber(int subId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(subId);
mRemote.transact(Stub.TRANSACTION_answerRingingCallForSubscriber, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/**
     * Silence the ringer if an incoming call is currently ringing.
     * (If vibrating, stop the vibrator also.)
     *
     * It's safe to call this if the ringer has already been silenced, or
     * even if there's no incoming call.  (If so, this method will do nothing.)
     *
     * TODO: this should be a oneway call too (see above).
     *       (Actually *all* the methods here that return void can
     *       probably be oneway.)
     */
@Override public void silenceRinger() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_silenceRinger, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/**
     * Check if we are in either an active or holding call
     * @param callingPackage the name of the package making the call.
     * @return true if the phone state is OFFHOOK.
     */
@Override public boolean isOffhook(java.lang.String callingPackage) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(callingPackage);
mRemote.transact(Stub.TRANSACTION_isOffhook, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/**
     * Check if a particular subId has an active or holding call
     *
     * @param subId user preferred subId.
     * @param callingPackage the name of the package making the call.
     * @return true if the phone state is OFFHOOK.
     */
@Override public boolean isOffhookForSubscriber(int subId, java.lang.String callingPackage) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(subId);
_data.writeString(callingPackage);
mRemote.transact(Stub.TRANSACTION_isOffhookForSubscriber, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/**
     * Check if an incoming phone call is ringing or call waiting
     * on a particular subId.
     *
     * @param subId user preferred subId.
     * @param callingPackage the name of the package making the call.
     * @return true if the phone state is RINGING.
     */
@Override public boolean isRingingForSubscriber(int subId, java.lang.String callingPackage) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(subId);
_data.writeString(callingPackage);
mRemote.transact(Stub.TRANSACTION_isRingingForSubscriber, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/**
     * Check if an incoming phone call is ringing or call waiting.
     * @param callingPackage the name of the package making the call.
     * @return true if the phone state is RINGING.
     */
@Override public boolean isRinging(java.lang.String callingPackage) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(callingPackage);
mRemote.transact(Stub.TRANSACTION_isRinging, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/**
     * Check if the phone is idle.
     * @param callingPackage the name of the package making the call.
     * @return true if the phone state is IDLE.
     */
@Override public boolean isIdle(java.lang.String callingPackage) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(callingPackage);
mRemote.transact(Stub.TRANSACTION_isIdle, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/**
     * Check if the phone is idle on a particular subId.
     *
     * @param subId user preferred subId.
     * @param callingPackage the name of the package making the call.
     * @return true if the phone state is IDLE.
     */
@Override public boolean isIdleForSubscriber(int subId, java.lang.String callingPackage) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(subId);
_data.writeString(callingPackage);
mRemote.transact(Stub.TRANSACTION_isIdleForSubscriber, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/**
     * Check to see if the radio is on or not.
     * @param callingPackage the name of the package making the call.
     * @return returns true if the radio is on.
     */
@Override public boolean isRadioOn(java.lang.String callingPackage) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(callingPackage);
mRemote.transact(Stub.TRANSACTION_isRadioOn, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/**
     * Check to see if the radio is on or not on particular subId.
     * @param subId user preferred subId.
     * @param callingPackage the name of the package making the call.
     * @return returns true if the radio is on.
     */
@Override public boolean isRadioOnForSubscriber(int subId, java.lang.String callingPackage) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(subId);
_data.writeString(callingPackage);
mRemote.transact(Stub.TRANSACTION_isRadioOnForSubscriber, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/**
     * Check if the SIM pin lock is enabled.
     * @return true if the SIM pin lock is enabled.
     * @param callingPackage The package making the call.
     */
@Override public boolean isSimPinEnabled(java.lang.String callingPackage) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(callingPackage);
mRemote.transact(Stub.TRANSACTION_isSimPinEnabled, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/**
     * Supply a pin to unlock the SIM.  Blocks until a result is determined.
     * @param pin The pin to check.
     * @return whether the operation was a success.
     */
@Override public boolean supplyPin(java.lang.String pin) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(pin);
mRemote.transact(Stub.TRANSACTION_supplyPin, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/**
     * Supply a pin to unlock the SIM for particular subId.
     * Blocks until a result is determined.
     * @param pin The pin to check.
     * @param subId user preferred subId.
     * @return whether the operation was a success.
     */
@Override public boolean supplyPinForSubscriber(int subId, java.lang.String pin) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(subId);
_data.writeString(pin);
mRemote.transact(Stub.TRANSACTION_supplyPinForSubscriber, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/**
     * Supply puk to unlock the SIM and set SIM pin to new pin.
     *  Blocks until a result is determined.
     * @param puk The puk to check.
     *        pin The new pin to be set in SIM
     * @return whether the operation was a success.
     */
@Override public boolean supplyPuk(java.lang.String puk, java.lang.String pin) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(puk);
_data.writeString(pin);
mRemote.transact(Stub.TRANSACTION_supplyPuk, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/**
     * Supply puk to unlock the SIM and set SIM pin to new pin.
     *  Blocks until a result is determined.
     * @param puk The puk to check.
     *        pin The new pin to be set in SIM
     * @param subId user preferred subId.
     * @return whether the operation was a success.
     */
@Override public boolean supplyPukForSubscriber(int subId, java.lang.String puk, java.lang.String pin) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(subId);
_data.writeString(puk);
_data.writeString(pin);
mRemote.transact(Stub.TRANSACTION_supplyPukForSubscriber, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public int[] supplyPinReportResult(java.lang.String pin) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int[] _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(pin);
mRemote.transact(Stub.TRANSACTION_supplyPinReportResult, _data, _reply, 0);
_reply.readException();
_result = _reply.createIntArray();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public int[] supplyPinReportResultForSubscriber(int subId, java.lang.String pin) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int[] _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(subId);
_data.writeString(pin);
mRemote.transact(Stub.TRANSACTION_supplyPinReportResultForSubscriber, _data, _reply, 0);
_reply.readException();
_result = _reply.createIntArray();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public int[] supplyPukReportResult(java.lang.String puk, java.lang.String pin) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int[] _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(puk);
_data.writeString(pin);
mRemote.transact(Stub.TRANSACTION_supplyPukReportResult, _data, _reply, 0);
_reply.readException();
_result = _reply.createIntArray();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public int[] supplyPukReportResultForSubscriber(int subId, java.lang.String puk, java.lang.String pin) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int[] _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(subId);
_data.writeString(puk);
_data.writeString(pin);
mRemote.transact(Stub.TRANSACTION_supplyPukReportResultForSubscriber, _data, _reply, 0);
_reply.readException();
_result = _reply.createIntArray();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/**
     * Handles PIN MMI commands (PIN/PIN2/PUK/PUK2), which are initiated
     * without SEND (so <code>dial</code> is not appropriate).
     *
     * @param dialString the MMI command to be executed.
     * @return true if MMI command is executed.
     */
@Override public boolean handlePinMmi(java.lang.String dialString) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(dialString);
mRemote.transact(Stub.TRANSACTION_handlePinMmi, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/**
     * Handles PIN MMI commands (PIN/PIN2/PUK/PUK2), which are initiated
     * without SEND (so <code>dial</code> is not appropriate) for
     * a particular subId.
     * @param dialString the MMI command to be executed.
     * @param subId user preferred subId.
     * @return true if MMI command is executed.
     */
@Override public boolean handlePinMmiForSubscriber(int subId, java.lang.String dialString) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(subId);
_data.writeString(dialString);
mRemote.transact(Stub.TRANSACTION_handlePinMmiForSubscriber, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/**
     * Toggles the radio on or off.
     */
@Override public void toggleRadioOnOff() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_toggleRadioOnOff, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/**
     * Toggles the radio on or off on particular subId.
     * @param subId user preferred subId.
     */
@Override public void toggleRadioOnOffForSubscriber(int subId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(subId);
mRemote.transact(Stub.TRANSACTION_toggleRadioOnOffForSubscriber, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/**
     * Set the radio to on or off
     */
@Override public boolean setRadio(boolean turnOn) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(((turnOn)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_setRadio, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/**
     * Set the radio to on or off on particular subId.
     * @param subId user preferred subId.
     */
@Override public boolean setRadioForSubscriber(int subId, boolean turnOn) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(subId);
_data.writeInt(((turnOn)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_setRadioForSubscriber, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/**
     * Set the radio to on or off unconditionally
     */
@Override public boolean setRadioPower(boolean turnOn) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(((turnOn)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_setRadioPower, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/**
     * Request to update location information in service state
     */
@Override public void updateServiceLocation() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_updateServiceLocation, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/**
     * Request to update location information for a subscrition in service state
     * @param subId user preferred subId.
     */
@Override public void updateServiceLocationForSubscriber(int subId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(subId);
mRemote.transact(Stub.TRANSACTION_updateServiceLocationForSubscriber, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/**
     * Enable location update notifications.
     */
@Override public void enableLocationUpdates() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_enableLocationUpdates, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/**
     * Enable location update notifications.
     * @param subId user preferred subId.
     */
@Override public void enableLocationUpdatesForSubscriber(int subId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(subId);
mRemote.transact(Stub.TRANSACTION_enableLocationUpdatesForSubscriber, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/**
     * Disable location update notifications.
     */
@Override public void disableLocationUpdates() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_disableLocationUpdates, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/**
     * Disable location update notifications.
     * @param subId user preferred subId.
     */
@Override public void disableLocationUpdatesForSubscriber(int subId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(subId);
mRemote.transact(Stub.TRANSACTION_disableLocationUpdatesForSubscriber, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/**
     * Allow mobile data connections.
     */
@Override public boolean enableDataConnectivity() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_enableDataConnectivity, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/**
     * Disallow mobile data connections.
     */
@Override public boolean disableDataConnectivity() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_disableDataConnectivity, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/**
     * Report whether data connectivity is possible.
     */
@Override public boolean isDataConnectivityPossible() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_isDataConnectivityPossible, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public android.os.Bundle getCellLocation(java.lang.String callingPkg) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
android.os.Bundle _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(callingPkg);
mRemote.transact(Stub.TRANSACTION_getCellLocation, _data, _reply, 0);
_reply.readException();
if ((0!=_reply.readInt())) {
_result = android.os.Bundle.CREATOR.createFromParcel(_reply);
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
/**
     * Returns the neighboring cell information of the device.
     */
@Override public java.util.List<android.telephony.NeighboringCellInfo> getNeighboringCellInfo(java.lang.String callingPkg) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.util.List<android.telephony.NeighboringCellInfo> _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(callingPkg);
mRemote.transact(Stub.TRANSACTION_getNeighboringCellInfo, _data, _reply, 0);
_reply.readException();
_result = _reply.createTypedArrayList(android.telephony.NeighboringCellInfo.CREATOR);
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public int getCallState() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getCallState, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public int getCallStateForSubscriber(int subId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(subId);
mRemote.transact(Stub.TRANSACTION_getCallStateForSubscriber, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public int getDataActivity() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getDataActivity, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public int getDataState() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getDataState, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public int getActivePhoneType() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getActivePhoneType, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public int getActivePhoneTypeForSubscriber(int subId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(subId);
mRemote.transact(Stub.TRANSACTION_getActivePhoneTypeForSubscriber, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public int getCdmaEriIconIndex(java.lang.String callingPackage) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(callingPackage);
mRemote.transact(Stub.TRANSACTION_getCdmaEriIconIndex, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public int getCdmaEriIconIndexForSubscriber(int subId, java.lang.String callingPackage) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(subId);
_data.writeString(callingPackage);
mRemote.transact(Stub.TRANSACTION_getCdmaEriIconIndexForSubscriber, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public int getCdmaEriIconMode(java.lang.String callingPackage) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(callingPackage);
mRemote.transact(Stub.TRANSACTION_getCdmaEriIconMode, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public int getCdmaEriIconModeForSubscriber(int subId, java.lang.String callingPackage) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(subId);
_data.writeString(callingPackage);
mRemote.transact(Stub.TRANSACTION_getCdmaEriIconModeForSubscriber, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/**
     * Returns the CDMA ERI text,
     * @param callingPackage package making the call.
     */
@Override public java.lang.String getCdmaEriText(java.lang.String callingPackage) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.lang.String _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(callingPackage);
mRemote.transact(Stub.TRANSACTION_getCdmaEriText, _data, _reply, 0);
_reply.readException();
_result = _reply.readString();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/**
     * Returns the CDMA ERI text for particular subId,
     * @param subId user preferred subId.
     * @param callingPackage package making the call.
     */
@Override public java.lang.String getCdmaEriTextForSubscriber(int subId, java.lang.String callingPackage) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.lang.String _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(subId);
_data.writeString(callingPackage);
mRemote.transact(Stub.TRANSACTION_getCdmaEriTextForSubscriber, _data, _reply, 0);
_reply.readException();
_result = _reply.readString();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/**
     * Returns true if OTA service provisioning needs to run.
     * Only relevant on some technologies, others will always
     * return false.
     */
@Override public boolean needsOtaServiceProvisioning() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_needsOtaServiceProvisioning, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/**
     * Sets the voicemail number for a particular subscriber.
     */
@Override public boolean setVoiceMailNumber(int subId, java.lang.String alphaTag, java.lang.String number) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(subId);
_data.writeString(alphaTag);
_data.writeString(number);
mRemote.transact(Stub.TRANSACTION_setVoiceMailNumber, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public int getVoiceMessageCount() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getVoiceMessageCount, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public int getVoiceMessageCountForSubscriber(int subId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(subId);
mRemote.transact(Stub.TRANSACTION_getVoiceMessageCountForSubscriber, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public int getNetworkType() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getNetworkType, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public int getNetworkTypeForSubscriber(int subId, java.lang.String callingPackage) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(subId);
_data.writeString(callingPackage);
mRemote.transact(Stub.TRANSACTION_getNetworkTypeForSubscriber, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public int getDataNetworkType(java.lang.String callingPackage) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(callingPackage);
mRemote.transact(Stub.TRANSACTION_getDataNetworkType, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public int getDataNetworkTypeForSubscriber(int subId, java.lang.String callingPackage) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(subId);
_data.writeString(callingPackage);
mRemote.transact(Stub.TRANSACTION_getDataNetworkTypeForSubscriber, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public int getVoiceNetworkTypeForSubscriber(int subId, java.lang.String callingPackage) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(subId);
_data.writeString(callingPackage);
mRemote.transact(Stub.TRANSACTION_getVoiceNetworkTypeForSubscriber, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/**
     * Return true if an ICC card is present
     */
@Override public boolean hasIccCard() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_hasIccCard, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/**
     * Return true if an ICC card is present for a subId.
     * @param slotId user preferred slotId.
     * Return true if an ICC card is present
     */
@Override public boolean hasIccCardUsingSlotId(int slotId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(slotId);
mRemote.transact(Stub.TRANSACTION_hasIccCardUsingSlotId, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public int getLteOnCdmaMode(java.lang.String callingPackage) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(callingPackage);
mRemote.transact(Stub.TRANSACTION_getLteOnCdmaMode, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public int getLteOnCdmaModeForSubscriber(int subId, java.lang.String callingPackage) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(subId);
_data.writeString(callingPackage);
mRemote.transact(Stub.TRANSACTION_getLteOnCdmaModeForSubscriber, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/**
     * Returns the all observed cell information of the device.
     */
@Override public java.util.List<android.telephony.CellInfo> getAllCellInfo(java.lang.String callingPkg) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.util.List<android.telephony.CellInfo> _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(callingPkg);
mRemote.transact(Stub.TRANSACTION_getAllCellInfo, _data, _reply, 0);
_reply.readException();
_result = _reply.createTypedArrayList(android.telephony.CellInfo.CREATOR);
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/**
     * Sets minimum time in milli-seconds between onCellInfoChanged
     */
@Override public void setCellInfoListRate(int rateInMillis) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(rateInMillis);
mRemote.transact(Stub.TRANSACTION_setCellInfoListRate, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public int getDefaultSim() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getDefaultSim, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/**
     * Opens a logical channel to the ICC card.
     *
     * Input parameters equivalent to TS 27.007 AT+CCHO command.
     *
     * @param AID Application id. See ETSI 102.221 and 101.220.
     * @return an IccOpenLogicalChannelResponse object.
     */
@Override public android.telephony.IccOpenLogicalChannelResponse iccOpenLogicalChannel(java.lang.String AID) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
android.telephony.IccOpenLogicalChannelResponse _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(AID);
mRemote.transact(Stub.TRANSACTION_iccOpenLogicalChannel, _data, _reply, 0);
_reply.readException();
if ((0!=_reply.readInt())) {
_result = android.telephony.IccOpenLogicalChannelResponse.CREATOR.createFromParcel(_reply);
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
/**
     * Closes a previously opened logical channel to the ICC card.
     *
     * Input parameters equivalent to TS 27.007 AT+CCHC command.
     *
     * @param channel is the channel id to be closed as retruned by a
     *            successful iccOpenLogicalChannel.
     * @return true if the channel was closed successfully.
     */
@Override public boolean iccCloseLogicalChannel(int channel) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(channel);
mRemote.transact(Stub.TRANSACTION_iccCloseLogicalChannel, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/**
     * Transmit an APDU to the ICC card over a logical channel.
     *
     * Input parameters equivalent to TS 27.007 AT+CGLA command.
     *
     * @param channel is the channel id to be closed as retruned by a
     *            successful iccOpenLogicalChannel.
     * @param cla Class of the APDU command.
     * @param instruction Instruction of the APDU command.
     * @param p1 P1 value of the APDU command.
     * @param p2 P2 value of the APDU command.
     * @param p3 P3 value of the APDU command. If p3 is negative a 4 byte APDU
     *            is sent to the SIM.
     * @param data Data to be sent with the APDU.
     * @return The APDU response from the ICC card with the status appended at
     *            the end.
     */
@Override public java.lang.String iccTransmitApduLogicalChannel(int channel, int cla, int instruction, int p1, int p2, int p3, java.lang.String data) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.lang.String _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(channel);
_data.writeInt(cla);
_data.writeInt(instruction);
_data.writeInt(p1);
_data.writeInt(p2);
_data.writeInt(p3);
_data.writeString(data);
mRemote.transact(Stub.TRANSACTION_iccTransmitApduLogicalChannel, _data, _reply, 0);
_reply.readException();
_result = _reply.readString();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/**
     * Transmit an APDU to the ICC card over the basic channel.
     *
     * Input parameters equivalent to TS 27.007 AT+CSIM command.
     *
     * @param cla Class of the APDU command.
     * @param instruction Instruction of the APDU command.
     * @param p1 P1 value of the APDU command.
     * @param p2 P2 value of the APDU command.
     * @param p3 P3 value of the APDU command. If p3 is negative a 4 byte APDU
     *            is sent to the SIM.
     * @param data Data to be sent with the APDU.
     * @return The APDU response from the ICC card with the status appended at
     *            the end.
     */
@Override public java.lang.String iccTransmitApduBasicChannel(int cla, int instruction, int p1, int p2, int p3, java.lang.String data) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.lang.String _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(cla);
_data.writeInt(instruction);
_data.writeInt(p1);
_data.writeInt(p2);
_data.writeInt(p3);
_data.writeString(data);
mRemote.transact(Stub.TRANSACTION_iccTransmitApduBasicChannel, _data, _reply, 0);
_reply.readException();
_result = _reply.readString();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/**
     * Returns the response APDU for a command APDU sent through SIM_IO.
     *
     * @param fileID
     * @param command
     * @param p1 P1 value of the APDU command.
     * @param p2 P2 value of the APDU command.
     * @param p3 P3 value of the APDU command.
     * @param filePath
     * @return The APDU response.
     */
@Override public byte[] iccExchangeSimIO(int fileID, int command, int p1, int p2, int p3, java.lang.String filePath) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
byte[] _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(fileID);
_data.writeInt(command);
_data.writeInt(p1);
_data.writeInt(p2);
_data.writeInt(p3);
_data.writeString(filePath);
mRemote.transact(Stub.TRANSACTION_iccExchangeSimIO, _data, _reply, 0);
_reply.readException();
_result = _reply.createByteArray();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/**
     * Send ENVELOPE to the SIM and returns the response.
     *
     * @param contents  String containing SAT/USAT response in hexadecimal
     *                  format starting with command tag. See TS 102 223 for
     *                  details.
     * @return The APDU response from the ICC card, with the last 4 bytes
     *         being the status word. If the command fails, returns an empty
     *         string.
     */
@Override public java.lang.String sendEnvelopeWithStatus(java.lang.String content) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.lang.String _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(content);
mRemote.transact(Stub.TRANSACTION_sendEnvelopeWithStatus, _data, _reply, 0);
_reply.readException();
_result = _reply.readString();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/**
     * Read one of the NV items defined in {@link RadioNVItems} / {@code ril_nv_items.h}.
     * Used for device configuration by some CDMA operators.
     *
     * @param itemID the ID of the item to read.
     * @return the NV item as a String, or null on any failure.
     */
@Override public java.lang.String nvReadItem(int itemID) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.lang.String _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(itemID);
mRemote.transact(Stub.TRANSACTION_nvReadItem, _data, _reply, 0);
_reply.readException();
_result = _reply.readString();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/**
     * Write one of the NV items defined in {@link RadioNVItems} / {@code ril_nv_items.h}.
     * Used for device configuration by some CDMA operators.
     *
     * @param itemID the ID of the item to read.
     * @param itemValue the value to write, as a String.
     * @return true on success; false on any failure.
     */
@Override public boolean nvWriteItem(int itemID, java.lang.String itemValue) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(itemID);
_data.writeString(itemValue);
mRemote.transact(Stub.TRANSACTION_nvWriteItem, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/**
     * Update the CDMA Preferred Roaming List (PRL) in the radio NV storage.
     * Used for device configuration by some CDMA operators.
     *
     * @param preferredRoamingList byte array containing the new PRL.
     * @return true on success; false on any failure.
     */
@Override public boolean nvWriteCdmaPrl(byte[] preferredRoamingList) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeByteArray(preferredRoamingList);
mRemote.transact(Stub.TRANSACTION_nvWriteCdmaPrl, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/**
     * Perform the specified type of NV config reset. The radio will be taken offline
     * and the device must be rebooted after the operation. Used for device
     * configuration by some CDMA operators.
     *
     * @param resetType the type of reset to perform (1 == factory reset; 2 == NV-only reset).
     * @return true on success; false on any failure.
     */
@Override public boolean nvResetConfig(int resetType) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(resetType);
mRemote.transact(Stub.TRANSACTION_nvResetConfig, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public int getCalculatedPreferredNetworkType(java.lang.String callingPackage) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(callingPackage);
mRemote.transact(Stub.TRANSACTION_getCalculatedPreferredNetworkType, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public int getPreferredNetworkType(int subId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(subId);
mRemote.transact(Stub.TRANSACTION_getPreferredNetworkType, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public int getTetherApnRequired() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getTetherApnRequired, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/**
     * Set the network selection mode to automatic.
     *
     * @param subId the id of the subscription to update.
     */
@Override public void setNetworkSelectionModeAutomatic(int subId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(subId);
mRemote.transact(Stub.TRANSACTION_setNetworkSelectionModeAutomatic, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/**
     * Perform a radio scan and return the list of avialble networks.
     *
     * @param subId the id of the subscription.
     * @return CellNetworkScanResult containing status of scan and networks.
     */
@Override public com.android.internal.telephony.CellNetworkScanResult getCellNetworkScanResults(int subId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
com.android.internal.telephony.CellNetworkScanResult _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(subId);
mRemote.transact(Stub.TRANSACTION_getCellNetworkScanResults, _data, _reply, 0);
_reply.readException();
if ((0!=_reply.readInt())) {
_result = com.android.internal.telephony.CellNetworkScanResult.CREATOR.createFromParcel(_reply);
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
/**
     * Ask the radio to connect to the input network and change selection mode to manual.
     *
     * @param subId the id of the subscription.
     * @param operatorInfo the operator to attach to.
     * @param persistSelection should the selection persist till reboot or its
     *        turned off? Will also result in notification being not shown to
     *        the user if the signal is lost.
     * @return true if the request suceeded.
     */
@Override public boolean setNetworkSelectionModeManual(int subId, com.android.internal.telephony.OperatorInfo operator, boolean persistSelection) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(subId);
if ((operator!=null)) {
_data.writeInt(1);
operator.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeInt(((persistSelection)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_setNetworkSelectionModeManual, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/**
     * Set the preferred network type.
     * Used for device configuration by some CDMA operators.
     *
     * @param subId the id of the subscription to update.
     * @param networkType the preferred network type, defined in RILConstants.java.
     * @return true on success; false on any failure.
     */
@Override public boolean setPreferredNetworkType(int subId, int networkType) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(subId);
_data.writeInt(networkType);
mRemote.transact(Stub.TRANSACTION_setPreferredNetworkType, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/**
     * User enable/disable Mobile Data.
     *
     * @param enable true to turn on, else false
     */
@Override public void setDataEnabled(int subId, boolean enable) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(subId);
_data.writeInt(((enable)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_setDataEnabled, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/**
     * Get the user enabled state of Mobile Data.
     *
     * @return true on enabled
     */
@Override public boolean getDataEnabled(int subId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(subId);
mRemote.transact(Stub.TRANSACTION_getDataEnabled, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/**
     * Get P-CSCF address from PCO after data connection is established or modified.
     * @param apnType the apnType, "ims" for IMS APN, "emergency" for EMERGENCY APN
     * @param callingPackage The package making the call.
     */
@Override public java.lang.String[] getPcscfAddress(java.lang.String apnType, java.lang.String callingPackage) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.lang.String[] _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(apnType);
_data.writeString(callingPackage);
mRemote.transact(Stub.TRANSACTION_getPcscfAddress, _data, _reply, 0);
_reply.readException();
_result = _reply.createStringArray();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/**
     * Set IMS registration state
     */
@Override public void setImsRegistrationState(boolean registered) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(((registered)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_setImsRegistrationState, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/**
     * Return MDN string for CDMA phone.
     * @param subId user preferred subId.
     */
@Override public java.lang.String getCdmaMdn(int subId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.lang.String _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(subId);
mRemote.transact(Stub.TRANSACTION_getCdmaMdn, _data, _reply, 0);
_reply.readException();
_result = _reply.readString();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/**
     * Return MIN string for CDMA phone.
     * @param subId user preferred subId.
     */
@Override public java.lang.String getCdmaMin(int subId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.lang.String _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(subId);
mRemote.transact(Stub.TRANSACTION_getCdmaMin, _data, _reply, 0);
_reply.readException();
_result = _reply.readString();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public int getCarrierPrivilegeStatus() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getCarrierPrivilegeStatus, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public int checkCarrierPrivilegesForPackage(java.lang.String pkgName) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(pkgName);
mRemote.transact(Stub.TRANSACTION_checkCarrierPrivilegesForPackage, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public int checkCarrierPrivilegesForPackageAnyPhone(java.lang.String pkgName) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(pkgName);
mRemote.transact(Stub.TRANSACTION_checkCarrierPrivilegesForPackageAnyPhone, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/**
     * Returns list of the package names of the carrier apps that should handle the input intent
     * and have carrier privileges for the given phoneId.
     *
     * @param intent Intent that will be sent.
     * @param phoneId The phoneId on which the carrier app has carrier privileges.
     * @return list of carrier app package names that can handle the intent on phoneId.
     *         Returns null if there is an error and an empty list if there
     *         are no matching packages.
     */
@Override public java.util.List<java.lang.String> getCarrierPackageNamesForIntentAndPhone(android.content.Intent intent, int phoneId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.util.List<java.lang.String> _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((intent!=null)) {
_data.writeInt(1);
intent.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeInt(phoneId);
mRemote.transact(Stub.TRANSACTION_getCarrierPackageNamesForIntentAndPhone, _data, _reply, 0);
_reply.readException();
_result = _reply.createStringArrayList();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/**
     * Set the line 1 phone number string and its alphatag for the current ICCID
     * for display purpose only, for example, displayed in Phone Status. It won't
     * change the actual MSISDN/MDN. To unset alphatag or number, pass in a null
     * value.
     *
     * @param subId the subscriber that the alphatag and dialing number belongs to.
     * @param alphaTag alpha-tagging of the dailing nubmer
     * @param number The dialing number
     * @return true if the operation was executed correctly.
     */
@Override public boolean setLine1NumberForDisplayForSubscriber(int subId, java.lang.String alphaTag, java.lang.String number) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(subId);
_data.writeString(alphaTag);
_data.writeString(number);
mRemote.transact(Stub.TRANSACTION_setLine1NumberForDisplayForSubscriber, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/**
     * Returns the displayed dialing number string if it was set previously via
     * {@link #setLine1NumberForDisplay}. Otherwise returns null.
     *
     * @param subId whose dialing number for line 1 is returned.
     * @param callingPackage The package making the call.
     * @return the displayed dialing number if set, or null if not set.
     */
@Override public java.lang.String getLine1NumberForDisplay(int subId, java.lang.String callingPackage) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.lang.String _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(subId);
_data.writeString(callingPackage);
mRemote.transact(Stub.TRANSACTION_getLine1NumberForDisplay, _data, _reply, 0);
_reply.readException();
_result = _reply.readString();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/**
     * Returns the displayed alphatag of the dialing number if it was set
     * previously via {@link #setLine1NumberForDisplay}. Otherwise returns null.
     *
     * @param subId whose alphatag associated with line 1 is returned.
     * @param callingPackage The package making the call.
     * @return the displayed alphatag of the dialing number if set, or null if
     *         not set.
     */
@Override public java.lang.String getLine1AlphaTagForDisplay(int subId, java.lang.String callingPackage) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.lang.String _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(subId);
_data.writeString(callingPackage);
mRemote.transact(Stub.TRANSACTION_getLine1AlphaTagForDisplay, _data, _reply, 0);
_reply.readException();
_result = _reply.readString();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public java.lang.String[] getMergedSubscriberIds(java.lang.String callingPackage) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.lang.String[] _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(callingPackage);
mRemote.transact(Stub.TRANSACTION_getMergedSubscriberIds, _data, _reply, 0);
_reply.readException();
_result = _reply.createStringArray();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/**
     * Override the operator branding for the current ICCID.
     *
     * Once set, whenever the SIM is present in the device, the service
     * provider name (SPN) and the operator name will both be replaced by the
     * brand value input. To unset the value, the same function should be
     * called with a null brand value.
     *
     * <p>Requires Permission:
     *   {@link android.Manifest.permission#MODIFY_PHONE_STATE MODIFY_PHONE_STATE}
     *  or has to be carrier app - see #hasCarrierPrivileges.
     *
     * @param brand The brand name to display/set.
     * @return true if the operation was executed correctly.
     */
@Override public boolean setOperatorBrandOverride(java.lang.String brand) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(brand);
mRemote.transact(Stub.TRANSACTION_setOperatorBrandOverride, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/**
     * Override the roaming indicator for the current ICCID.
     *
     * Using this call, the carrier app (see #hasCarrierPrivileges) can override
     * the platform's notion of a network operator being considered roaming or not.
     * The change only affects the ICCID that was active when this call was made.
     *
     * If null is passed as any of the input, the corresponding value is deleted.
     *
     * <p>Requires that the caller have carrier privilege. See #hasCarrierPrivileges.
     *
     * @param gsmRoamingList - List of MCCMNCs to be considered roaming for 3GPP RATs.
     * @param gsmNonRoamingList - List of MCCMNCs to be considered not roaming for 3GPP RATs.
     * @param cdmaRoamingList - List of SIDs to be considered roaming for 3GPP2 RATs.
     * @param cdmaNonRoamingList - List of SIDs to be considered not roaming for 3GPP2 RATs.
     * @return true if the operation was executed correctly.
     */
@Override public boolean setRoamingOverride(java.util.List<java.lang.String> gsmRoamingList, java.util.List<java.lang.String> gsmNonRoamingList, java.util.List<java.lang.String> cdmaRoamingList, java.util.List<java.lang.String> cdmaNonRoamingList) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStringList(gsmRoamingList);
_data.writeStringList(gsmNonRoamingList);
_data.writeStringList(cdmaRoamingList);
_data.writeStringList(cdmaNonRoamingList);
mRemote.transact(Stub.TRANSACTION_setRoamingOverride, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public int invokeOemRilRequestRaw(byte[] oemReq, byte[] oemResp) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeByteArray(oemReq);
if ((oemResp==null)) {
_data.writeInt(-1);
}
else {
_data.writeInt(oemResp.length);
}
mRemote.transact(Stub.TRANSACTION_invokeOemRilRequestRaw, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
_reply.readByteArray(oemResp);
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/**
     * Check if any mobile Radios need to be shutdown.
     *
     * @return true is any mobile radio needs to be shutdown
     */
@Override public boolean needMobileRadioShutdown() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_needMobileRadioShutdown, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/**
     * Shutdown Mobile Radios
     */
@Override public void shutdownMobileRadios() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_shutdownMobileRadios, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/**
     * Set phone radio type and access technology.
     *
     * @param rafs an RadioAccessFamily array to indicate all phone's
     *        new radio access family. The length of RadioAccessFamily
     *        must equ]]al to phone count.
     */
@Override public void setRadioCapability(android.telephony.RadioAccessFamily[] rafs) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeTypedArray(rafs, 0);
mRemote.transact(Stub.TRANSACTION_setRadioCapability, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public int getRadioAccessFamily(int phoneId, java.lang.String callingPackage) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(phoneId);
_data.writeString(callingPackage);
mRemote.transact(Stub.TRANSACTION_getRadioAccessFamily, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/**
     * Enables or disables video calling.
     *
     * @param enable Whether to enable video calling.
     */
@Override public void enableVideoCalling(boolean enable) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(((enable)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_enableVideoCalling, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/**
     * Whether video calling has been enabled by the user.
     *
     * @param callingPackage The package making the call.
     * @return {@code true} if the user has enabled video calling, {@code false} otherwise.
     */
@Override public boolean isVideoCallingEnabled(java.lang.String callingPackage) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(callingPackage);
mRemote.transact(Stub.TRANSACTION_isVideoCallingEnabled, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/**
     * Whether the DTMF tone length can be changed.
     *
     * @return {@code true} if the DTMF tone length can be changed.
     */
@Override public boolean canChangeDtmfToneLength() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_canChangeDtmfToneLength, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/**
     * Whether the device is a world phone.
     *
     * @return {@code true} if the devices is a world phone.
     */
@Override public boolean isWorldPhone() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_isWorldPhone, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/**
     * Whether the phone supports TTY mode.
     *
     * @return {@code true} if the device supports TTY mode.
     */
@Override public boolean isTtyModeSupported() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_isTtyModeSupported, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/**
     * Whether the phone supports hearing aid compatibility.
     *
     * @return {@code true} if the device supports hearing aid compatibility.
     */
@Override public boolean isHearingAidCompatibilitySupported() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_isHearingAidCompatibilitySupported, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/**
     * Get IMS Registration Status
     */
@Override public boolean isImsRegistered() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_isImsRegistered, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/**
     * Returns the Status of Wi-Fi Calling
     */
@Override public boolean isWifiCallingAvailable() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_isWifiCallingAvailable, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/**
     * Returns the Status of Volte
     */
@Override public boolean isVolteAvailable() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_isVolteAvailable, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/**
     * Returns the Status of VT (video telephony)
     */
@Override public boolean isVideoTelephonyAvailable() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_isVideoTelephonyAvailable, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/**
      * Returns the unique device ID of phone, for example, the IMEI for
      * GSM and the MEID for CDMA phones. Return null if device ID is not available.
      *
      * @param callingPackage The package making the call.
      * <p>Requires Permission:
      *   {@link android.Manifest.permission#READ_PHONE_STATE READ_PHONE_STATE}
      */
@Override public java.lang.String getDeviceId(java.lang.String callingPackage) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.lang.String _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(callingPackage);
mRemote.transact(Stub.TRANSACTION_getDeviceId, _data, _reply, 0);
_reply.readException();
_result = _reply.readString();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public int getSubIdForPhoneAccount(android.telecom.PhoneAccount phoneAccount) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((phoneAccount!=null)) {
_data.writeInt(1);
phoneAccount.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_getSubIdForPhoneAccount, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public void factoryReset(int subId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(subId);
mRemote.transact(Stub.TRANSACTION_factoryReset, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/**
     * An estimate of the users's current locale based on the default SIM.
     *
     * The returned string will be a well formed BCP-47 language tag, or {@code null}
     * if no locale could be derived.
     */
@Override public java.lang.String getLocaleFromDefaultSim() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.lang.String _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getLocaleFromDefaultSim, _data, _reply, 0);
_reply.readException();
_result = _reply.readString();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/**
     * Return the modem activity info.
     */
@Override public android.telephony.ModemActivityInfo getModemActivityInfo() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
android.telephony.ModemActivityInfo _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getModemActivityInfo, _data, _reply, 0);
_reply.readException();
if ((0!=_reply.readInt())) {
_result = android.telephony.ModemActivityInfo.CREATOR.createFromParcel(_reply);
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
static final int TRANSACTION_dial = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_call = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_endCall = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
static final int TRANSACTION_endCallForSubscriber = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
static final int TRANSACTION_answerRingingCall = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
static final int TRANSACTION_answerRingingCallForSubscriber = (android.os.IBinder.FIRST_CALL_TRANSACTION + 5);
static final int TRANSACTION_silenceRinger = (android.os.IBinder.FIRST_CALL_TRANSACTION + 6);
static final int TRANSACTION_isOffhook = (android.os.IBinder.FIRST_CALL_TRANSACTION + 7);
static final int TRANSACTION_isOffhookForSubscriber = (android.os.IBinder.FIRST_CALL_TRANSACTION + 8);
static final int TRANSACTION_isRingingForSubscriber = (android.os.IBinder.FIRST_CALL_TRANSACTION + 9);
static final int TRANSACTION_isRinging = (android.os.IBinder.FIRST_CALL_TRANSACTION + 10);
static final int TRANSACTION_isIdle = (android.os.IBinder.FIRST_CALL_TRANSACTION + 11);
static final int TRANSACTION_isIdleForSubscriber = (android.os.IBinder.FIRST_CALL_TRANSACTION + 12);
static final int TRANSACTION_isRadioOn = (android.os.IBinder.FIRST_CALL_TRANSACTION + 13);
static final int TRANSACTION_isRadioOnForSubscriber = (android.os.IBinder.FIRST_CALL_TRANSACTION + 14);
static final int TRANSACTION_isSimPinEnabled = (android.os.IBinder.FIRST_CALL_TRANSACTION + 15);
static final int TRANSACTION_supplyPin = (android.os.IBinder.FIRST_CALL_TRANSACTION + 16);
static final int TRANSACTION_supplyPinForSubscriber = (android.os.IBinder.FIRST_CALL_TRANSACTION + 17);
static final int TRANSACTION_supplyPuk = (android.os.IBinder.FIRST_CALL_TRANSACTION + 18);
static final int TRANSACTION_supplyPukForSubscriber = (android.os.IBinder.FIRST_CALL_TRANSACTION + 19);
static final int TRANSACTION_supplyPinReportResult = (android.os.IBinder.FIRST_CALL_TRANSACTION + 20);
static final int TRANSACTION_supplyPinReportResultForSubscriber = (android.os.IBinder.FIRST_CALL_TRANSACTION + 21);
static final int TRANSACTION_supplyPukReportResult = (android.os.IBinder.FIRST_CALL_TRANSACTION + 22);
static final int TRANSACTION_supplyPukReportResultForSubscriber = (android.os.IBinder.FIRST_CALL_TRANSACTION + 23);
static final int TRANSACTION_handlePinMmi = (android.os.IBinder.FIRST_CALL_TRANSACTION + 24);
static final int TRANSACTION_handlePinMmiForSubscriber = (android.os.IBinder.FIRST_CALL_TRANSACTION + 25);
static final int TRANSACTION_toggleRadioOnOff = (android.os.IBinder.FIRST_CALL_TRANSACTION + 26);
static final int TRANSACTION_toggleRadioOnOffForSubscriber = (android.os.IBinder.FIRST_CALL_TRANSACTION + 27);
static final int TRANSACTION_setRadio = (android.os.IBinder.FIRST_CALL_TRANSACTION + 28);
static final int TRANSACTION_setRadioForSubscriber = (android.os.IBinder.FIRST_CALL_TRANSACTION + 29);
static final int TRANSACTION_setRadioPower = (android.os.IBinder.FIRST_CALL_TRANSACTION + 30);
static final int TRANSACTION_updateServiceLocation = (android.os.IBinder.FIRST_CALL_TRANSACTION + 31);
static final int TRANSACTION_updateServiceLocationForSubscriber = (android.os.IBinder.FIRST_CALL_TRANSACTION + 32);
static final int TRANSACTION_enableLocationUpdates = (android.os.IBinder.FIRST_CALL_TRANSACTION + 33);
static final int TRANSACTION_enableLocationUpdatesForSubscriber = (android.os.IBinder.FIRST_CALL_TRANSACTION + 34);
static final int TRANSACTION_disableLocationUpdates = (android.os.IBinder.FIRST_CALL_TRANSACTION + 35);
static final int TRANSACTION_disableLocationUpdatesForSubscriber = (android.os.IBinder.FIRST_CALL_TRANSACTION + 36);
static final int TRANSACTION_enableDataConnectivity = (android.os.IBinder.FIRST_CALL_TRANSACTION + 37);
static final int TRANSACTION_disableDataConnectivity = (android.os.IBinder.FIRST_CALL_TRANSACTION + 38);
static final int TRANSACTION_isDataConnectivityPossible = (android.os.IBinder.FIRST_CALL_TRANSACTION + 39);
static final int TRANSACTION_getCellLocation = (android.os.IBinder.FIRST_CALL_TRANSACTION + 40);
static final int TRANSACTION_getNeighboringCellInfo = (android.os.IBinder.FIRST_CALL_TRANSACTION + 41);
static final int TRANSACTION_getCallState = (android.os.IBinder.FIRST_CALL_TRANSACTION + 42);
static final int TRANSACTION_getCallStateForSubscriber = (android.os.IBinder.FIRST_CALL_TRANSACTION + 43);
static final int TRANSACTION_getDataActivity = (android.os.IBinder.FIRST_CALL_TRANSACTION + 44);
static final int TRANSACTION_getDataState = (android.os.IBinder.FIRST_CALL_TRANSACTION + 45);
static final int TRANSACTION_getActivePhoneType = (android.os.IBinder.FIRST_CALL_TRANSACTION + 46);
static final int TRANSACTION_getActivePhoneTypeForSubscriber = (android.os.IBinder.FIRST_CALL_TRANSACTION + 47);
static final int TRANSACTION_getCdmaEriIconIndex = (android.os.IBinder.FIRST_CALL_TRANSACTION + 48);
static final int TRANSACTION_getCdmaEriIconIndexForSubscriber = (android.os.IBinder.FIRST_CALL_TRANSACTION + 49);
static final int TRANSACTION_getCdmaEriIconMode = (android.os.IBinder.FIRST_CALL_TRANSACTION + 50);
static final int TRANSACTION_getCdmaEriIconModeForSubscriber = (android.os.IBinder.FIRST_CALL_TRANSACTION + 51);
static final int TRANSACTION_getCdmaEriText = (android.os.IBinder.FIRST_CALL_TRANSACTION + 52);
static final int TRANSACTION_getCdmaEriTextForSubscriber = (android.os.IBinder.FIRST_CALL_TRANSACTION + 53);
static final int TRANSACTION_needsOtaServiceProvisioning = (android.os.IBinder.FIRST_CALL_TRANSACTION + 54);
static final int TRANSACTION_setVoiceMailNumber = (android.os.IBinder.FIRST_CALL_TRANSACTION + 55);
static final int TRANSACTION_getVoiceMessageCount = (android.os.IBinder.FIRST_CALL_TRANSACTION + 56);
static final int TRANSACTION_getVoiceMessageCountForSubscriber = (android.os.IBinder.FIRST_CALL_TRANSACTION + 57);
static final int TRANSACTION_getNetworkType = (android.os.IBinder.FIRST_CALL_TRANSACTION + 58);
static final int TRANSACTION_getNetworkTypeForSubscriber = (android.os.IBinder.FIRST_CALL_TRANSACTION + 59);
static final int TRANSACTION_getDataNetworkType = (android.os.IBinder.FIRST_CALL_TRANSACTION + 60);
static final int TRANSACTION_getDataNetworkTypeForSubscriber = (android.os.IBinder.FIRST_CALL_TRANSACTION + 61);
static final int TRANSACTION_getVoiceNetworkTypeForSubscriber = (android.os.IBinder.FIRST_CALL_TRANSACTION + 62);
static final int TRANSACTION_hasIccCard = (android.os.IBinder.FIRST_CALL_TRANSACTION + 63);
static final int TRANSACTION_hasIccCardUsingSlotId = (android.os.IBinder.FIRST_CALL_TRANSACTION + 64);
static final int TRANSACTION_getLteOnCdmaMode = (android.os.IBinder.FIRST_CALL_TRANSACTION + 65);
static final int TRANSACTION_getLteOnCdmaModeForSubscriber = (android.os.IBinder.FIRST_CALL_TRANSACTION + 66);
static final int TRANSACTION_getAllCellInfo = (android.os.IBinder.FIRST_CALL_TRANSACTION + 67);
static final int TRANSACTION_setCellInfoListRate = (android.os.IBinder.FIRST_CALL_TRANSACTION + 68);
static final int TRANSACTION_getDefaultSim = (android.os.IBinder.FIRST_CALL_TRANSACTION + 69);
static final int TRANSACTION_iccOpenLogicalChannel = (android.os.IBinder.FIRST_CALL_TRANSACTION + 70);
static final int TRANSACTION_iccCloseLogicalChannel = (android.os.IBinder.FIRST_CALL_TRANSACTION + 71);
static final int TRANSACTION_iccTransmitApduLogicalChannel = (android.os.IBinder.FIRST_CALL_TRANSACTION + 72);
static final int TRANSACTION_iccTransmitApduBasicChannel = (android.os.IBinder.FIRST_CALL_TRANSACTION + 73);
static final int TRANSACTION_iccExchangeSimIO = (android.os.IBinder.FIRST_CALL_TRANSACTION + 74);
static final int TRANSACTION_sendEnvelopeWithStatus = (android.os.IBinder.FIRST_CALL_TRANSACTION + 75);
static final int TRANSACTION_nvReadItem = (android.os.IBinder.FIRST_CALL_TRANSACTION + 76);
static final int TRANSACTION_nvWriteItem = (android.os.IBinder.FIRST_CALL_TRANSACTION + 77);
static final int TRANSACTION_nvWriteCdmaPrl = (android.os.IBinder.FIRST_CALL_TRANSACTION + 78);
static final int TRANSACTION_nvResetConfig = (android.os.IBinder.FIRST_CALL_TRANSACTION + 79);
static final int TRANSACTION_getCalculatedPreferredNetworkType = (android.os.IBinder.FIRST_CALL_TRANSACTION + 80);
static final int TRANSACTION_getPreferredNetworkType = (android.os.IBinder.FIRST_CALL_TRANSACTION + 81);
static final int TRANSACTION_getTetherApnRequired = (android.os.IBinder.FIRST_CALL_TRANSACTION + 82);
static final int TRANSACTION_setNetworkSelectionModeAutomatic = (android.os.IBinder.FIRST_CALL_TRANSACTION + 83);
static final int TRANSACTION_getCellNetworkScanResults = (android.os.IBinder.FIRST_CALL_TRANSACTION + 84);
static final int TRANSACTION_setNetworkSelectionModeManual = (android.os.IBinder.FIRST_CALL_TRANSACTION + 85);
static final int TRANSACTION_setPreferredNetworkType = (android.os.IBinder.FIRST_CALL_TRANSACTION + 86);
static final int TRANSACTION_setDataEnabled = (android.os.IBinder.FIRST_CALL_TRANSACTION + 87);
static final int TRANSACTION_getDataEnabled = (android.os.IBinder.FIRST_CALL_TRANSACTION + 88);
static final int TRANSACTION_getPcscfAddress = (android.os.IBinder.FIRST_CALL_TRANSACTION + 89);
static final int TRANSACTION_setImsRegistrationState = (android.os.IBinder.FIRST_CALL_TRANSACTION + 90);
static final int TRANSACTION_getCdmaMdn = (android.os.IBinder.FIRST_CALL_TRANSACTION + 91);
static final int TRANSACTION_getCdmaMin = (android.os.IBinder.FIRST_CALL_TRANSACTION + 92);
static final int TRANSACTION_getCarrierPrivilegeStatus = (android.os.IBinder.FIRST_CALL_TRANSACTION + 93);
static final int TRANSACTION_checkCarrierPrivilegesForPackage = (android.os.IBinder.FIRST_CALL_TRANSACTION + 94);
static final int TRANSACTION_checkCarrierPrivilegesForPackageAnyPhone = (android.os.IBinder.FIRST_CALL_TRANSACTION + 95);
static final int TRANSACTION_getCarrierPackageNamesForIntentAndPhone = (android.os.IBinder.FIRST_CALL_TRANSACTION + 96);
static final int TRANSACTION_setLine1NumberForDisplayForSubscriber = (android.os.IBinder.FIRST_CALL_TRANSACTION + 97);
static final int TRANSACTION_getLine1NumberForDisplay = (android.os.IBinder.FIRST_CALL_TRANSACTION + 98);
static final int TRANSACTION_getLine1AlphaTagForDisplay = (android.os.IBinder.FIRST_CALL_TRANSACTION + 99);
static final int TRANSACTION_getMergedSubscriberIds = (android.os.IBinder.FIRST_CALL_TRANSACTION + 100);
static final int TRANSACTION_setOperatorBrandOverride = (android.os.IBinder.FIRST_CALL_TRANSACTION + 101);
static final int TRANSACTION_setRoamingOverride = (android.os.IBinder.FIRST_CALL_TRANSACTION + 102);
static final int TRANSACTION_invokeOemRilRequestRaw = (android.os.IBinder.FIRST_CALL_TRANSACTION + 103);
static final int TRANSACTION_needMobileRadioShutdown = (android.os.IBinder.FIRST_CALL_TRANSACTION + 104);
static final int TRANSACTION_shutdownMobileRadios = (android.os.IBinder.FIRST_CALL_TRANSACTION + 105);
static final int TRANSACTION_setRadioCapability = (android.os.IBinder.FIRST_CALL_TRANSACTION + 106);
static final int TRANSACTION_getRadioAccessFamily = (android.os.IBinder.FIRST_CALL_TRANSACTION + 107);
static final int TRANSACTION_enableVideoCalling = (android.os.IBinder.FIRST_CALL_TRANSACTION + 108);
static final int TRANSACTION_isVideoCallingEnabled = (android.os.IBinder.FIRST_CALL_TRANSACTION + 109);
static final int TRANSACTION_canChangeDtmfToneLength = (android.os.IBinder.FIRST_CALL_TRANSACTION + 110);
static final int TRANSACTION_isWorldPhone = (android.os.IBinder.FIRST_CALL_TRANSACTION + 111);
static final int TRANSACTION_isTtyModeSupported = (android.os.IBinder.FIRST_CALL_TRANSACTION + 112);
static final int TRANSACTION_isHearingAidCompatibilitySupported = (android.os.IBinder.FIRST_CALL_TRANSACTION + 113);
static final int TRANSACTION_isImsRegistered = (android.os.IBinder.FIRST_CALL_TRANSACTION + 114);
static final int TRANSACTION_isWifiCallingAvailable = (android.os.IBinder.FIRST_CALL_TRANSACTION + 115);
static final int TRANSACTION_isVolteAvailable = (android.os.IBinder.FIRST_CALL_TRANSACTION + 116);
static final int TRANSACTION_isVideoTelephonyAvailable = (android.os.IBinder.FIRST_CALL_TRANSACTION + 117);
static final int TRANSACTION_getDeviceId = (android.os.IBinder.FIRST_CALL_TRANSACTION + 118);
static final int TRANSACTION_getSubIdForPhoneAccount = (android.os.IBinder.FIRST_CALL_TRANSACTION + 119);
static final int TRANSACTION_factoryReset = (android.os.IBinder.FIRST_CALL_TRANSACTION + 120);
static final int TRANSACTION_getLocaleFromDefaultSim = (android.os.IBinder.FIRST_CALL_TRANSACTION + 121);
static final int TRANSACTION_getModemActivityInfo = (android.os.IBinder.FIRST_CALL_TRANSACTION + 122);
}
/**
     * Dial a number. This doesn't place the call. It displays
     * the Dialer screen.
     * @param number the number to be dialed. If null, this
     * would display the Dialer screen with no number pre-filled.
     */
public void dial(java.lang.String number) throws android.os.RemoteException;
/**
     * Place a call to the specified number.
     * @param callingPackage The package making the call.
     * @param number the number to be called.
     */
public void call(java.lang.String callingPackage, java.lang.String number) throws android.os.RemoteException;
/**
     * End call if there is a call in progress, otherwise does nothing.
     *
     * @return whether it hung up
     */
public boolean endCall() throws android.os.RemoteException;
/**
     * End call on particular subId or go to the Home screen
     * @param subId user preferred subId.
     * @return whether it hung up
     */
public boolean endCallForSubscriber(int subId) throws android.os.RemoteException;
/**
     * Answer the currently-ringing call.
     *
     * If there's already a current active call, that call will be
     * automatically put on hold.  If both lines are currently in use, the
     * current active call will be ended.
     *
     * TODO: provide a flag to let the caller specify what policy to use
     * if both lines are in use.  (The current behavior is hardwired to
     * "answer incoming, end ongoing", which is how the CALL button
     * is specced to behave.)
     *
     * TODO: this should be a oneway call (especially since it's called
     * directly from the key queue thread).
     */
public void answerRingingCall() throws android.os.RemoteException;
/**
     * Answer the currently-ringing call on particular subId .
     *
     * If there's already a current active call, that call will be
     * automatically put on hold.  If both lines are currently in use, the
     * current active call will be ended.
     *
     * TODO: provide a flag to let the caller specify what policy to use
     * if both lines are in use.  (The current behavior is hardwired to
     * "answer incoming, end ongoing", which is how the CALL button
     * is specced to behave.)
     *
     * TODO: this should be a oneway call (especially since it's called
     * directly from the key queue thread).
     */
public void answerRingingCallForSubscriber(int subId) throws android.os.RemoteException;
/**
     * Silence the ringer if an incoming call is currently ringing.
     * (If vibrating, stop the vibrator also.)
     *
     * It's safe to call this if the ringer has already been silenced, or
     * even if there's no incoming call.  (If so, this method will do nothing.)
     *
     * TODO: this should be a oneway call too (see above).
     *       (Actually *all* the methods here that return void can
     *       probably be oneway.)
     */
public void silenceRinger() throws android.os.RemoteException;
/**
     * Check if we are in either an active or holding call
     * @param callingPackage the name of the package making the call.
     * @return true if the phone state is OFFHOOK.
     */
public boolean isOffhook(java.lang.String callingPackage) throws android.os.RemoteException;
/**
     * Check if a particular subId has an active or holding call
     *
     * @param subId user preferred subId.
     * @param callingPackage the name of the package making the call.
     * @return true if the phone state is OFFHOOK.
     */
public boolean isOffhookForSubscriber(int subId, java.lang.String callingPackage) throws android.os.RemoteException;
/**
     * Check if an incoming phone call is ringing or call waiting
     * on a particular subId.
     *
     * @param subId user preferred subId.
     * @param callingPackage the name of the package making the call.
     * @return true if the phone state is RINGING.
     */
public boolean isRingingForSubscriber(int subId, java.lang.String callingPackage) throws android.os.RemoteException;
/**
     * Check if an incoming phone call is ringing or call waiting.
     * @param callingPackage the name of the package making the call.
     * @return true if the phone state is RINGING.
     */
public boolean isRinging(java.lang.String callingPackage) throws android.os.RemoteException;
/**
     * Check if the phone is idle.
     * @param callingPackage the name of the package making the call.
     * @return true if the phone state is IDLE.
     */
public boolean isIdle(java.lang.String callingPackage) throws android.os.RemoteException;
/**
     * Check if the phone is idle on a particular subId.
     *
     * @param subId user preferred subId.
     * @param callingPackage the name of the package making the call.
     * @return true if the phone state is IDLE.
     */
public boolean isIdleForSubscriber(int subId, java.lang.String callingPackage) throws android.os.RemoteException;
/**
     * Check to see if the radio is on or not.
     * @param callingPackage the name of the package making the call.
     * @return returns true if the radio is on.
     */
public boolean isRadioOn(java.lang.String callingPackage) throws android.os.RemoteException;
/**
     * Check to see if the radio is on or not on particular subId.
     * @param subId user preferred subId.
     * @param callingPackage the name of the package making the call.
     * @return returns true if the radio is on.
     */
public boolean isRadioOnForSubscriber(int subId, java.lang.String callingPackage) throws android.os.RemoteException;
/**
     * Check if the SIM pin lock is enabled.
     * @return true if the SIM pin lock is enabled.
     * @param callingPackage The package making the call.
     */
public boolean isSimPinEnabled(java.lang.String callingPackage) throws android.os.RemoteException;
/**
     * Supply a pin to unlock the SIM.  Blocks until a result is determined.
     * @param pin The pin to check.
     * @return whether the operation was a success.
     */
public boolean supplyPin(java.lang.String pin) throws android.os.RemoteException;
/**
     * Supply a pin to unlock the SIM for particular subId.
     * Blocks until a result is determined.
     * @param pin The pin to check.
     * @param subId user preferred subId.
     * @return whether the operation was a success.
     */
public boolean supplyPinForSubscriber(int subId, java.lang.String pin) throws android.os.RemoteException;
/**
     * Supply puk to unlock the SIM and set SIM pin to new pin.
     *  Blocks until a result is determined.
     * @param puk The puk to check.
     *        pin The new pin to be set in SIM
     * @return whether the operation was a success.
     */
public boolean supplyPuk(java.lang.String puk, java.lang.String pin) throws android.os.RemoteException;
/**
     * Supply puk to unlock the SIM and set SIM pin to new pin.
     *  Blocks until a result is determined.
     * @param puk The puk to check.
     *        pin The new pin to be set in SIM
     * @param subId user preferred subId.
     * @return whether the operation was a success.
     */
public boolean supplyPukForSubscriber(int subId, java.lang.String puk, java.lang.String pin) throws android.os.RemoteException;
public int[] supplyPinReportResult(java.lang.String pin) throws android.os.RemoteException;
public int[] supplyPinReportResultForSubscriber(int subId, java.lang.String pin) throws android.os.RemoteException;
public int[] supplyPukReportResult(java.lang.String puk, java.lang.String pin) throws android.os.RemoteException;
public int[] supplyPukReportResultForSubscriber(int subId, java.lang.String puk, java.lang.String pin) throws android.os.RemoteException;
/**
     * Handles PIN MMI commands (PIN/PIN2/PUK/PUK2), which are initiated
     * without SEND (so <code>dial</code> is not appropriate).
     *
     * @param dialString the MMI command to be executed.
     * @return true if MMI command is executed.
     */
public boolean handlePinMmi(java.lang.String dialString) throws android.os.RemoteException;
/**
     * Handles PIN MMI commands (PIN/PIN2/PUK/PUK2), which are initiated
     * without SEND (so <code>dial</code> is not appropriate) for
     * a particular subId.
     * @param dialString the MMI command to be executed.
     * @param subId user preferred subId.
     * @return true if MMI command is executed.
     */
public boolean handlePinMmiForSubscriber(int subId, java.lang.String dialString) throws android.os.RemoteException;
/**
     * Toggles the radio on or off.
     */
public void toggleRadioOnOff() throws android.os.RemoteException;
/**
     * Toggles the radio on or off on particular subId.
     * @param subId user preferred subId.
     */
public void toggleRadioOnOffForSubscriber(int subId) throws android.os.RemoteException;
/**
     * Set the radio to on or off
     */
public boolean setRadio(boolean turnOn) throws android.os.RemoteException;
/**
     * Set the radio to on or off on particular subId.
     * @param subId user preferred subId.
     */
public boolean setRadioForSubscriber(int subId, boolean turnOn) throws android.os.RemoteException;
/**
     * Set the radio to on or off unconditionally
     */
public boolean setRadioPower(boolean turnOn) throws android.os.RemoteException;
/**
     * Request to update location information in service state
     */
public void updateServiceLocation() throws android.os.RemoteException;
/**
     * Request to update location information for a subscrition in service state
     * @param subId user preferred subId.
     */
public void updateServiceLocationForSubscriber(int subId) throws android.os.RemoteException;
/**
     * Enable location update notifications.
     */
public void enableLocationUpdates() throws android.os.RemoteException;
/**
     * Enable location update notifications.
     * @param subId user preferred subId.
     */
public void enableLocationUpdatesForSubscriber(int subId) throws android.os.RemoteException;
/**
     * Disable location update notifications.
     */
public void disableLocationUpdates() throws android.os.RemoteException;
/**
     * Disable location update notifications.
     * @param subId user preferred subId.
     */
public void disableLocationUpdatesForSubscriber(int subId) throws android.os.RemoteException;
/**
     * Allow mobile data connections.
     */
public boolean enableDataConnectivity() throws android.os.RemoteException;
/**
     * Disallow mobile data connections.
     */
public boolean disableDataConnectivity() throws android.os.RemoteException;
/**
     * Report whether data connectivity is possible.
     */
public boolean isDataConnectivityPossible() throws android.os.RemoteException;
public android.os.Bundle getCellLocation(java.lang.String callingPkg) throws android.os.RemoteException;
/**
     * Returns the neighboring cell information of the device.
     */
public java.util.List<android.telephony.NeighboringCellInfo> getNeighboringCellInfo(java.lang.String callingPkg) throws android.os.RemoteException;
public int getCallState() throws android.os.RemoteException;
public int getCallStateForSubscriber(int subId) throws android.os.RemoteException;
public int getDataActivity() throws android.os.RemoteException;
public int getDataState() throws android.os.RemoteException;
public int getActivePhoneType() throws android.os.RemoteException;
public int getActivePhoneTypeForSubscriber(int subId) throws android.os.RemoteException;
public int getCdmaEriIconIndex(java.lang.String callingPackage) throws android.os.RemoteException;
public int getCdmaEriIconIndexForSubscriber(int subId, java.lang.String callingPackage) throws android.os.RemoteException;
public int getCdmaEriIconMode(java.lang.String callingPackage) throws android.os.RemoteException;
public int getCdmaEriIconModeForSubscriber(int subId, java.lang.String callingPackage) throws android.os.RemoteException;
/**
     * Returns the CDMA ERI text,
     * @param callingPackage package making the call.
     */
public java.lang.String getCdmaEriText(java.lang.String callingPackage) throws android.os.RemoteException;
/**
     * Returns the CDMA ERI text for particular subId,
     * @param subId user preferred subId.
     * @param callingPackage package making the call.
     */
public java.lang.String getCdmaEriTextForSubscriber(int subId, java.lang.String callingPackage) throws android.os.RemoteException;
/**
     * Returns true if OTA service provisioning needs to run.
     * Only relevant on some technologies, others will always
     * return false.
     */
public boolean needsOtaServiceProvisioning() throws android.os.RemoteException;
/**
     * Sets the voicemail number for a particular subscriber.
     */
public boolean setVoiceMailNumber(int subId, java.lang.String alphaTag, java.lang.String number) throws android.os.RemoteException;
public int getVoiceMessageCount() throws android.os.RemoteException;
public int getVoiceMessageCountForSubscriber(int subId) throws android.os.RemoteException;
public int getNetworkType() throws android.os.RemoteException;
public int getNetworkTypeForSubscriber(int subId, java.lang.String callingPackage) throws android.os.RemoteException;
public int getDataNetworkType(java.lang.String callingPackage) throws android.os.RemoteException;
public int getDataNetworkTypeForSubscriber(int subId, java.lang.String callingPackage) throws android.os.RemoteException;
public int getVoiceNetworkTypeForSubscriber(int subId, java.lang.String callingPackage) throws android.os.RemoteException;
/**
     * Return true if an ICC card is present
     */
public boolean hasIccCard() throws android.os.RemoteException;
/**
     * Return true if an ICC card is present for a subId.
     * @param slotId user preferred slotId.
     * Return true if an ICC card is present
     */
public boolean hasIccCardUsingSlotId(int slotId) throws android.os.RemoteException;
public int getLteOnCdmaMode(java.lang.String callingPackage) throws android.os.RemoteException;
public int getLteOnCdmaModeForSubscriber(int subId, java.lang.String callingPackage) throws android.os.RemoteException;
/**
     * Returns the all observed cell information of the device.
     */
public java.util.List<android.telephony.CellInfo> getAllCellInfo(java.lang.String callingPkg) throws android.os.RemoteException;
/**
     * Sets minimum time in milli-seconds between onCellInfoChanged
     */
public void setCellInfoListRate(int rateInMillis) throws android.os.RemoteException;
public int getDefaultSim() throws android.os.RemoteException;
/**
     * Opens a logical channel to the ICC card.
     *
     * Input parameters equivalent to TS 27.007 AT+CCHO command.
     *
     * @param AID Application id. See ETSI 102.221 and 101.220.
     * @return an IccOpenLogicalChannelResponse object.
     */
public android.telephony.IccOpenLogicalChannelResponse iccOpenLogicalChannel(java.lang.String AID) throws android.os.RemoteException;
/**
     * Closes a previously opened logical channel to the ICC card.
     *
     * Input parameters equivalent to TS 27.007 AT+CCHC command.
     *
     * @param channel is the channel id to be closed as retruned by a
     *            successful iccOpenLogicalChannel.
     * @return true if the channel was closed successfully.
     */
public boolean iccCloseLogicalChannel(int channel) throws android.os.RemoteException;
/**
     * Transmit an APDU to the ICC card over a logical channel.
     *
     * Input parameters equivalent to TS 27.007 AT+CGLA command.
     *
     * @param channel is the channel id to be closed as retruned by a
     *            successful iccOpenLogicalChannel.
     * @param cla Class of the APDU command.
     * @param instruction Instruction of the APDU command.
     * @param p1 P1 value of the APDU command.
     * @param p2 P2 value of the APDU command.
     * @param p3 P3 value of the APDU command. If p3 is negative a 4 byte APDU
     *            is sent to the SIM.
     * @param data Data to be sent with the APDU.
     * @return The APDU response from the ICC card with the status appended at
     *            the end.
     */
public java.lang.String iccTransmitApduLogicalChannel(int channel, int cla, int instruction, int p1, int p2, int p3, java.lang.String data) throws android.os.RemoteException;
/**
     * Transmit an APDU to the ICC card over the basic channel.
     *
     * Input parameters equivalent to TS 27.007 AT+CSIM command.
     *
     * @param cla Class of the APDU command.
     * @param instruction Instruction of the APDU command.
     * @param p1 P1 value of the APDU command.
     * @param p2 P2 value of the APDU command.
     * @param p3 P3 value of the APDU command. If p3 is negative a 4 byte APDU
     *            is sent to the SIM.
     * @param data Data to be sent with the APDU.
     * @return The APDU response from the ICC card with the status appended at
     *            the end.
     */
public java.lang.String iccTransmitApduBasicChannel(int cla, int instruction, int p1, int p2, int p3, java.lang.String data) throws android.os.RemoteException;
/**
     * Returns the response APDU for a command APDU sent through SIM_IO.
     *
     * @param fileID
     * @param command
     * @param p1 P1 value of the APDU command.
     * @param p2 P2 value of the APDU command.
     * @param p3 P3 value of the APDU command.
     * @param filePath
     * @return The APDU response.
     */
public byte[] iccExchangeSimIO(int fileID, int command, int p1, int p2, int p3, java.lang.String filePath) throws android.os.RemoteException;
/**
     * Send ENVELOPE to the SIM and returns the response.
     *
     * @param contents  String containing SAT/USAT response in hexadecimal
     *                  format starting with command tag. See TS 102 223 for
     *                  details.
     * @return The APDU response from the ICC card, with the last 4 bytes
     *         being the status word. If the command fails, returns an empty
     *         string.
     */
public java.lang.String sendEnvelopeWithStatus(java.lang.String content) throws android.os.RemoteException;
/**
     * Read one of the NV items defined in {@link RadioNVItems} / {@code ril_nv_items.h}.
     * Used for device configuration by some CDMA operators.
     *
     * @param itemID the ID of the item to read.
     * @return the NV item as a String, or null on any failure.
     */
public java.lang.String nvReadItem(int itemID) throws android.os.RemoteException;
/**
     * Write one of the NV items defined in {@link RadioNVItems} / {@code ril_nv_items.h}.
     * Used for device configuration by some CDMA operators.
     *
     * @param itemID the ID of the item to read.
     * @param itemValue the value to write, as a String.
     * @return true on success; false on any failure.
     */
public boolean nvWriteItem(int itemID, java.lang.String itemValue) throws android.os.RemoteException;
/**
     * Update the CDMA Preferred Roaming List (PRL) in the radio NV storage.
     * Used for device configuration by some CDMA operators.
     *
     * @param preferredRoamingList byte array containing the new PRL.
     * @return true on success; false on any failure.
     */
public boolean nvWriteCdmaPrl(byte[] preferredRoamingList) throws android.os.RemoteException;
/**
     * Perform the specified type of NV config reset. The radio will be taken offline
     * and the device must be rebooted after the operation. Used for device
     * configuration by some CDMA operators.
     *
     * @param resetType the type of reset to perform (1 == factory reset; 2 == NV-only reset).
     * @return true on success; false on any failure.
     */
public boolean nvResetConfig(int resetType) throws android.os.RemoteException;
public int getCalculatedPreferredNetworkType(java.lang.String callingPackage) throws android.os.RemoteException;
public int getPreferredNetworkType(int subId) throws android.os.RemoteException;
public int getTetherApnRequired() throws android.os.RemoteException;
/**
     * Set the network selection mode to automatic.
     *
     * @param subId the id of the subscription to update.
     */
public void setNetworkSelectionModeAutomatic(int subId) throws android.os.RemoteException;
/**
     * Perform a radio scan and return the list of avialble networks.
     *
     * @param subId the id of the subscription.
     * @return CellNetworkScanResult containing status of scan and networks.
     */
public com.android.internal.telephony.CellNetworkScanResult getCellNetworkScanResults(int subId) throws android.os.RemoteException;
/**
     * Ask the radio to connect to the input network and change selection mode to manual.
     *
     * @param subId the id of the subscription.
     * @param operatorInfo the operator to attach to.
     * @param persistSelection should the selection persist till reboot or its
     *        turned off? Will also result in notification being not shown to
     *        the user if the signal is lost.
     * @return true if the request suceeded.
     */
public boolean setNetworkSelectionModeManual(int subId, com.android.internal.telephony.OperatorInfo operator, boolean persistSelection) throws android.os.RemoteException;
/**
     * Set the preferred network type.
     * Used for device configuration by some CDMA operators.
     *
     * @param subId the id of the subscription to update.
     * @param networkType the preferred network type, defined in RILConstants.java.
     * @return true on success; false on any failure.
     */
public boolean setPreferredNetworkType(int subId, int networkType) throws android.os.RemoteException;
/**
     * User enable/disable Mobile Data.
     *
     * @param enable true to turn on, else false
     */
public void setDataEnabled(int subId, boolean enable) throws android.os.RemoteException;
/**
     * Get the user enabled state of Mobile Data.
     *
     * @return true on enabled
     */
public boolean getDataEnabled(int subId) throws android.os.RemoteException;
/**
     * Get P-CSCF address from PCO after data connection is established or modified.
     * @param apnType the apnType, "ims" for IMS APN, "emergency" for EMERGENCY APN
     * @param callingPackage The package making the call.
     */
public java.lang.String[] getPcscfAddress(java.lang.String apnType, java.lang.String callingPackage) throws android.os.RemoteException;
/**
     * Set IMS registration state
     */
public void setImsRegistrationState(boolean registered) throws android.os.RemoteException;
/**
     * Return MDN string for CDMA phone.
     * @param subId user preferred subId.
     */
public java.lang.String getCdmaMdn(int subId) throws android.os.RemoteException;
/**
     * Return MIN string for CDMA phone.
     * @param subId user preferred subId.
     */
public java.lang.String getCdmaMin(int subId) throws android.os.RemoteException;
public int getCarrierPrivilegeStatus() throws android.os.RemoteException;
public int checkCarrierPrivilegesForPackage(java.lang.String pkgName) throws android.os.RemoteException;
public int checkCarrierPrivilegesForPackageAnyPhone(java.lang.String pkgName) throws android.os.RemoteException;
/**
     * Returns list of the package names of the carrier apps that should handle the input intent
     * and have carrier privileges for the given phoneId.
     *
     * @param intent Intent that will be sent.
     * @param phoneId The phoneId on which the carrier app has carrier privileges.
     * @return list of carrier app package names that can handle the intent on phoneId.
     *         Returns null if there is an error and an empty list if there
     *         are no matching packages.
     */
public java.util.List<java.lang.String> getCarrierPackageNamesForIntentAndPhone(android.content.Intent intent, int phoneId) throws android.os.RemoteException;
/**
     * Set the line 1 phone number string and its alphatag for the current ICCID
     * for display purpose only, for example, displayed in Phone Status. It won't
     * change the actual MSISDN/MDN. To unset alphatag or number, pass in a null
     * value.
     *
     * @param subId the subscriber that the alphatag and dialing number belongs to.
     * @param alphaTag alpha-tagging of the dailing nubmer
     * @param number The dialing number
     * @return true if the operation was executed correctly.
     */
public boolean setLine1NumberForDisplayForSubscriber(int subId, java.lang.String alphaTag, java.lang.String number) throws android.os.RemoteException;
/**
     * Returns the displayed dialing number string if it was set previously via
     * {@link #setLine1NumberForDisplay}. Otherwise returns null.
     *
     * @param subId whose dialing number for line 1 is returned.
     * @param callingPackage The package making the call.
     * @return the displayed dialing number if set, or null if not set.
     */
public java.lang.String getLine1NumberForDisplay(int subId, java.lang.String callingPackage) throws android.os.RemoteException;
/**
     * Returns the displayed alphatag of the dialing number if it was set
     * previously via {@link #setLine1NumberForDisplay}. Otherwise returns null.
     *
     * @param subId whose alphatag associated with line 1 is returned.
     * @param callingPackage The package making the call.
     * @return the displayed alphatag of the dialing number if set, or null if
     *         not set.
     */
public java.lang.String getLine1AlphaTagForDisplay(int subId, java.lang.String callingPackage) throws android.os.RemoteException;
public java.lang.String[] getMergedSubscriberIds(java.lang.String callingPackage) throws android.os.RemoteException;
/**
     * Override the operator branding for the current ICCID.
     *
     * Once set, whenever the SIM is present in the device, the service
     * provider name (SPN) and the operator name will both be replaced by the
     * brand value input. To unset the value, the same function should be
     * called with a null brand value.
     *
     * <p>Requires Permission:
     *   {@link android.Manifest.permission#MODIFY_PHONE_STATE MODIFY_PHONE_STATE}
     *  or has to be carrier app - see #hasCarrierPrivileges.
     *
     * @param brand The brand name to display/set.
     * @return true if the operation was executed correctly.
     */
public boolean setOperatorBrandOverride(java.lang.String brand) throws android.os.RemoteException;
/**
     * Override the roaming indicator for the current ICCID.
     *
     * Using this call, the carrier app (see #hasCarrierPrivileges) can override
     * the platform's notion of a network operator being considered roaming or not.
     * The change only affects the ICCID that was active when this call was made.
     *
     * If null is passed as any of the input, the corresponding value is deleted.
     *
     * <p>Requires that the caller have carrier privilege. See #hasCarrierPrivileges.
     *
     * @param gsmRoamingList - List of MCCMNCs to be considered roaming for 3GPP RATs.
     * @param gsmNonRoamingList - List of MCCMNCs to be considered not roaming for 3GPP RATs.
     * @param cdmaRoamingList - List of SIDs to be considered roaming for 3GPP2 RATs.
     * @param cdmaNonRoamingList - List of SIDs to be considered not roaming for 3GPP2 RATs.
     * @return true if the operation was executed correctly.
     */
public boolean setRoamingOverride(java.util.List<java.lang.String> gsmRoamingList, java.util.List<java.lang.String> gsmNonRoamingList, java.util.List<java.lang.String> cdmaRoamingList, java.util.List<java.lang.String> cdmaNonRoamingList) throws android.os.RemoteException;
public int invokeOemRilRequestRaw(byte[] oemReq, byte[] oemResp) throws android.os.RemoteException;
/**
     * Check if any mobile Radios need to be shutdown.
     *
     * @return true is any mobile radio needs to be shutdown
     */
public boolean needMobileRadioShutdown() throws android.os.RemoteException;
/**
     * Shutdown Mobile Radios
     */
public void shutdownMobileRadios() throws android.os.RemoteException;
/**
     * Set phone radio type and access technology.
     *
     * @param rafs an RadioAccessFamily array to indicate all phone's
     *        new radio access family. The length of RadioAccessFamily
     *        must equ]]al to phone count.
     */
public void setRadioCapability(android.telephony.RadioAccessFamily[] rafs) throws android.os.RemoteException;
public int getRadioAccessFamily(int phoneId, java.lang.String callingPackage) throws android.os.RemoteException;
/**
     * Enables or disables video calling.
     *
     * @param enable Whether to enable video calling.
     */
public void enableVideoCalling(boolean enable) throws android.os.RemoteException;
/**
     * Whether video calling has been enabled by the user.
     *
     * @param callingPackage The package making the call.
     * @return {@code true} if the user has enabled video calling, {@code false} otherwise.
     */
public boolean isVideoCallingEnabled(java.lang.String callingPackage) throws android.os.RemoteException;
/**
     * Whether the DTMF tone length can be changed.
     *
     * @return {@code true} if the DTMF tone length can be changed.
     */
public boolean canChangeDtmfToneLength() throws android.os.RemoteException;
/**
     * Whether the device is a world phone.
     *
     * @return {@code true} if the devices is a world phone.
     */
public boolean isWorldPhone() throws android.os.RemoteException;
/**
     * Whether the phone supports TTY mode.
     *
     * @return {@code true} if the device supports TTY mode.
     */
public boolean isTtyModeSupported() throws android.os.RemoteException;
/**
     * Whether the phone supports hearing aid compatibility.
     *
     * @return {@code true} if the device supports hearing aid compatibility.
     */
public boolean isHearingAidCompatibilitySupported() throws android.os.RemoteException;
/**
     * Get IMS Registration Status
     */
public boolean isImsRegistered() throws android.os.RemoteException;
/**
     * Returns the Status of Wi-Fi Calling
     */
public boolean isWifiCallingAvailable() throws android.os.RemoteException;
/**
     * Returns the Status of Volte
     */
public boolean isVolteAvailable() throws android.os.RemoteException;
/**
     * Returns the Status of VT (video telephony)
     */
public boolean isVideoTelephonyAvailable() throws android.os.RemoteException;
/**
      * Returns the unique device ID of phone, for example, the IMEI for
      * GSM and the MEID for CDMA phones. Return null if device ID is not available.
      *
      * @param callingPackage The package making the call.
      * <p>Requires Permission:
      *   {@link android.Manifest.permission#READ_PHONE_STATE READ_PHONE_STATE}
      */
public java.lang.String getDeviceId(java.lang.String callingPackage) throws android.os.RemoteException;
public int getSubIdForPhoneAccount(android.telecom.PhoneAccount phoneAccount) throws android.os.RemoteException;
public void factoryReset(int subId) throws android.os.RemoteException;
/**
     * An estimate of the users's current locale based on the default SIM.
     *
     * The returned string will be a well formed BCP-47 language tag, or {@code null}
     * if no locale could be derived.
     */
public java.lang.String getLocaleFromDefaultSim() throws android.os.RemoteException;
/**
     * Return the modem activity info.
     */
public android.telephony.ModemActivityInfo getModemActivityInfo() throws android.os.RemoteException;
}
