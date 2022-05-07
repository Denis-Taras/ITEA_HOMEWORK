package com.company.denis.Homework12;

import java.util.Map;
import java.util.Set;

public class HashMap {

    private static Set<Map.Entry<String, Product>> getEntrySet(Map <String, Product> map) {
        Set<Map.Entry<String, Product>> entries = map.entrySet();
        return entries;
    }

    private static Set<String> getKeySet(Map <String, Product> map) {
        Set<String> keySet = map.keySet();
        return keySet;
    }

    public static void main(String[] args) {
        Map<String, Product> map = new java.util.HashMap<>();

        map.put("Plane", new Product(10102, 236.5));
        map.put("Cow", new Product(10107, 352));
        map.put("Chicken", new Product(27036, 399.99));
        map.put("Car", new Product(18965, 1240.9));

        for (Map.Entry<String, Product> entry: getEntrySet(map)) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        for (String key: getKeySet(map)) {
            System.out.println("The key is: " + key);
        }

        for (Map.Entry<String, Product> product: getEntrySet(map)) {
            System.out.println("The value is: " + product.getValue());
        }
    }
}