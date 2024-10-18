package org.example.codesmells.duplicatedcode;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Logger {

    public void logError(String message, LocalDateTime timestamp) {
        log(message, MessageType.ERROR, timestamp);
    }

    public void logWarning(String message, LocalDateTime timestamp) {
        log(message, MessageType.WARNING, timestamp);
    }

    private void log(String message, MessageType type, LocalDateTime timestamp) {
        String formattedTimestamp = timestamp.format(DateTimeFormatter.ISO_DATE_TIME);
        String formattedMessage = "%s: [%s] %s".formatted(type.name(), formattedTimestamp , message);
        System.out.println(formattedMessage);
    }
}
