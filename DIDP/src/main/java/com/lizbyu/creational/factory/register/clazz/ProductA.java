package com.lizbyu.creational.factory.register.clazz;

public class ProductA implements Product {

    static {
        Factory.instance().registerProduct("ProductA", ProductA.class);
    }

    @Override
    public void operate() {
    }
}
