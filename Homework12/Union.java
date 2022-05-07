package com.company.denis.Homework12;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class Union {

    private static Set<Integer> union(Set<Integer> firstSet, Set<Integer> secondSet) {
        Set<Integer> unionSet = new TreeSet<>();
        for (Integer element : firstSet) {
            unionSet.add(element);
        }
        for (Integer element : secondSet) {
            unionSet.add(element);
        }
        return unionSet;
    }

    private static Set<Integer> intersect(Set<Integer> firstSet, Set<Integer> secondSet) {
        Set<Integer> interSet = new TreeSet<>();
        for (Integer element: firstSet) {
            for (Integer elementSec: secondSet) {
                if (element == elementSec) {
                    interSet.add(element);
                }
            }
        }
        return interSet;
    }

    public static void main(String[] args) {
        Set<Integer> firstSet = new TreeSet<>();
        for (int i = 0; i < 10; i++) {
            firstSet.add(i);
        }

        Set<Integer> secondSet = new TreeSet<>();
        for (int i = 3; i < 15; i++) {
            secondSet.add(i);
        }

        System.out.println(union(firstSet, secondSet));
        System.out.println(intersect(firstSet, secondSet));
    }
}
