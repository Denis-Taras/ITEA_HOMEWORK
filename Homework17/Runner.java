package com.company.Homework17;

import java.util.ArrayList;
import java.util.concurrent.*;

public class Runner {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        Entrance[] entrances = new Entrance[3];
        entrances[0] = new Entrance();
        entrances[1] = new Entrance();
        entrances[2] = new Entrance();

        Factory factory = new Factory("New Factory", entrances, 50);

        Train first = new Train("First train", 30);
        Train second = new Train("Second train", 40);
        Train third = new Train("Third train", 30);
        Train fourth = new Train("Fourth train", 18);

        ArrayList<Container> containers = new ArrayList<>();
        for (int i = 0; i < 50; i++) {
            containers.add(new Container(Products.SAND));
        }
        for (int i = 0; i < 50; i++) {
            containers.add(new Container(Products.END_PRODUCT));
        }

        while (first.getCapacity() != 0) {
            first.inside(containers.get(0));
            containers.remove(0);
        }

        while (second.getCapacity() != 0) {
            second.inside(containers.get(0));
            containers.remove(0);
        }

        entrances[0].setEntrance(first);
        entrances[1].setEntrance(second);
        entrances[2].setEntrance(third);
        entrances[2].setEntrance(fourth);

        Thread insideFromTrainFirst = new Thread(new InsideFactory(first, factory));
        Thread outsideToTrainFirst = new Thread(new OutsideFactoryToTrain(first, factory));
        Thread insideFromTrainSecond = new Thread(new InsideFactory(second, factory));
        Thread outsideToTrainThird = new Thread(new OutsideFactoryToTrain(third, factory));

        ExecutorService service = Executors.newFixedThreadPool(1);

        service.execute(insideFromTrainFirst);
        service.execute(outsideToTrainFirst);
        service.shutdown();
        service.awaitTermination(Long.MAX_VALUE, TimeUnit.NANOSECONDS);
        outsideToTrainThird.start();
        insideFromTrainSecond.start();


        try {
            insideFromTrainSecond.join();
            outsideToTrainThird.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        System.out.println("---------------------------------------------------------------------------");
        System.out.println(first.toString());
        System.out.println(second.toString());
        System.out.println(third.toString());
        System.out.println(factory.toString());
    }
}
