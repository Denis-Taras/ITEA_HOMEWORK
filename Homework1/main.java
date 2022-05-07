package com.company.denis.Homework1;

public class main {
    public static void main(String[] args) {
        int a;
        a = 4;
        if (a % 2 == 0)
            System.out.println("a" + " четное");
        else
            System.out.println("a" + " нечетное");


        int b = 12;
        int c = 24;
        int d = 35;
        int min = Math.min(Math.min(b, c), d);
        int max = Math.max(Math.max(b, c), d);
        c = (b + c + d) - min - max;
        b = min;
        d = max;

        System.out.println(b + " " + c + " " + d);
    }
}

