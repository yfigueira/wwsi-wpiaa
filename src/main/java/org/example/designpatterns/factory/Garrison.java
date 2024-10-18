package org.example.designpatterns.factory;

public class Garrison {
    public Warrior createSoldier(WarriorSpec spec) {
        return switch (spec.type()) {
            case ARCHER -> new Archer(spec.strength());
            case FOOT_SOLDIER -> new FootSoldier(spec.strength());
            case HORSEMAN -> new Horseman(spec.strength());
        };
    }
}
