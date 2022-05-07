package com.company.denis.Homework8.BlueRayDisc;

public class BlueRayDisc {

    Info info = new Info();

    {
        info.subdirectories = 2;
        info.directories = 6;

    }

    class Info{
        int subdirectories;
        int directories;

    }

    public void printInfo() {
        System.out.println("Количество каталогов: " + info.directories);
        System.out.println("Количество подкаталогов: " + info.subdirectories);
    }

    public static void main(String[] args) {
        BlueRayDisc blueRayDisc = new BlueRayDisc();
        blueRayDisc.printInfo();
    }
}