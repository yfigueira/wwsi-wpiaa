package org.example.designpatterns.bridge;

public class Main {
    public static void main(String[] args) {

        var windows = WindowsOS.run();
        windows.displayMenu();

        var linux = LinuxOS.run();
        linux.displayMenu();

        linux.use(new Console());
        linux.displayMenu();
    }
}
