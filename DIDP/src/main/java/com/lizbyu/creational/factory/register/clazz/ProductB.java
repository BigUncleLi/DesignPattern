package com.lizbyu.creational.factory.register.clazz;

public class ProductB implements Product {

    static {
        Factory.instance().registerProduct("ProductB", ProductB.class);
    }

    @Override
    public void operate() {
    }
}
