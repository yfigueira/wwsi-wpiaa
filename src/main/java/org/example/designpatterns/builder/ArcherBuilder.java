package org.example.designpatterns.builder;

import org.example.designpatterns.factory.Archer;
import org.example.designpatterns.factory.Warrior;

public class ArcherBuilder implements WarriorBuilder {

    private final Warrior archer;

    public ArcherBuilder() {
        this.archer = new Archer(0);
    }

    @Override
    public WarriorBuilder joinArmy() {
        System.out.println("Archer joined the army");
        return this;
    }

    @Override
    public WarriorBuilder takeWeapon() {
        System.out.println("Archer took bow");
        return this;
    }

    @Override
    public WarriorBuilder completeWeaponTraining() {
        System.out.println("Archer completed training with bow");
        this.archer.setStrength(generateStrength());
        return this;
    }

    @Override
    public Warrior build() {
        return this.archer;
    }
}
