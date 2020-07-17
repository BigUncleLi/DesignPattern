package com.lizbyu.behavior.chain;

import org.junit.Test;

public class Client {

    @Test
    public void testClient() {
        Handler concreteHandler1 = new ConcreteHandler1();
        Handler concreteHandler2 = new ConcreteHandler2();
        concreteHandler1.setNext(concreteHandler2);
        concreteHandler1.handleRequest("two");
        concreteHandler1.handleRequest("other");
    }

}