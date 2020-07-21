package com.lizbyu.behavior.state;

import org.junit.Test;

public class Client {

    @Test
    public void testClient() {
        Context context = new Context();
        context.handle();
        context.handle();
        context.handle();
        context.handle();
    }

}