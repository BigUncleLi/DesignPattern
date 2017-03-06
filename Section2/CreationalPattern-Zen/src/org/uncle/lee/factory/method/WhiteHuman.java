package org.uncle.lee.factory.method;

import org.uncle.lee.utils.LogUtils;

public class WhiteHuman implements Human {
	private static final String TAG = WhiteHuman.class.getSimpleName();

	@Override
	public void getColor() {
		LogUtils.d(TAG, "white");
	}

	@Override
	public void talk() {
		LogUtils.d(TAG, "I'm white");
	}
}
