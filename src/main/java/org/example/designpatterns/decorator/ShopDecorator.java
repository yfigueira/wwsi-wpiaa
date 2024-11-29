package org.example.designpatterns.decorator;

public class ShopDecorator extends Shop {

    private void sendSMSNotification() {
        System.out.println("Payment successful");
    }

    private void addLoyaltyPoints() {
        System.out.println("Added loyalty points");
    }

    private void redirectToShop() {
        System.out.println("Redirecting to shop web page");
    }

    @Override
    public void payByCard() {
        super.payByCard();
        sendSMSNotification();
        addLoyaltyPoints();
        redirectToShop();
    }
}
