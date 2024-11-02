package edu.sharif.selab.services;

import edu.sharif.selab.models.MessagingType;

public class MessageServiceFactory {

    public static MessageService getMessageService(MessagingType messagingType) {
        switch (messagingType) {
            case EMAIL: return EmailMessageService.getInstance();
            case SMS: return SmsMessageService.getInstance();
            case TELEGRAM: return TelegramMessageService.getInstance();
            default:
                throw new IllegalArgumentException("Illegal messaging type!");
        }
    }
}
