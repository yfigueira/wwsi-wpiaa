package org.example.designpatterns.prototype;

import java.util.UUID;

public record Ork(
        UUID id,
        int strength,
        int stamina
) {
    public Ork withStrength(int strength) {
        return new Ork(this.id, strength, this.stamina);
    }

    public Ork withStamina(int stamina) {
        return new Ork(this.id, this.strength, stamina);
    }
}
