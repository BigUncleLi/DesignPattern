package org.uncle.lee.builder;

import org.uncle.lee.utils.LogUtils;

public class BmwBuilder implements CarBuilder {
	private static final String TAG = BmwBuilder.class.getSimpleName();

	@Override
	public void start() {
		LogUtils.d(TAG, "bmw start ...");
	}

	@Override
	public void stop() {
		LogUtils.d(TAG, "bmw stop ...");
	}

	@Override
	public void alarm() {
		LogUtils.d(TAG, "bmw alarm ...");
	}

	@Override
	public void engineBoom() {
		LogUtils.d(TAG, "bmw engineBoom ...");
	}

}
