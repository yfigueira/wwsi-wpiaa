package org.example.designpatterns.factory;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        var garrison = new Garrison();
        var warriors = List.of(
                new WarriorSpec(WarriorType.FOOT_SOLDIER, 29),
                new WarriorSpec(WarriorType.FOOT_SOLDIER, 30),
                new WarriorSpec(WarriorType.FOOT_SOLDIER, 31),
                new WarriorSpec(WarriorType.HORSEMAN, 33),
                new WarriorSpec(WarriorType.HORSEMAN, 33),
                new WarriorSpec(WarriorType.HORSEMAN, 35),
                new WarriorSpec(WarriorType.ARCHER, 38),
                new WarriorSpec(WarriorType.ARCHER, 38),
                new WarriorSpec(WarriorType.ARCHER, 40),
                new WarriorSpec(WarriorType.ARCHER, 41)
        );

        warriors.stream()
                .map(garrison::createSoldier)
                .forEach(Main::printStats);
    }

    private static void printStats(Warrior warrior) {
        System.out.printf("Warrior: %s | Strength: %s | Weapon: %s%n",
                warrior.getId(),
                warrior.getStrength(),
                warrior.getWeapon());
    }
}
