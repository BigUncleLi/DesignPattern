package com.lizbyu.creational.factory.simple.register.clazz;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TestClazzRegisterFactory {
    private static final String PRODUCT_ID_A = "ConcreteProductA";
    private static final String PRODUCT_ID_B = "ConcreteProductB";
    private static final String CLASS_NAME_A = "com.lizbyu.creational.factory.simple.register.clazz.ConcreteProductA";
    private static final String CLASS_NAME_B = "com.lizbyu.creational.factory.simple.register.clazz.ConcreteProductB";

    @Before
    public void setUp() {
        try {
            Class.forName(CLASS_NAME_A);
            Class.forName(CLASS_NAME_B);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void test() {
        Product productA = Factory.instance().createProduct(PRODUCT_ID_A);
        assertTrue(productA instanceof ConcreteProductA);
        productA.operate();

        Product productB = Factory.instance().createProduct(PRODUCT_ID_B);
        assertTrue(productB instanceof ConcreteProductB);
        productB.operate();

        Product productB2 = Factory.instance().createProduct(PRODUCT_ID_B);
        assertTrue(productB2 instanceof ConcreteProductB);
        assertNotSame(productB, productB2);
        productB2.operate();
    }
}