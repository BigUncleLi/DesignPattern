package com.lizbyu.structural.adapter;

import com.lizbyu.utils.log.LogUtils;

public class Adaptee {
    private static final String TAG = "Adaptee";

    public void specificRequest() {
        LogUtils.d(TAG, "specificRequest ...");
    }
}
