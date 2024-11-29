package org.example.designpatterns.composite;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<MenuItem> menuItems = List.of(
                new MenuItem(
                "Zupy", List.of(
                        new MenuItem("Pomidorowa", List.of()),
                        new MenuItem("Rosół", List.of())
                )),
                new MenuItem(
                        "Dania główne", List.of(
                        new MenuItem("Kotlet schabowy z ziemniakami", List.of()),
                        new MenuItem("Pierogi z mięsem", List.of())
                )),
                new MenuItem("Desery", List.of(
                                new MenuItem("Sernik z owocami", List.of()),
                                new MenuItem("Lody", List.of())
                ))
        );

        var menu = new Menu(menuItems);
        menu.display();
    }
}
