package org.example.designpatterns.flyweight;

public record Texture(
        String source
) {

    public void renderAt(int x, int y) {
        System.out.printf("Rendering texture from [%s] at (%d, %d)%n", source, x, y);
    }
}
