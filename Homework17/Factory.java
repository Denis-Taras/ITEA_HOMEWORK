package com.company.Homework17;

import java.util.ArrayList;

public class Factory {
    private String name;
    private Entrance[] entrance;
    private int capacity;
    private volatile ArrayList<Container> container = new ArrayList<>();

    public Factory(String name, Entrance[] entrances, int capacity) {
        this.name = name;
        this.entrance = entrances;
        this.capacity = capacity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Entrance[] getEntrances() {
        return entrance;
    }

    public void setEntrances(Entrance[] entrances) {
        this.entrance = entrances;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public ArrayList<Container> getContainer() {
        return container;
    }

    public void setContainer(ArrayList<Container> container) {
        this.container = container;
    }

    public void inside(Container container) {
        if (capacity != 0) {
            this.container.add(container);
            capacity--;
        } else {
            System.out.println("Not enough capacity.");
        }
    }

    public Container outside(Container container) {
        this.container.remove(container);
        capacity++;
        return container;
    }

    @Override
    public String toString() {
        return "Factory{" +
                "name='" + name + '\'' +
                ", capacity=" + capacity +
                ", container=" + container.size() +
                '}';
    }
}