package edu.sharif.selab.services;

import edu.sharif.selab.models.EmailMessage;
import edu.sharif.selab.models.SmsMessage;
import edu.sharif.selab.models.TelegramMessage;

import java.util.regex.Pattern;

public class TelegramMessageService implements MessageService {

    @Override
    public void sendMessage(TelegramMessage telegramMessage) {
        if (validateTelegramId(telegramMessage.getSourceId()) && validateTelegramId(telegramMessage.getDestinationId())) {
            System.out.println("Sending a Telegram Message from " + telegramMessage.getSourceId() + " to " + telegramMessage.getDestinationId() + " with content : " + telegramMessage.getContent());
        } else {
            throw new IllegalArgumentException("Telegram Id is Not Correct!");
        }
    }

    private boolean validateTelegramId(String telegramId) {
        // Check if the id is empty
        if (telegramId == null || telegramId.isEmpty()) {
            return false;
        }

        // Regular expression pattern for validating telegram id
        String telegramIdRegex = "^[a-zA-Z]+\\w*[a-zA-Z0-9]+$";

        // Compile the pattern into a regex Pattern object
        Pattern pattern = Pattern.compile(telegramIdRegex);

        // Check if the telegram id matches the regex pattern
        return pattern.matcher(telegramId).matches();
    }
}
