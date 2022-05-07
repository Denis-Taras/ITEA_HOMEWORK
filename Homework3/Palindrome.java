package com.company.denis.Homework3;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {

        System.out.println("Напиши чтобы опрелелить: ");
        Scanner s = new Scanner(System.in);
        String wort = s.next();
        boolean palindrom = false;

        for (int a = 0; a <= wort.length() - 1; a++) {
            for (int b = wort.length() - 1; b >= 0; b--) {
                if (wort.charAt(a) == wort.charAt(b)) {
                    palindrom = true;
                } else {
                    palindrom = false;
                }

            }
        }

        System.out.println(palindrom);

    }
}

