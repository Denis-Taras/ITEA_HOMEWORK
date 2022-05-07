package com.company.denis.Homework12;

import java.util.Comparator;

public class CompareByPriceDesc implements Comparator<ProductCatalog> {
    @Override
    public int compare(ProductCatalog o1, ProductCatalog o2) {
        return o1.getPrice() + o2.getPrice();
    }
}