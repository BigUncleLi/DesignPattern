package com.lizbyu.creational.factory.simple.register.clazz;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class Client {

    @Before
    public void setUp() {
        try {
            Class.forName("com.lizbyu.creational.factory.simple.register.clazz.ConcreteProductA");
            Class.forName("com.lizbyu.creational.factory.simple.register.clazz.ConcreteProductB");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testMain() {
        Product productA = Factory.instance().createProduct("ConcreteProductA");
        assertTrue(productA instanceof ConcreteProductA);
        Product productB = Factory.instance().createProduct("ConcreteProductB");
        assertTrue(productB instanceof ConcreteProductB);
        Product productB2 = Factory.instance().createProduct("ConcreteProductB");
        assertNotSame(productB, productB2);
    }
}