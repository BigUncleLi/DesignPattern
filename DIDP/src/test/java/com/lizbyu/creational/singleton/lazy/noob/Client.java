package com.lizbyu.creational.singleton.lazy.noob;

import com.lizbyu.creational.singleton.lazy.noob.Singleton;
import org.junit.Test;

import static org.junit.Assert.*;

public class Client {

    @Test
    public void testMain() {
        Singleton instance = Singleton.instance();
        for (int i = 0; i < 10; i++) {
            Singleton instanceTemp = Singleton.instance();
            assertSame(instance, instanceTemp);
        }
    }
}