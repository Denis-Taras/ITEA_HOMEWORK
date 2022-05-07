package com.company.denis.Homework12;

import java.util.Comparator;

public class CompareByRating implements Comparator<ProductCatalog> {
    @Override
    public int compare(ProductCatalog o1, ProductCatalog o2) {
        return o1.getRating() - o2.getRating();
    }
}