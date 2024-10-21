package org.example.designpatterns.prototype;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.Random;

public class OrkFactory {

    public static Ork copyOf(Ork ork) throws JsonProcessingException {
        var mapper = new ObjectMapper();
        var blueprint = mapper.writeValueAsString(ork);
        var copy = mapper.readValue(blueprint, Ork.class);

        var random = new Random();
        var strength = random.nextInt(25, 31);
        var stamina = random.nextInt(11);

        return copy.withStrength(strength).withStamina(stamina);
    }
}
