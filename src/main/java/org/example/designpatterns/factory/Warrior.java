package org.example.designpatterns.factory;

import java.util.UUID;

public abstract class Warrior {

    private final UUID id;
    private int strength;

    protected Warrior(int strength) {
        this.strength = strength;
        this.id = UUID.randomUUID();
    }

    public UUID getId() {
        return id;
    }

    public int getStrength() {
        return this.strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public abstract String getWeapon();
}
