package com.lizbyu.creational.factory.register.instance;

public class ProductB implements Product {

    static {
        Factory.instance().registerProduct("ProductB", new ProductB());
    }

    @Override
    public Product createProduct() {
        return new ProductB();
    }

    @Override
    public void operate() {
    }
}
