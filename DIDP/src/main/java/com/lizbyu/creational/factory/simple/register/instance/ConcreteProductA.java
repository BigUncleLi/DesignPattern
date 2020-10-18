package com.lizbyu.creational.factory.simple.register.instance;

import com.lizbyu.utils.log.LogUtils;

public class ConcreteProductA implements Product {
    private static final String TAG = "ConcreteProductA";

    static {
        Factory.instance().registerProduct(TAG, new ConcreteProductA());
    }

    @Override
    public Product createProduct() {
        return new ConcreteProductA();
    }

    @Override
    public void operate() {
        LogUtils.d(TAG, "operate");
    }
}
