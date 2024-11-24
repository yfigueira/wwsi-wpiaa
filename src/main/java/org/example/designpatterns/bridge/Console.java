package org.example.designpatterns.bridge;

public class Console implements Interface {

    @Override
    public void displayMenu() {
        System.out.println("Text menu");
    }
}
