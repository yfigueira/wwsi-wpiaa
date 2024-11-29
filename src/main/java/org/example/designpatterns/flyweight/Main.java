package org.example.designpatterns.flyweight;

public class Main {
    public static void main(String[] args) {
        var ork = TextureFactory.getTexture("ork.png");
        ork.renderAt(0,0);

        var ork1 = TextureFactory.getTexture("ork.png");
        ork1.renderAt(1,1);

        var ork2 = TextureFactory.getTexture("ork.png");
        ork2.renderAt(2,2);
    }
}
