package org.example.designpatterns.builder;

import org.example.designpatterns.factory.Horseman;
import org.example.designpatterns.factory.Warrior;

public class HorsemanBuilder implements WarriorBuilder {

    private final Warrior horseman;

    public HorsemanBuilder() {
        horseman = new Horseman(0);
    }

    @Override
    public WarriorBuilder joinArmy() {
        System.out.println("Horseman joined the army");
        return this;
    }

    @Override
    public WarriorBuilder takeWeapon() {
        System.out.println("Horseman took spear");
        return this;
    }

    @Override
    public WarriorBuilder completeWeaponTraining() {
        System.out.println("Horseman completed training with spear");
        this.horseman.setStrength(generateStrength());
        return this;
    }

    @Override
    public Warrior build() {
        return this.horseman;
    }
}
