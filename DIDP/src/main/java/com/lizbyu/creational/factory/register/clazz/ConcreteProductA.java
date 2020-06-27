package com.lizbyu.creational.factory.register.clazz;

public class ConcreteProductA implements Product {

    static {
        Factory.instance().registerProduct("ConcreteProductA", ConcreteProductA.class);
    }

    @Override
    public void operate() {
    }
}
