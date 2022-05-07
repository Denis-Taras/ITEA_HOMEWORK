package com.company.denis.Homework12;

import java.util.*;

public class ProductCatalog implements Comparable<ProductCatalog>{

    private String name;
    private int price;
    private int rating;

    public ProductCatalog(String name, int price, int rating) {
        this.name = name;
        this.price = price;
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "ProductCatalog{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", rating=" + rating +
                '}';
    }

    @Override
    public int compareTo(ProductCatalog o) {
        return 1;
    }

    public static void main(String[] args) {
        List<ProductCatalog> productsForCatalogs = new ArrayList<>();

        productsForCatalogs.add(new ProductCatalog("Vertu", 6987, 8));
        productsForCatalogs.add(new ProductCatalog("iPhone", 32055, 5));
        productsForCatalogs.add(new ProductCatalog("Samsung", 3690, 10));
        productsForCatalogs.add(new ProductCatalog("Motorola", 2235, 9));

        System.out.println(productsForCatalogs);

        Comparator byPrice = new CompareByPrice();
        Comparator byPriceDesc = new CompareByPriceDesc();
        Comparator byRating = new CompareByRating();
        Comparator byRatingDesc = new CompareByRatingDesc();
        Comparator byName = new CompareByName();
        Comparator byNameDesc = new CompareByNameDesc();

        Collections.sort(productsForCatalogs, byNameDesc);

        System.out.println(productsForCatalogs);
    }
}