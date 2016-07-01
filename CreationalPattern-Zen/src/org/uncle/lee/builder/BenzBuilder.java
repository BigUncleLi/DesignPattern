package org.uncle.lee.builder;

import org.uncle.lee.utils.LogUtils;

public class BenzBuilder implements CarBuilder {
	private static final String TAG = BenzBuilder.class.getSimpleName();

	@Override
	public void start() {
		LogUtils.d(TAG, "benz start ...");
	}

	@Override
	public void stop() {
		LogUtils.d(TAG, "benz stop ...");
	}

	@Override
	public void alarm() {
		LogUtils.d(TAG, "benz alarm ...");
	}

	@Override
	public void engineBoom() {
		LogUtils.d(TAG, "benz engineBoom ...");
	}

}
