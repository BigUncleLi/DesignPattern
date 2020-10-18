package com.lizbyu.creational.factory.simple.register.clazz;

import com.lizbyu.utils.log.LogUtils;

public class ConcreteProductB implements Product {
    private static final String TAG = "ConcreteProductB";

    static {
        Factory.instance().registerProduct(TAG, ConcreteProductB.class);
    }

    @Override
    public void operate() {
        LogUtils.d(TAG, "operate");
    }
}
