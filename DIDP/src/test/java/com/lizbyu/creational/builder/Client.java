package com.lizbyu.creational.builder;

import org.junit.Test;

import static org.junit.Assert.*;

public class Client {

    @Test
    public void testClient() {
        Director director = new Director();

        Builder builder1 = new ConcreteBuilder1();
        director.constructDefault(builder1);
        Product product1 = builder1.getResult();
        assertEquals("1-default", product1.getName());
        assertEquals(99, product1.getPrice());
        assertSame(false, product1.isExpired());

        Builder builder2 = new ConcreteBuilder2();
        director.constructDefault(builder2);
        Product product2 = builder2.getResult();
        assertEquals("2-default", product2.getName());
        assertEquals(199, product2.getPrice());
        assertSame(false, product2.isExpired());
    }

}