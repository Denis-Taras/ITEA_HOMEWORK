package com.company.denis.Homework2;

import java.util.Arrays;
import java.util.Scanner;

public class Quest {
    public static void main(String[] args) {
        int a = 7;
        while (a <= 98) {
            System.out.print(a + " ");
            a += 7;
        }
        System.out.println();
        int n = 1;
        while (n <= 512) {
            System.out.print(n + " ");
            n *= 2;
            String answer;
            boolean exit;
            System.out.println("Что это есть такое: синий, большой, с усами и полный зайцев?");

            Scanner inputAnswer = new Scanner(System.in);

            exit = false;
            for (int i = 1; i <= 3; i++) {
                if (exit == true)
                    break;
                answer = inputAnswer.next();
                switch (answer) {
                    case ("троллейбус"):
                        System.out.println("Правильно!");
                        exit = true;
                        break;
                    case ("Сдаюсь"):
                        System.out.println("Правильный ответ: Троллейбус.");
                        exit = true;
                        break;
                    default:
                        System.out.println("Подумай еще.");
                }
            }
            int[] mas = new int[12];
            int maxNumber = -16;
            int maxIndex = 0;

            for (int i = 0; i < mas.length; i++) {
                mas[i] = (int) (Math.random() * 31) - 15;
                if (maxNumber <= mas[i]) {
                    maxNumber = mas[i];
                    maxIndex = i;
                }
            }

            System.out.println("Максимальный : " + maxIndex);
        }
        int[] Mas = new int[4];
        for (int i = 0; i < Mas.length; i++) {
            Mas[i] = (int) (Math.random() * 90 + 10);
            System.out.print(Mas[i] + " ");
        }

        for (int i = 0; i < Mas.length; i++) {
            if (i > 0) {
                if (Mas[i - 1] >= Mas[i]) {
                    System.out.println("Не возвраштающая");
                }
            }
        }
        int[] mas1 = new int[5];
        int[] mas2 = new int[5];

        for (int i = 0; i < 5; i++) {
            mas1[i] = (int) (Math.random() * 6);
            mas2[i] = (int) (Math.random() * 6);
        }
        System.out.println(Arrays.toString(mas1));
        System.out.println(Arrays.toString(mas2));

        double average1 = 0;
        double average2 = 0;

        for (int i = 0; i < 5; i++) {
            average1 += mas1[i];
            average2 += mas2[i];
        }
        average1 /= 5;
        average2 /= 5;

        if (average1 > average1) {
            System.out.println("Среднее первого массива (" + average1 + ") больше среднего арифметического " +
                    "второго массива (" + average2 + ")");
        } else if (average1 < average2) {
            System.out.println("Среднее первого массива (" + average1 + ") меньше среднего арифметического " +
                    "второго массива (" + average2 + ")");
        } else {
            System.out.println("Средние массивов равны (" + average1 + ")");
        }
    }
}