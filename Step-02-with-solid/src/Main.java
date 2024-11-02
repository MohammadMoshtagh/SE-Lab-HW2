import edu.sharif.selab.models.*;
import edu.sharif.selab.services.EmailMessageService;
import edu.sharif.selab.services.MessageService;
import edu.sharif.selab.services.MessageServiceFactory;
import edu.sharif.selab.services.SmsMessageService;

import java.util.Arrays;
import java.util.Scanner;

import static edu.sharif.selab.models.MessagingType.SMS;

public class Main {
    public static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Hello and Welcome to SE Lab Messenger.");
        int userAnswer = 0;
        do {
            Message message = null;
            String source;
            String target;
            String content;

            System.out.println("In order to send Sms message enter 1");
            System.out.println("In order to send Email message enter 2");
            System.out.println("In order to Exit, Enter 0");

            userAnswer= scanner.nextInt();

            if(userAnswer==0){
                break;
            }

            MessagingType messagingType = MessagingType.fromId(userAnswer);
            MessageService messageService = MessageServiceFactory.getMessageService(messagingType);

            switch (messagingType){
                case SMS:
                    SmsMessage smsMessage = new SmsMessage();
                    System.out.print("Enter source phone : ");
                    source = scanner.next();
                    smsMessage.setSourcePhoneNumber(source);
                    System.out.print("Enter target phone : ");
                    target = scanner.next();
                    smsMessage.setTargetPhoneNumber(target);
                    System.out.println("Write Your Message : ");
                    content = scanner.next(".*$");
                    smsMessage.setContent(content);
                    message = smsMessage;
                    break;
                case EMAIL:
                    EmailMessage emailMessage = new EmailMessage();
                    System.out.print("Enter source phone : ");
                    source = scanner.next();
                    emailMessage.setSourceEmailAddress(source);
                    System.out.print("Enter target phone : ");
                    target = scanner.next();
                    emailMessage.setTargetEmailAddress(target);
                    System.out.println("Write Your Message : ");
                    content = scanner.next();
                    emailMessage.setContent(content);
                    message = emailMessage;
                    break;
                case TELEGRAM:
                    TelegramMessage telegramMessage = new TelegramMessage();
                    System.out.print("Enter source id : ");
                    source = scanner.next();
                    telegramMessage.setSourceId(source);
                    System.out.print("Enter target id : ");
                    target = scanner.next();
                    telegramMessage.setDestinationId(target);
                    System.out.println("Write Your Message : ");
                    content = scanner.next();
                    telegramMessage.setContent(content);
                    message = telegramMessage;
                    break;
            }

            messageService.sendMessage(message);

        } while (true);
    }
}