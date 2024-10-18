package org.example.codesmells.duplicatedcode;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {

        var logger = new Logger();
        logger.logError("Error message", LocalDateTime.now());
        logger.logWarning("Warning message", LocalDateTime.now());
    }
}
