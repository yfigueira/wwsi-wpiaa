package org.example.designpatterns.singleton;

public class Main {
    public static void main(String[] args) {
        var vault1 = Vault.getInstance();
        System.out.println(vault1.getAccessKey());

        var vault2 = Vault.getInstance();
        System.out.println(vault2.getAccessKey());
    }
}
