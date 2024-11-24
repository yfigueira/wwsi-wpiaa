package org.example.designpatterns.bridge;

public class GUI implements Interface {

    @Override
    public void displayMenu() {
        System.out.println("Graphical menu");
    }
}
