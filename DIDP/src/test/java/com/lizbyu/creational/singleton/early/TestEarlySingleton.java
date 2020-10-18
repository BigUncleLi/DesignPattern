package com.lizbyu.creational.singleton.early;

import org.junit.Test;

import static org.junit.Assert.*;

public class TestEarlySingleton {

    @Test
    public void test() {
        Singleton instance = Singleton.instance();
        for (int i = 0; i < 10; i++) {
            Singleton instanceTemp = Singleton.instance();
            assertSame(instance, instanceTemp);
        }
    }
}