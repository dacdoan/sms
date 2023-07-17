package top.flyon.sms;

import android.telephony.SmsManager;
import android.util.Log;

public class Forwarder {
    public static void forwardViaTelegram(String senderNumber, String message, String targetTelegramID, String telegramToken) {
        new ForwardTaskForTelegram(senderNumber, message, targetTelegramID, telegramToken).execute();
    }
    public static void forwardViaWeb(String senderNumber, String message, String endpoint) {
        new ForwardTaskForWeb(senderNumber, message, endpoint).execute();
    }
}
