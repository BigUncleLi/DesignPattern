package com.lizbyu.creational.factory.normal;

import org.junit.Test;

import static org.junit.Assert.*;

public class Client {

    @Test
    public void testMain() {
        Factory concreteFactoryA = new ConcreteFactoryA();
        Product productA = concreteFactoryA.createProduct();
        assertTrue(productA instanceof ConcreteProductA);

        Factory concreteFactoryB = new ConcreteFactoryB();
        Product productB = concreteFactoryB.createProduct();
        assertTrue(productB instanceof ConcreteProductB);

        Factory concreteFactoryB2 = new ConcreteFactoryB();
        Product productB2 = concreteFactoryB2.createProduct();
        assertNotSame(productB, productB2);
    }
}