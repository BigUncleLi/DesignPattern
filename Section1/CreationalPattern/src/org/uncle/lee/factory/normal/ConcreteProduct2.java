package org.uncle.lee.factory.normal;

import org.uncle.lee.utils.LogUtils;

public class ConcreteProduct2 implements Product {
	private static final String TAG = ConcreteFactory2.class.getSimpleName();
	
	@Override
	public void operate() {
		LogUtils.d(TAG, "operate");
	}
}
