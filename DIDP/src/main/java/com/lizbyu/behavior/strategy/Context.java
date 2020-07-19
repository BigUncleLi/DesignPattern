package com.lizbyu.behavior.strategy;

public class Context {
    private Strategy mStrategy;

    public Context(Strategy mStrategy) {
        this.mStrategy = mStrategy;
    }

    public Strategy getmStrategy() {
        return mStrategy;
    }

    public void setmStrategy(Strategy mStrategy) {
        this.mStrategy = mStrategy;
    }

    public void strategyMethod() {
        this.mStrategy.strategyMethod();
    }
}
