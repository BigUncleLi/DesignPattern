package com.lizbyu.creational.factory.register.instance;

public class ProductA implements Product {

    static {
        Factory.instance().registerProduct("ProductA", new ProductA());
    }

    @Override
    public Product createProduct() {
        return new ProductA();
    }

    @Override
    public void operate() {
    }
}
