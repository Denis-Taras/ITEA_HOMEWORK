package com.company.denis.Homework12;

import java.util.TreeSet;

public class RunnerTreeSet {
    public static void main(String[] args) {
        TreeSet<HeavyBox> heavyBoxes = new TreeSet<>();

        heavyBoxes.add(new HeavyBox("First", 2500));
        heavyBoxes.add(new HeavyBox("Second", 1250));
        heavyBoxes.add(new HeavyBox("Third", 2450));
        heavyBoxes.add(new HeavyBox("Fourth", 2530));

        for (HeavyBox box: heavyBoxes) {
            System.out.println(box);
        }
    }
}
