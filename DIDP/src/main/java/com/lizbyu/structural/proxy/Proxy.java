package com.lizbyu.structural.proxy;

import com.lizbyu.utils.log.LogUtils;

public class Proxy implements Subject {
    private static final String TAG = "Proxy";
    private final Subject mRealSubject;

    public Proxy() {
        this.mRealSubject = new RealSubject();
    }

    @Override
    public void request() {
        preRequest();
        mRealSubject.request();
        postRequest();
    }

    private void preRequest() {
        LogUtils.d(TAG, "pre request ...");
    }

    private void postRequest() {
        LogUtils.d(TAG, "post request ...");
    }
}
