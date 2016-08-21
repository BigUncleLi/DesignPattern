package org.uncle.lee.strategy.origin;

import org.uncle.lee.utils.LogUtils;

public class ConcreteStrategyB implements Strategy {
	private static final String TAG = ConcreteStrategyB.class.getSimpleName();

	@Override
	public void arithmeticInterface() {
		LogUtils.d(TAG, "arithmeticInterface");
	}
}
