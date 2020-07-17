package com.lizbyu.structural.adapter;

import com.lizbyu.utils.log.LogUtils;

public class ObjectAdapter implements Target {
    private static final String TAG = "ObjectAdapter";
    private final Adaptee mAdaptee;

    public ObjectAdapter(Adaptee adaptee) {
        this.mAdaptee = adaptee;
    }

    @Override
    public void request() {
        LogUtils.d(TAG, "request ...");
        this.mAdaptee.specificRequest();
    }
}
