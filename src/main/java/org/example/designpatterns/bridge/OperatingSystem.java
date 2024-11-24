package org.example.designpatterns.bridge;

public abstract class OperatingSystem {

    private Interface userInterface;

    public OperatingSystem(Interface userInterface) {
        this.userInterface = userInterface;
    }

    protected Interface getInterface() {
        return userInterface;
    }

    public void use(Interface userInterface) {
        this.userInterface = userInterface;
    }

    public abstract void displayMenu();
}
