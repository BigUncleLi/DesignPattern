package com.lizbyu.creational.factory.register.clazz;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class Client {

    @Before
    public void setUp() {
        try {
            Class.forName("com.lizbyu.creational.factory.register.clazz.ProductA");
            Class.forName("com.lizbyu.creational.factory.register.clazz.ProductB");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testMain() {
        Product productA = Factory.instance().createProduct("ProductA");
        assertTrue(productA instanceof  ProductA);
        Product productB = Factory.instance().createProduct("ProductB");
        assertTrue(productB instanceof  ProductB);
        Product productB2 = Factory.instance().createProduct("ProductB");
        assertNotSame(productB, productB2);
    }
}