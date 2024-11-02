import edu.sharif.selab.models.*;
import edu.sharif.selab.services.MessageService;
import edu.sharif.selab.services.MessageServiceFactory;

import java.util.Scanner;

public class Main {

    public static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Hello and Welcome to SE Lab Messenger.");
        int userAnswer = 0;
        do {

            for (MessagingType messagingType : MessagingType.values()) {
                System.out.println("In order to send " + messagingType.name() + " message enter" + messagingType.id);
            }

            userAnswer = scanner.nextInt();

            if (userAnswer == 0) {
                break;
            }

            MessagingType messagingType = MessagingType.fromId(userAnswer);
            MessageService messageService = MessageServiceFactory.getMessageService(messagingType);
            Message message = MessageFactory.createMessage(scanner, messagingType);

            messageService.sendMessage(message);

        } while (true);
    }
}