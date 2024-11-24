package org.example.designpatterns.adapter;

public class Main {
    public static void main(String[] args) {

        var security = new Security();

        var krzys = new Customer("Krzyś", "Nowak", new Id());

        System.out.println("Customer allowed: " + security.verifyAge(krzys));

        var fakeId = new FakeId();
        System.out.println("Customer allowed: " + security.verifyAge(krzys.withId(fakeId)));
    }
}
