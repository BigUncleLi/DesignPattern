package org.uncle.lee.factory.abs;

import org.uncle.lee.utils.LogUtils;

public class ConcreteProductB1 implements AbstractProductB {
	private static final String TAG = ConcreteProductB1.class.getSimpleName();

	@Override
	public void operate() {
		LogUtils.d(TAG, "operate");
	}
}
