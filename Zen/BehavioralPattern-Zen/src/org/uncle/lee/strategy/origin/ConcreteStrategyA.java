package org.uncle.lee.strategy.origin;

import org.uncle.lee.utils.LogUtils;

public class ConcreteStrategyA implements Strategy {
	private static final String TAG = ConcreteStrategyA.class.getSimpleName();

	@Override
	public void arithmeticInterface() {
		LogUtils.d(TAG, "arithmeticInterface");
	}
}
