package com.lizbyu.creational.factory.simple.register.clazz;

import com.lizbyu.utils.log.LogUtils;

public class ConcreteProductA implements Product {
    private static final String TAG = "ConcreteProductA";

    static {
        Factory.instance().registerProduct(TAG, ConcreteProductA.class);
    }

    @Override
    public void operate() {
        LogUtils.d(TAG, "operate");
    }
}
