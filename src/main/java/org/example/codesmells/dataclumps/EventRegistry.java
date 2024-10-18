package org.example.codesmells.dataclumps;

public class EventRegistry {

    public void registerEvent(EventDetails details) {
        System.out.printf("Event: %s, Date: %s, Location: %s",
                details.name(),
                details.date(),
                details.location()
        );
    }
}
