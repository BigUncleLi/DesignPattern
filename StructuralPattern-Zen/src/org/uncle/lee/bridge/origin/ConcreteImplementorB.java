package org.uncle.lee.bridge.origin;

import org.uncle.lee.utils.LogUtils;

public class ConcreteImplementorB implements Implementor {
	private static final String TAG = ConcreteImplementorB.class
			.getSimpleName();

	@Override
	public void operate() {
		LogUtils.d(TAG, "operate ...");
	}

}
