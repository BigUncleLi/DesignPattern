package com.lizbyu.creational.factory.simple.register.instance;

public class ConcreteProductA implements Product {

    static {
        Factory.instance().registerProduct("ConcreteProductA", new ConcreteProductA());
    }

    @Override
    public Product createProduct() {
        return new ConcreteProductA();
    }

    @Override
    public void operate() {
    }
}
