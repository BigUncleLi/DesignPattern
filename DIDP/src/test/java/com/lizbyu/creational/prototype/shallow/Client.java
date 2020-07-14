package com.lizbyu.creational.prototype.shallow;

import com.lizbyu.creational.prototype.shallow.Prototype;
import org.junit.Test;

import static org.junit.Assert.*;

public class Client {

    @Test
    public void testClient() {
        int intValue = 0;
        String strValue = "test-str";
        Object obj = new Object();

        Prototype prototype = new Prototype();
        prototype.setIntValue(intValue);
        prototype.setStrValue(strValue);
        prototype.setInnerClass(obj);

        try {
            Prototype clonePrototype = (Prototype) prototype.clone();
            assertEquals(intValue, clonePrototype.getIntValue());
            assertEquals(strValue, clonePrototype.getStrValue());
            assertEquals(obj, clonePrototype.getInnerClass());

            assertSame(intValue, clonePrototype.getIntValue());
            assertSame(strValue, clonePrototype.getStrValue());
            assertSame(obj, clonePrototype.getInnerClass());
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}