package org.example.designpatterns.singleton;

import java.util.Random;

public class Vault {

    private static final Vault instance;
    private final String accessKey;

    static {
        instance = new Vault();
    }

    private Vault() {
        this.accessKey = generateKey();
    }

    public static Vault getInstance() {
        return instance;
    }

    public String getAccessKey() {
        return this.accessKey;
    }

    private String generateKey() {
        return "S3CR3T_K3Y_" + new Random().nextInt();
    }
}
