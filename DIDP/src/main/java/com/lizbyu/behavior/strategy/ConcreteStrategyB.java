package com.lizbyu.behavior.strategy;

import com.lizbyu.utils.log.LogUtils;

public class ConcreteStrategyB implements Strategy {
    private static final String TAG = "ConcreteStrategyB";

    @Override
    public void strategyMethod() {
        LogUtils.d(TAG, "handle strategy method ...");
    }
}
