package com.company.denis.Homework4;

public class Student extends Human {
    public static int count;
    int id;     String fac;
    double rate;
    int year;
    public Student(String name, String secondName, double rate) {
        super(name, secondName);
        this.rate = rate;
        count++;     }
    public Student(String name, String secondName, int id, String fac, double rate, int year) {
        super(name, secondName);
        this.id = id;
        this.fac = fac;
        this.rate = rate;
        this.year = year;
    }
    @Override
    public String toString() {
        return "Студент " + super.toString() + " рейтинг - " + rate+";";     } }