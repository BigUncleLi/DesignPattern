package com.lizbyu.creational.factory.simple.register.instance;

import com.lizbyu.utils.log.LogUtils;

public class ConcreteProductB implements Product {
    private static final String TAG = "ConcreteProductB";

    static {
        Factory.instance().registerProduct(TAG, new ConcreteProductB());
    }

    @Override
    public Product createProduct() {
        return new ConcreteProductB();
    }

    @Override
    public void operate() {
        LogUtils.d(TAG, "operate");
    }
}
