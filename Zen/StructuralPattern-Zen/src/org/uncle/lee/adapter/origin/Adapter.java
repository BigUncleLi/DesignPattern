package org.uncle.lee.adapter.origin;

import org.uncle.lee.utils.LogUtils;

public class Adapter extends ConcreteAdaptee implements Target {
	private static final String TAG = Adapter.class.getSimpleName();

	@Override
	public void request() {
		transforme();
		doRequest();
	}

	private void transforme() {
		super.specificRequest();
		LogUtils.d(TAG, "to do some transformer ...");
	}

	private void doRequest() {
		LogUtils.d(TAG, "There is target format ...");
	}

}
