package com.lizbyu.structural.adapter;


import org.junit.Test;

public class Client {

    @Test
    public void testClient() {
        Adaptee adaptee = new Adaptee();
        Target target = new ObjectAdapter(adaptee);
        target.request();
    }

}