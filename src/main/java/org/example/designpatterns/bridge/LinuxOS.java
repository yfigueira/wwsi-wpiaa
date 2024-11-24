package org.example.designpatterns.bridge;

public class LinuxOS extends OperatingSystem {

    private Interface userInterface;

    public LinuxOS(Interface userInterface) {
        super(userInterface);
    }

    public static OperatingSystem run() {
        return new LinuxOS(new GUI());
    }

    @Override
    public void displayMenu() {
        getInterface().displayMenu();
    }
}
