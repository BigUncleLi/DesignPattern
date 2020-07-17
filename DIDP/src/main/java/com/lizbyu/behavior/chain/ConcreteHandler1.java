package com.lizbyu.behavior.chain;

import com.lizbyu.utils.log.LogUtils;

public class ConcreteHandler1 extends Handler {
    private static final String TAG = "ConcreteHandler1";

    @Override
    public void handleRequest(String request) {
        if (request.contains("first")) {
            LogUtils.d(TAG, "handle request ...");
        } else {
            LogUtils.d(TAG, "throw next ...");
            throwNext(request);
        }
    }
}
