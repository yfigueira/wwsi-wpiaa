package org.example.designpatterns.factory;

public class Archer extends Warrior {
    public Archer(int strength) {
        super(strength);
    }

    @Override
    public String getWeapon() {
        return "Bow";
    }
}
