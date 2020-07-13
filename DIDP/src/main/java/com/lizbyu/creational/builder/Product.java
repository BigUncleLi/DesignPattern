package com.lizbyu.creational.builder;

public class Product {
    private String name;
    private int price;
    private boolean isExpired;

    public Product() {}

    public Product(String name, int price, boolean isExpired) {
        this.name = name;
        this.price = price;
        this.isExpired = isExpired;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public boolean isExpired() {
        return isExpired;
    }

    public void setExpired(boolean expired) {
        isExpired = expired;
    }
}
