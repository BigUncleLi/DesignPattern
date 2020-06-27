package com.lizbyu.creational.factory.register.instance;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class Client {

    @Before
    public void setUp() throws Exception {
        Class.forName("com.lizbyu.creational.factory.register.instance.ConcreteProductA");
        Class.forName("com.lizbyu.creational.factory.register.instance.ConcreteProductB");
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