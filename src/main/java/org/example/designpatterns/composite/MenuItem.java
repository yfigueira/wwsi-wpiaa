package org.example.designpatterns.composite;

import java.util.List;

public record MenuItem(
        String name,
        List<MenuItem> children
) {
}
