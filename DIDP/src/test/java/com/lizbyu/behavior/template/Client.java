package com.lizbyu.behavior.template;

import com.lizbyu.utils.log.LogUtils;
import org.junit.Test;

public class Client {
    private static final String TAG = "Client";

    @Test
    public void testClient() {
        new AbstractClass() {
            @Override
            public void abstractMethod0() {
                LogUtils.d(TAG, "abstractMethod0");
            }

            @Override
            public void abstractMethod1() {
                LogUtils.d(TAG, "abstractMethod1");
            }
        }.templateMethod();
    }

}