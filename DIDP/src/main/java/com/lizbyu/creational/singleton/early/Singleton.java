package com.lizbyu.creational.singleton.early;

import java.io.Serializable;

public class Singleton implements Serializable {
    private static final Singleton instance = new Singleton();

    private Singleton() {}

    public static Singleton instance() {
        return instance;
    }

    protected Object readResolve() {
        return instance();
    }
}
