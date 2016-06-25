package org.uncle.lee.strategy;

import org.uncle.lee.utils.LogUtils;

public class ConcreteStrategyB implements Strategy {
	private static final String TAG = ConcreteStrategyB.class.getSimpleName();
	
	@Override
	public void algorithmInterface() {
		LogUtils.d(TAG, "algorithmInterface");
	}
}
