package org.example.designpatterns.proxy;

import java.util.UUID;

public class StandardResourceServer implements ResourceServer {

    @Override
    public Resource accessResource() {
        return new Resource(UUID.randomUUID(), "Publicly accessible content");
    }
}
