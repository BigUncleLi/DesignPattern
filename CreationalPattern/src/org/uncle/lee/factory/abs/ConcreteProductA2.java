package org.uncle.lee.factory.abs;

import org.uncle.lee.utils.LogUtils;

public class ConcreteProductA2 implements AbstractProductA {
	private static final String TAG = ConcreteProductA2.class.getSimpleName();
	
	@Override
	public void operate() {
		LogUtils.d(TAG, "operate");
	}
}
