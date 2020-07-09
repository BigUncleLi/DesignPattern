package com.lizbyu.creational.factory.simple.register.clazz;

public class ConcreteProductB implements Product {

    static {
        Factory.instance().registerProduct("ConcreteProductB", ConcreteProductB.class);
    }

    @Override
    public void operate() {
    }
}
