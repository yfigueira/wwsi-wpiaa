package org.example.codesmells.longparameterlist;

public class Main {
    public static void main(String[] args) {

        var info = new ProductInfo(
                "Product name",
                "Product category",
                12.34,
                10,
                "Supplier name",
                "Supplier contact"
        );

        var registry = new ProductRegistry();
        registry.registerProduct(info);
    }
}
