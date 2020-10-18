package com.lizbyu.creational.factory.simple.noob;

import org.junit.Test;

import static org.junit.Assert.*;

public class TestSimpleNoobFactory {

    @Test
    public void test() {
        Product productOne = new Factory().createProduct(Product.Type.ONE);
        assertTrue(productOne instanceof ConcreteProductOne);
        Product productTwo = new Factory().createProduct(Product.Type.TWO);
        assertTrue(productTwo instanceof  ConcreteProductTwo);
    }

}