package com.lizbyu.creational.factory.abs;

import org.junit.Test;

import static org.junit.Assert.*;

public class Client {

    @Test
    public void testClient() {
        ConcreteFactory1 factory1 = new ConcreteFactory1();
        ProductA productA1 = factory1.createProductA();
        assertTrue(productA1 instanceof ConcreteProductA1);
        ProductB productB1 = factory1.createProductB();
        assertTrue(productB1 instanceof ConcreteProductB1);

        ConcreteFactory2 factory2 = new ConcreteFactory2();
        ProductA productA2 = factory2.createProductA();
        assertTrue(productA2 instanceof ConcreteProductA2);
        ProductB productB2 = factory2.createProductB();
        assertTrue(productB2 instanceof ConcreteProductB2);
    }
}