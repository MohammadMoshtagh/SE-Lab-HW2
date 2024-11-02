package edu.sharif.selab.services;

import edu.sharif.selab.models.EmailMessage;
import edu.sharif.selab.models.SmsMessage;

public interface MessageService {
    public void sendMessage(Message message);

    protected boolean validateEmailAddress(String email);
}
