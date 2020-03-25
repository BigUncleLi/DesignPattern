package org.uncle.lee.factory.simple;

import org.uncle.lee.utils.LogUtils;

public class ConcreteProduct2 implements Product {
	private static final String TAG = ConcreteProduct2.class.getSimpleName();
	
	@Override
	public void operate() {
		LogUtils.d(TAG, "concrete product2 operate");
	}
}
