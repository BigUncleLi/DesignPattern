package com.lizbyu.creational.prototype.deep;

import org.junit.Test;

import static org.junit.Assert.*;

public class Client {
    @Test
    public void testClient() {
        int intValue = 0;
        String strValue = "test-str";
        ComplexObject obj = new ComplexObject();

        Prototype prototype = new Prototype();
        prototype.setIntValue(intValue);
        prototype.setStrValue(strValue);
        prototype.setObject(obj);

        try {
            Prototype clonePrototype = (Prototype) prototype.clone();
            assertEquals(intValue, clonePrototype.getIntValue());
            assertEquals(strValue, clonePrototype.getStrValue());
            assertNotEquals(obj, clonePrototype.getObject());

            assertSame(intValue, clonePrototype.getIntValue());
            assertSame(strValue, clonePrototype.getStrValue());
            assertNotSame(obj, clonePrototype.getObject());
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}