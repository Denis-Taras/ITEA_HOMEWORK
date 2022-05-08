package com.company.Homework17;

import java.util.ArrayList;

public class InsideFactory implements Runnable {
    Train train;
    Factory factory;

    public InsideFactory(Train train, Factory factory) {
        this.train = train;
        this.factory = factory;
    }


    @Override
    public void run() {
        System.out.println("--------------START INSIDE TO FACTORY-------------------------");
        ArrayList<Container> containers = train.getContainer();
        while (!containers.isEmpty()) {
            if (factory.getCapacity() != 0) {
                factory.inside(train.outside(containers.get(0)));
                System.out.println("Container go to factory from:" + train.getName());
                System.out.println(train.toString());
                System.out.println(factory.toString());
            } else {
                break;
            }
            try {
                Thread.sleep(0);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("--------------FINISH INSIDE TO FACTORY-------------------------");
    }
}
