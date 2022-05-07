package com.company.denis.Homework12;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class RunnerHashSet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter numbers: ");
        String numbers = scanner.nextLine();

        Set<String> set = new HashSet<>();
        set.addAll(Arrays.asList(numbers.split(", " )));
        System.out.println(set);

    }
}