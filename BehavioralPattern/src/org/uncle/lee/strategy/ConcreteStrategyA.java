package org.uncle.lee.strategy;

import org.uncle.lee.utils.LogUtils;

public class ConcreteStrategyA implements Strategy {
	private static final String TAG = ConcreteStrategyA.class.getSimpleName();
	
	@Override
	public void algorithmInterface() {
		LogUtils.d(TAG, "algorithmInterface");
	}
}
