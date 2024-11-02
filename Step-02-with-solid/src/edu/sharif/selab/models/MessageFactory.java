package edu.sharif.selab.models;

import java.util.Scanner;

public class MessageFactory {

    public static Message createMessage(Scanner scanner, MessagingType messagingType) {
        String source;
        String target;
        String content;
        Message message;

        switch (messagingType) {
            case SMS:
                SmsMessage smsMessage = new SmsMessage();
                System.out.print("Enter source phone: ");
                source = scanner.next();
                smsMessage.setSourcePhoneNumber(source);
                System.out.print("Enter target phone: ");
                target = scanner.next();
                smsMessage.setTargetPhoneNumber(target);
                System.out.println("Write Your Message: ");
                content = scanner.next(".*$");
                smsMessage.setContent(content);
                message = smsMessage;
                break;
            case EMAIL:
                EmailMessage emailMessage = new EmailMessage();
                System.out.print("Enter source email: ");
                source = scanner.next();
                emailMessage.setSourceEmailAddress(source);
                System.out.print("Enter target email: ");
                target = scanner.next();
                emailMessage.setTargetEmailAddress(target);
                System.out.println("Write Your Message: ");
                content = scanner.next();
                emailMessage.setContent(content);
                message = emailMessage;
                break;
            case TELEGRAM:
                TelegramMessage telegramMessage = new TelegramMessage();
                System.out.print("Enter source id: ");
                source = scanner.next();
                telegramMessage.setSourceId(source);
                System.out.print("Enter target id: ");
                target = scanner.next();
                telegramMessage.setDestinationId(target);
                System.out.println("Write Your Message: ");
                content = scanner.next();
                telegramMessage.setContent(content);
                message = telegramMessage;
                break;
            default:
                throw new IllegalArgumentException("Illegal messaging type!");
        }

        return message;
    }

}
