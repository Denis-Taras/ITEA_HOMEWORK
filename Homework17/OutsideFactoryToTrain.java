package com.company.Homework17;

import java.util.ArrayList;

public class OutsideFactoryToTrain implements Runnable {
    Train train;
    Factory factory;

    public OutsideFactoryToTrain(Train train, Factory factory) {
        this.train = train;
        this.factory = factory;
    }


    @Override
    public void run() {
        System.out.println("--------------START INSIDE TO TRAIN-------------------------");
        try {
            Thread.sleep(20);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        ArrayList<Container> containers = factory.getContainer();
        while (!containers.isEmpty()) {
            if (train.getCapacity() != 0) {
                train.inside(factory.outside(containers.get(0)));
                System.out.println("Container go to train:" + train.getName());
                System.out.println(train.toString());
                System.out.println(factory.toString());
            } else {
                break;
            }
        }
        System.out.println("--------------FINISH INSIDE TO TRAIN-------------------------");
    }
}
