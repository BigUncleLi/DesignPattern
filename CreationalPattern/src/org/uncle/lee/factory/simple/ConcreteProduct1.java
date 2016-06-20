package org.uncle.lee.factory.simple;

import org.uncle.lee.utils.LogUtils;

public class ConcreteProduct1 implements Product {
	private static final String TAG = ConcreteProduct1.class.getSimpleName();
	
	@Override
	public void operate() {
		LogUtils.d(TAG, "concrete product1 operate");
	}
}
