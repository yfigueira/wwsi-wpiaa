package org.example.designpatterns.builder;

import org.example.designpatterns.factory.Warrior;
import org.example.designpatterns.factory.WarriorType;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        var garrison = new Garrison();

        var warriors = List.of(
                WarriorType.FOOT_SOLDIER,
                WarriorType.FOOT_SOLDIER,
                WarriorType.HORSEMAN,
                WarriorType.HORSEMAN,
                WarriorType.ARCHER,
                WarriorType.ARCHER
        );

        warriors.stream()
                .map(garrison::createSoldier)
                .forEach(Main::printStats);
    }

    private static void printStats(Warrior warrior) {
        System.out.printf("""
                        %n ------------------------------------------------------- %n
                        Warrior: %s | Strength: %s | Weapon: %s
                        %n ------------------------------------------------------- %n
                        """,
                warrior.getId(),
                warrior.getStrength(),
                warrior.getWeapon());
    }
}
