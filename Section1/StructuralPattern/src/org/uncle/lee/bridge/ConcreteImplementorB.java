package org.uncle.lee.bridge;

import org.uncle.lee.utils.LogUtils;

public class ConcreteImplementorB implements Implementor {
	private static final String TAG = ConcreteImplementorB.class.getSimpleName();
	
	@Override
	public void operationImpl() {
		LogUtils.d(TAG, "operationImpl");
	}
}
