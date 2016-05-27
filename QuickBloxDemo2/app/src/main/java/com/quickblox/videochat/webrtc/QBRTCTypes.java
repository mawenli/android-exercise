package com.quickblox.videochat.webrtc;


public final class QBRTCTypes {


   public static enum QBRTCConnectionState {

      QB_RTC_CONNECTION_UNKNOWN("QB_RTC_CONNECTION_UNKNOWN", 0),
      QB_RTC_CONNECTION_NEW("QB_RTC_CONNECTION_NEW", 1),
      QB_RTC_CONNECTION_WAIT("QB_RTC_CONNECTION_WAIT", 2),
      QB_RTC_CONNECTION_PENDING("QB_RTC_CONNECTION_PENDING", 3),
      QB_RTC_CONNECTION_CONNECTING("QB_RTC_CONNECTION_CONNECTING", 4),
      QB_RTC_CONNECTION_CHECKING("QB_RTC_CONNECTION_CHECKING", 5),
      QB_RTC_CONNECTION_CONNECTED("QB_RTC_CONNECTION_CONNECTED", 6),
      QB_RTC_CONNECTION_DISCONNECTED("QB_RTC_CONNECTION_DISCONNECTED", 7),
      QB_RTC_CONNECTION_CLOSED("QB_RTC_CONNECTION_CLOSED", 8),
      QB_RTC_CONNECTION_DISCONNECT_TIMEOUT("QB_RTC_CONNECTION_DISCONNECT_TIMEOUT", 9),
      QB_RTC_CONNECTION_NOT_ANSWER("QB_RTC_CONNECTION_NOT_ANSWER", 10),
      QB_RTC_CONNECTION_NOT_OFFER("QB_RTC_CONNECTION_NOT_OFFER", 11),
      QB_RTC_CONNECTION_REJECT("QB_RTC_CONNECTION_REJECT", 12),
      QB_RTC_CONNECTION_HANG_UP("QB_RTC_CONNECTION_HANG_UP", 13),
      QB_RTC_CONNECTION_FAILED("QB_RTC_CONNECTION_FAILED", 14),
      QB_RTC_CONNECTION_ERROR("QB_RTC_CONNECTION_ERROR", 15);
      // $FF: synthetic field
      private static final QBRTCTypes.QBRTCConnectionState[] $VALUES = new QBRTCTypes.QBRTCConnectionState[]{QB_RTC_CONNECTION_UNKNOWN, QB_RTC_CONNECTION_NEW, QB_RTC_CONNECTION_WAIT, QB_RTC_CONNECTION_PENDING, QB_RTC_CONNECTION_CONNECTING, QB_RTC_CONNECTION_CHECKING, QB_RTC_CONNECTION_CONNECTED, QB_RTC_CONNECTION_DISCONNECTED, QB_RTC_CONNECTION_CLOSED, QB_RTC_CONNECTION_DISCONNECT_TIMEOUT, QB_RTC_CONNECTION_NOT_ANSWER, QB_RTC_CONNECTION_NOT_OFFER, QB_RTC_CONNECTION_REJECT, QB_RTC_CONNECTION_HANG_UP, QB_RTC_CONNECTION_FAILED, QB_RTC_CONNECTION_ERROR};


      private QBRTCConnectionState(String var1, int var2) {}

   }

   public static enum QBConferenceType {

      QB_CONFERENCE_TYPE_VIDEO("QB_CONFERENCE_TYPE_VIDEO", 0, 1),
      QB_CONFERENCE_TYPE_AUDIO("QB_CONFERENCE_TYPE_AUDIO", 1, 2);
      private final int value;
      // $FF: synthetic field
      private static final QBRTCTypes.QBConferenceType[] $VALUES = new QBRTCTypes.QBConferenceType[]{QB_CONFERENCE_TYPE_VIDEO, QB_CONFERENCE_TYPE_AUDIO};


      private QBConferenceType(String var1, int var2, int value) {
         this.value = value;
      }

      public int getValue() {
         return this.value;
      }

      public String toString() {
         return "QBConferenceType{value=\'" + this.value + '\'' + '}';
      }

   }
}
