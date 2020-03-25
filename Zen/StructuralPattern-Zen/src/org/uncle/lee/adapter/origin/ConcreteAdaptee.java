package org.uncle.lee.adapter.origin;

import org.uncle.lee.utils.LogUtils;

public class ConcreteAdaptee implements Adaptee{
	private static final String TAG = ConcreteAdaptee.class.getSimpleName();

	@Override
	public void specificRequest() {
		LogUtils.d(TAG, "specificRequest");
	}

}
