package com.company.Homework17;

public class Container {
    private Products product;

    public Container(Products productName) {
        this.product = productName;
    }

    public Products getProductName() {
        return product;
    }

    public void setProductName(Products productName) {
        this.product = productName;
    }

}