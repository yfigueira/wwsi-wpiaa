package org.example.designpatterns.builder;

import org.example.designpatterns.factory.Warrior;
import org.example.designpatterns.factory.WarriorType;

public class Garrison {
    public Warrior createSoldier(WarriorType type) {
        return switch(type) {
            case FOOT_SOLDIER -> Director.createWarrior(new FootSoldierBuilder());
            case HORSEMAN -> Director.createWarrior(new HorsemanBuilder());
            case ARCHER -> Director.createWarrior(new ArcherBuilder());
        };
    }
}
