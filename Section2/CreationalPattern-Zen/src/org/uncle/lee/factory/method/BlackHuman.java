package org.uncle.lee.factory.method;

import org.uncle.lee.utils.LogUtils;

public class BlackHuman implements Human {
	private static final String TAG = BlackHuman.class.getSimpleName();

	@Override
	public void getColor() {
		LogUtils.d(TAG, "black");
	}

	@Override
	public void talk() {
		LogUtils.d(TAG, "I'm black");
	}
}
