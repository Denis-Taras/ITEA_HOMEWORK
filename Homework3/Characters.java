package com.company.denis.Homework3;

import com.sun.tools.javac.Main;

import java.util.*;

public class Characters {


    public static String makeWithEvenCharacters(String stng)
    {
        int len = stng.length();
        String fin_str = "";
        for (int i = 0; i < len; i = i + 2)
        {
            fin_str += stng.charAt(i);
        }
        return fin_str;
    }
    public static void main (String[] args)
    {

        String str1 =  "test string";
        System.out.println("The given string is: "+str1);
        System.out.println("The new string is: "+makeWithEvenCharacters(str1));
    }
}
