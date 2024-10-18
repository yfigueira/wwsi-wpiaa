package org.example.codesmells.longparameterlist;

public record ProductInfo(
        String name,
        String category,
        double price,
        int stock,
        String supplierName,
        String supplierContact
) {
}
