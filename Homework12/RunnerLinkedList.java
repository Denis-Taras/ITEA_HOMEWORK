package com.company.denis.Homework12;

import java.util.LinkedList;

public class RunnerLinkedList {
    public static void main(String[] args) {
        LinkedList<HeavyBox> list = new LinkedList<>();
        list.add(new HeavyBox("First", 200));
        list.add(new HeavyBox("Second", 540));
        list.add(new HeavyBox("Third",720));
        list.add(new HeavyBox("Fourth",950));
        list.add(new HeavyBox("Fifth",100));

        for (HeavyBox box: list) {
            System.out.println(box);
        }

        list.set(0, new HeavyBox("First", 1));
        list.removeLast();

        System.out.println("The first way is foreach:");
        for (HeavyBox box: list) {
            System.out.println(box);
        }

        System.out.println("The second way is sout(list):");
        System.out.println(list);

        System.out.println("The second way is for:");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }



    }
}