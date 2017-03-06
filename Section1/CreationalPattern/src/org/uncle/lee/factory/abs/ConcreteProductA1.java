package org.uncle.lee.factory.abs;

import org.uncle.lee.utils.LogUtils;

public class ConcreteProductA1 implements AbstractProductA {
	private static final String TAG = ConcreteProductA1.class.getSimpleName();
	
	@Override
	public void operate() {
		LogUtils.d(TAG, "operate");
	}
}
