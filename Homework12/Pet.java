package com.company.denis.Homework12;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Pet {

    private String color;
    private int age;

    public Pet(String color, int age) {
        this.color = color;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Pet{" +
                "color='" + color + '\'' +
                ", age=" + age +
                '}';
    }

    private static Set<String> getKeys(Map<String, Pet> petMap) {
        Set<String> keySet = petMap.keySet();
        return keySet;
    }

    public static void main(String[] args) {
        Map<String, Pet> petMap = new HashMap<>();

        petMap.put("CatKey", new Cat("black", 5));
        petMap.put("DogKey", new Dog("brown", 13));
        petMap.put("ParrotKey", new Parrot("green", 1));
        petMap.put("PetKey", new Pet("black", 5));

        for (String key: getKeys(petMap)) {
            System.out.println("The key is: " + key);
        }
    }
}
