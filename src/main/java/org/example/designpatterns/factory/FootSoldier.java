package org.example.designpatterns.factory;

public class FootSoldier extends Warrior {
    public FootSoldier(int strength) {
        super(strength);
    }

    @Override
    public String getWeapon() {
        return "Sword";
    }
}
