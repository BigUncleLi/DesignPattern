package com.lizbyu.structural.proxy;

import com.lizbyu.utils.log.LogUtils;

public class RealSubject implements Subject {
    private static final String TAG = "RealSubject";

    @Override
    public void request() {
        LogUtils.d(TAG, "request ...");
    }
}
