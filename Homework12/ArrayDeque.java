package com.company.denis.Homework12;

import java.util.Deque;
import java.util.LinkedList;

public class ArrayDeque {
    public static void main(String[] args) {

        Deque<HeavyBox> heavyBoxes = new java.util.ArrayDeque<>();
        heavyBoxes.offer(new HeavyBox("First", 340));
        System.out.println(heavyBoxes.element());
        heavyBoxes.poll();
        heavyBoxes.offer(new HeavyBox("Second", 250));
        System.out.println(heavyBoxes.element());
        heavyBoxes.poll();
        heavyBoxes.offer(new HeavyBox("Third", 450));
        System.out.println(heavyBoxes.element());
        heavyBoxes.poll();
        heavyBoxes.offer(new HeavyBox("Fourth", 230));
        System.out.println(heavyBoxes.element());
    }
}