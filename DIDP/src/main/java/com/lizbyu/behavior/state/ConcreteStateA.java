package com.lizbyu.behavior.state;

import com.lizbyu.utils.log.LogUtils;

public class ConcreteStateA implements State {
    private static final String TAG = "ConcreteStateA";

    @Override
    public void handle(Context context) {
        LogUtils.d(TAG, "handle state A and turn into state B ...");
        context.setState(new ConcreteStateB());
    }
}
