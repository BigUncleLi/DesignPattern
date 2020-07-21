package com.lizbyu.behavior.state;

import com.lizbyu.utils.log.LogUtils;

public class ConcreteStateB implements State {
    private static final String TAG = "ConcreteStateB";

    @Override
    public void handle(Context context) {
        LogUtils.d(TAG, "handle state B and turn into state A ...");
        context.setState(new ConcreteStateA());
    }
}
