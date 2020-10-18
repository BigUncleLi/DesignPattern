package com.lizbyu.creational.factory.simple.noob;

import com.lizbyu.utils.log.LogUtils;

public class ConcreteProductTwo implements Product {
    private static final String TAG = "ConcreteProductTwo";

    @Override
    public void operate() {
        LogUtils.d(TAG, "operate...");
    }
}
