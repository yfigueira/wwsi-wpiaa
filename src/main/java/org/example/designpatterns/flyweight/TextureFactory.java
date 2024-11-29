package org.example.designpatterns.flyweight;

import java.util.HashMap;
import java.util.Map;

public class TextureFactory {

    private static final Map<String, Texture> textures = new HashMap<>();

    public static Texture getTexture(String source) {
        if (!textures.containsKey(source)) {
            textures.put(source, new Texture(source));
        }
        return textures.get(source);
    }
}
