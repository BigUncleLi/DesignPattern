package org.uncle.lee.bridge.origin;

import org.uncle.lee.utils.LogUtils;

public class ConcreteImpelemtorA implements Implementor {
	private static final String TAG = ConcreteImpelemtorA.class.getSimpleName();

	@Override
	public void operate() {
		LogUtils.d(TAG, "operate ...");
	}

}
