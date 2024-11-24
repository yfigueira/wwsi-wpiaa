package org.example.designpatterns.adapter;

public record Customer(
        String firstName,
        String lastName,
        Id id
) {
    public Customer withId(Id id) {
        return new Customer(firstName, lastName, id);
    }
}
