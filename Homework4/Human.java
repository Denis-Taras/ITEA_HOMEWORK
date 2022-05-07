package com.company.denis.Homework4;

public class Human {
    String name;
    String secondName;
    public Human(String name, String secondName) {
        this.name = name;         this.secondName = secondName;
    }
    @Override     public String toString() {
        return name + " " + secondName;
    }
}