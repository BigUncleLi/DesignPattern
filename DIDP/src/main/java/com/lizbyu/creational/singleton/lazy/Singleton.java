package com.lizbyu.creational.singleton.lazy;

import java.io.Serializable;

public class Singleton implements Serializable {
    private static volatile Singleton instance;

    private Singleton() {}

    public static Singleton instance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }

    protected Object readResolve() {
        return instance();
    }
}
