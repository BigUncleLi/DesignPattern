package org.uncle.lee.bridge;

import org.uncle.lee.utils.LogUtils;

public class ConcreteImplementorA implements Implementor {
	private static final String TAG = ConcreteImplementorA.class.getSimpleName();
	
	@Override
	public void operationImpl() {
		LogUtils.d(TAG, "operationImpl");
	}
}
