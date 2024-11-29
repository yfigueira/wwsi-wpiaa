package org.example.designpatterns.decorator;

public class Main {
    public static void main(String[] args) {

        var shop = new ShopDecorator();
        shop.payByCash();
        shop.payByCheck();
        shop.payByCard();
    }
}
