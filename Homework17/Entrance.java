package com.company.Homework17;

public class Entrance {
    private boolean isFree;
    private Train train;

    public Entrance() {
        isFree = true;
    }

    public Train getTrain() {
        return train;
    }

    public void setEntrance(Train train) {
        if (isFree) {
            this.train = train;
            isFree = false;
            System.out.println("Train in entrance.");
        } else {
            System.out.println("Entrance isn't free.");
        }
    }

}