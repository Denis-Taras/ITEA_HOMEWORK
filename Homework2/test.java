package com.company.denis.Homework2;

import java.util.Arrays;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.print("");
        for (int a = 5; a >= 1; a--) {
            System.out.print(a + " ");
        }
        System.out.println();
        for (int i = 1; i <= 10; i++) {
            System.out.println("3*" + i + "=" + 3 * i);
        }
        System.out.print("Enter any positive integer: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum = sum + i;
        }
        System.out.println(sum);
    }
}
