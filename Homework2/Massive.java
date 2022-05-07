package com.company.denis.Homework2;

import java.util.Arrays;

public class Massive {
    public static void main(String[] args) {
        int[] Mas = new int[8];
        for (int i = 0; i < Mas.length; i++) {
            Mas[i] = (int) (Math.random() * 9 + 1);
            System.out.print(Mas[i] + " ");
        }
        for (int i = 0; i < Mas.length; i++) {
            if (Mas[i] % 2 != 0) Mas[i] = 0;
            System.out.println(Mas[i] + "");
        }
        int[] mas = new int[8];

        for (int i = 0; i < mas.length; i++) {
            mas[i] = (int) (Math.random() * 10) + 1;
        }
        System.out.println(Arrays.toString(mas));
        for (int i = 0; i < mas.length; i++) {
            if (i % 2 == 1) {
                mas[i] = 0;
            }
        }
        System.out.println(Arrays.toString(mas));
    }
}

