package com.lizbyu.behavior.chain;

import com.lizbyu.utils.log.LogUtils;

public class ConcreteHandler2 extends Handler {
    private static final String TAG = "ConcreteHandler2";

    @Override
    public void handleRequest(String request) {
        if (request.contains("two")) {
            LogUtils.d(TAG, "handle request ...");
        } else {
            LogUtils.d(TAG, "throw next ...");
            throwNext(request);
        }
    }
}
