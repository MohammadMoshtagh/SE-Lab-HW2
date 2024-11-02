package edu.sharif.selab.models;

public enum MessagingType {
    SMS(1),
    EMAIL(2),
    TELEGRAM(3);

    public final int id;

    MessagingType(int id) {
        this.id = id;
    }

    public static MessagingType fromId(int id) {
        switch (id) {
            case 1:
                return SMS;
            case 2:
                return EMAIL;
            case 3:
                return TELEGRAM;
            default:
                throw new IllegalArgumentException("Invalid id: " + id);
        }
    }
}
