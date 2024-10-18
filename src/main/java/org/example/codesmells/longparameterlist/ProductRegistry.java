package org.example.codesmells.longparameterlist;

public class ProductRegistry {

    public void registerProduct(ProductInfo productInfo) {
        System.out.printf(
                "Product: %s, Category: %s, Price: %.2f, Stock: %d, Supplier: %s, Contact: %s",
                productInfo.name(),
                productInfo.category(),
                productInfo.price(),
                productInfo.stock(),
                productInfo.supplierName(),
                productInfo.supplierContact()
        );
    }
}
