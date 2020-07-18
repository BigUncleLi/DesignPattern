package com.lizbyu.behavior.observer;

import com.lizbyu.utils.log.LogUtils;
import org.junit.Test;

public class Client {
    private static final String TAG = "Observer Client";

    @Test
    public void testClient() {
        Observer observer = () -> LogUtils.d(TAG, "response ....");
        Subject subject = new Subject();
        subject.registerSubject(observer);
        subject.registerSubject(observer);
        subject.doAction();
    }

}