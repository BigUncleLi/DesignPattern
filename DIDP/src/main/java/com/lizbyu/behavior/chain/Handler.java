package com.lizbyu.behavior.chain;


import com.lizbyu.utils.log.LogUtils;

public abstract class Handler {
    private static final String TAG = "Handler";
    private Handler mHandler;

    public Handler getNext() {
        return mHandler;
    }

    public void setNext(Handler mHandler) {
        this.mHandler = mHandler;
    }

    public abstract void handleRequest(String request);

    protected void throwNext(String request) {
        if (this.getNext() != null) {
            this.getNext().handleRequest(request);
        } else {
            LogUtils.e(TAG, "null next handler !");
        }
    }
}
