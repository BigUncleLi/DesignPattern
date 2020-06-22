package com.lizbyu.creational.factory.noob;

import org.junit.Test;

import static org.junit.Assert.*;

public class Client {

    @Test
    public void testMain() {
        Product productOne = new Factory().createProduct(ProductType.ONE);
        assertTrue(productOne instanceof ConcreteProductOne);
        Product productTwo = new Factory().createProduct(ProductType.TWO);
        assertTrue(productTwo instanceof  ConcreteProductTwo);
    }

}