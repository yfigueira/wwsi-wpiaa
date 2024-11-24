package org.example.designpatterns.adapter;

public class Security {

    public boolean verifyAge(Customer customer) {
        return customer.id().isAdult();
    }
}
