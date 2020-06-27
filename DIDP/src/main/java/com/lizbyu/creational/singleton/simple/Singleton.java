package com.lizbyu.creational.singleton.simple;

import java.io.Serializable;

public class Singleton implements Serializable {
    private static Singleton instance;

    private Singleton() {}

    public static synchronized Singleton instance() {
        if (instance == null) instance = new Singleton();
        return instance;
    }

    @SuppressWarnings("unused")
    public void doSomething() {}

    protected Object readResolve() {
        return instance();
    }
}
