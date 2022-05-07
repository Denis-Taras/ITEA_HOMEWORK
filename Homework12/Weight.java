package com.company.denis.Homework12;

import java.util.LinkedList;

public class Weight {

    private static LinkedList<HeavyBox> checkWeight(LinkedList<HeavyBox> heavyBoxes) {
        LinkedList<HeavyBox> highWeight = new LinkedList<>();
        for (HeavyBox box: heavyBoxes) {
            if (box.getWeight() > 300) {
                highWeight.add(box);
            }
        }
        return highWeight;
    }

    public static void main(String[] args) {
        LinkedList<HeavyBox> list = new LinkedList<>();
        list.add(new HeavyBox("FirstH", 340));
        list.add(new HeavyBox("Second", 250));
        list.add(new HeavyBox("ThirdH", 450));
        list.add(new HeavyBox("Fourth", 230));

        System.out.println(checkWeight(list));
    }


}