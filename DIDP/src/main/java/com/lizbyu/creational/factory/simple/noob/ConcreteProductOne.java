package com.lizbyu.creational.factory.simple.noob;

import com.lizbyu.utils.log.LogUtils;

public class ConcreteProductOne implements Product {
    private static final String TAG = "ConcreteProductOne";

    @Override
    public void operate() {
        LogUtils.d(TAG, "operate");
    }
}
