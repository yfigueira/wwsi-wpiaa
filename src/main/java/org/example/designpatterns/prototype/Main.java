package org.example.designpatterns.prototype;

import com.fasterxml.jackson.core.JsonProcessingException;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Main {
    public static void main(String[] args) throws JsonProcessingException {

        var ork = new Ork(UUID.randomUUID(), 30, 8);

        List<Ork> army = new ArrayList<>();
        army.add(ork);

        for (int i = 0; i < 5; i++) {
            army.add(OrkFactory.copyOf(ork));
        }

        army.forEach(Main::printStats);
    }

    private static void printStats(Ork ork) {
        System.out.printf(
                "%nOrk: %s  |  Strength: %d  |  Stamina: %d%n",
                ork.id(),
                ork.strength(),
                ork.stamina()
        );
    }
}
