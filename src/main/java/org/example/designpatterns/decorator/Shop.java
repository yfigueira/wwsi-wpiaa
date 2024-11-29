package org.example.designpatterns.decorator;

public class Shop {

    public void payByCash() {
        System.out.println("Paid in cash");
    }

    public void payByCheck() {
        System.out.println("Paid by check");
    }

    public void payByCard() {
        System.out.println("Paid by credit card");
    }
}
