package com.lizbyu.behavior.strategy;

import org.junit.Test;

public class Client {

    @Test
    public void testClient() {
        Context context = new Context(new ConcreteStrategyA());
        context.strategyMethod();
    }

}