package com.company.denis.Homework8.Mobile;

public class Mobile {

    String brand;
    String model;
    Info info;

    {
        info = new Info();
        info.battery = 3600;
        info.sizeScreen = 5.0;
        info.processor = "Apple A11 Bionic";
    }

    class Info{
        double sizeScreen;
        String processor;
        int battery;
    }

    public Mobile(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public void printInfo(){
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Screen size: " + info.sizeScreen);
        System.out.println("Processor: " + info.processor);
        System.out.println("Battery: " + info.battery + " мАч");
    }

    public static void main(String[] args) {
        Mobile mobile = new Mobile("Apple", "iPhone 11 Pro");
        mobile.printInfo();
    }
}
