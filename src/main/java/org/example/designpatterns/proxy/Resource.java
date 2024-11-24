package org.example.designpatterns.proxy;

import java.util.UUID;

public record Resource(
        UUID id,
        String content
) {
}
