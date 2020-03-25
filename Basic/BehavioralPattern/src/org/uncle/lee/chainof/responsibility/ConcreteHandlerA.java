package org.uncle.lee.chainof.responsibility;

import org.uncle.lee.utils.LogUtils;

public class ConcreteHandlerA extends Handler{
	private static final String TAG = ConcreteHandlerA.class.getSimpleName();
	
	@Override
	public void handleRequest() {
		LogUtils.d(TAG, "handleRequest");
		super.handleNextHandler();
	}
}
