package com.company.denis.Homework8.Payment;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.*;

public class DataUtilProduct {

    public static List<Product> productList = new ArrayList<Product>() {
        {
            this.add(new Product("Телефон", "Iphone X", 200));
            this.add(new Product("Телефон", "Iphone 6s", 300));
            this.add(new Product("Телефон", "Iphone 11", 280));
            this.add(new Product("ноутбук", "lenovo", 1000));
            this.add(new Product("ноутбук", "apple", 2500));
            this.add(new Product("ноутбук", "vaio", 1200));
            this.add(new Product("планшет", "iPad 2", 1300));
            this.add(new Product("планшет", "iPad 3", 1900));
            this.add(new Product("планшет", "iPad 5", 1000));
            this.add(new Product("телевизор", "samsung", 1300));
            this.add(new Product("телевизор", "lg", 1000));
            this.add(new Product("телевизор", "горизонт", 300));
            this.add(new Product("пылесос", "samsung", 350));
            this.add(new Product("пылесос", "bosh", 500));
            this.add(new Product("пылесос", "витязь", 150));
        }
    };

    private static Set<String> createNameSet() {
        Set<String> nameSet = new TreeSet<>();
        for (Product list : productList) {
            nameSet.add(list.getName());
        }
        return nameSet;
    }

    private static String readNameProduct(BufferedReader reader) throws IOException {
        System.out.println("Выберите наименование товара из списка: ");
        System.out.print(createNameSet() + " - ");
        String name;
        while (true) {
            name = reader.readLine();
            if (createNameSet().contains(name.toLowerCase())) {
                break;
            } else {
                System.out.print("Ничего не найдено, попробуйте еще раз: ");
            }
        }
        return name;
    }

    private static List<Product> searchByNameProduct(BufferedReader reader) throws IOException {
        String name = readNameProduct(reader);
        List<Product> products = new ArrayList<>();
        for (Product product : productList) {
            if (name.equalsIgnoreCase(product.getName())) {
                products.add(product);
            }
        }
        return products;
    }

    private static String readManufacturerProduct(Set<String> manufacturerSet, BufferedReader reader) throws IOException {
        System.out.println("Выберите производителя товара из списка: ");
        System.out.print(manufacturerSet + " - ");
        String manufacturer;
        while (true) {
            manufacturer = reader.readLine();
            if (manufacturerSet.contains(manufacturer.toLowerCase())) {

                break;
            } else {
                System.out.print("Ничего не найдено, попробуйте еще раз: ");
            }
        }
        return manufacturer;
    }

    public static Product searchProduct(BufferedReader reader) throws IOException {
        Product product = null;
        List<Product> list = searchByNameProduct(reader);
        Set<String> manufacturerSet = new TreeSet<>();
        for (Product element : list) {
            manufacturerSet.add(element.getManufacturer());
        }
        String manufacturer = readManufacturerProduct(manufacturerSet, reader);
        for (Product element : list) {
            if (manufacturer.equalsIgnoreCase(element.getManufacturer())) {
                product = element;
                break;
            }
        }
        return product;
    }

    public static int readQuantity(BufferedReader reader) throws IOException {
        System.out.print("Введите количество товара: ");
        int quantity = Integer.parseInt(reader.readLine());
        return quantity;
    }
}
