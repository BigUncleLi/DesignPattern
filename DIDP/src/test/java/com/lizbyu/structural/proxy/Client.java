package com.lizbyu.structural.proxy;

import org.junit.Test;

public class Client {

    @Test
    public void test() {
        Proxy proxy = new Proxy();
        proxy.request();
    }

}