package org.example.designpatterns.proxy;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        var scanner = new Scanner(System.in);

        System.out.println("Select resource to access:\na - public\nb - secured");
        var selected = scanner.nextLine();

        var resource = switch (selected) {
            case "a" -> accessResource(new StandardResourceServer());
            case "b" -> accessResource(new ProxyResourceServer());
            default -> null;
        };

        System.out.println(resource == null ? "Resource unavailable" : resource.content());
    }

    private static Resource accessResource(ResourceServer resourceServer) {
        return resourceServer.accessResource();
    }
}
