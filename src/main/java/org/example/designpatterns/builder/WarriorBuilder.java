package org.example.designpatterns.builder;

import org.example.designpatterns.factory.Warrior;

import java.util.Random;

public interface WarriorBuilder {
    WarriorBuilder joinArmy();
    WarriorBuilder takeWeapon();
    WarriorBuilder completeWeaponTraining();
    Warrior build();

    default int generateStrength() {
        return new Random().nextInt(32, 43);
    }
}
