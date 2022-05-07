package com.company.denis.Homework3;

import java.util.ArrayList;
import java.util.List;



class Main {
    static void checkExistance(String str1, String str_to_search) {
        int chk = 0;
        char chhr = ' ';
        int[] a = new int[Character.MAX_VALUE + 1];

        for (int i = 0; i < str1.length(); i++) {
            chhr = str1.charAt(i);
            ++a[chhr];
        }
        for (int i = 0; i < str_to_search.length(); i++) {
            chhr = str_to_search.charAt(i);
            if (a[chhr] >= 1)
                chk = 1;
        }
        if (chk == 1)
            System.out.println(str1);
    }

    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("rabbit");
        list.add("bribe");
        list.add("dog");
        System.out.print("The given strings are: ");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + "   ");
        }
        System.out.println("\nThe given word is: bib ");
        System.out.println("\nThe strings containing all the letters of the given word are: ");
        for (int j = 0; j < list.size(); j++) {
            checkExistance(list.get(j), "bib");
        }


        String line1 = "PHP Exercises and ";
        String line2 = "Python Exercises";
        String result = line1 + line2;
        System.out.println(result);

        String s1 = "This is exercise 1 ";
        String s2 = "This is Exercise 1";
        System.out.println(s1 == s2);
    }
}

