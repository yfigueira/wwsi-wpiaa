package org.example.designpatterns.bridge;

public class WindowsOS extends OperatingSystem {

    public WindowsOS(Interface userInterface) {
        super(userInterface);
    }

    public static OperatingSystem run() {
        return new WindowsOS(new GUI());
    }

    @Override
    public void displayMenu() {
        getInterface().displayMenu();
    }
}
