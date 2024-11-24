package org.example.designpatterns.proxy;

import java.util.Scanner;
import java.util.UUID;

public class ProxyResourceServer implements ResourceServer {

    @Override
    public Resource accessResource() {
        var secretResource = new Resource(UUID.randomUUID(), "Secret content");
        return userAuthorized() ? secretResource : null;
    }

    private boolean userAuthorized() {
        System.out.println("Please enter your password:");
        var scanner = new Scanner(System.in);
        var password = scanner.nextLine();
        scanner.close();
        if (password.length() < 5) {
            System.out.println("Unauthorized - password should have at least 5 characters");
            return false;
        }
        System.out.printf("Password [ %s ] correct%n", password);
        return true;
    }
}
