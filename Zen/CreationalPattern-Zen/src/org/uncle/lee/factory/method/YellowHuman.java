package org.uncle.lee.factory.method;

import org.uncle.lee.utils.LogUtils;

public class YellowHuman implements Human {
	private static final String TAG = YellowHuman.class.getSimpleName();
	
	@Override
	public void getColor() {
		LogUtils.d(TAG, "yellow");
	}

	@Override
	public void talk() {
		LogUtils.d(TAG, "I'm yellow");
	}
}
