package com.lizbyu.creational.factory.register.instance;

public class ConcreteProductB implements Product {

    static {
        Factory.instance().registerProduct("ConcreteProductB", new ConcreteProductB());
    }

    @Override
    public Product createProduct() {
        return new ConcreteProductB();
    }

    @Override
    public void operate() {
    }
}
