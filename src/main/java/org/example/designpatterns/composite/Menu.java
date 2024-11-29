package org.example.designpatterns.composite;

import java.util.List;

public class Menu {

    private final List<MenuItem> items;

    public Menu(List<MenuItem> items) {
        this.items = items;
    }

    public void display() {
        System.out.println("---- MENU ----\n");
        items.forEach(this::display);
    }

    private void display(MenuItem item) {
        System.out.println("-- " + item.name());

        if (!item.children().isEmpty()) {
            item.children().forEach(child -> {
                System.out.print("-- ");
                this.display(child);
            });
        }
    }
}
