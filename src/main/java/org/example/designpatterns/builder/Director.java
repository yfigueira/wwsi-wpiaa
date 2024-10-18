package org.example.designpatterns.builder;

import org.example.designpatterns.factory.Warrior;

public class Director {
    public static Warrior createWarrior(WarriorBuilder builder) {
        return builder
                .joinArmy()
                .takeWeapon()
                .completeWeaponTraining()
                .build();
    }
}
