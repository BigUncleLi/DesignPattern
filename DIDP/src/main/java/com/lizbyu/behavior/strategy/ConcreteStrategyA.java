package com.lizbyu.behavior.strategy;

import com.lizbyu.utils.log.LogUtils;

public class ConcreteStrategyA implements Strategy {
    private static final String TAG = "ConcreteStrategyA";

    @Override
    public void strategyMethod() {
        LogUtils.d(TAG, "handle strategy method ...");
    }
}
