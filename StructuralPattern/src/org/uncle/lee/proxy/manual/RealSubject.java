package org.uncle.lee.proxy.manual;

import org.uncle.lee.utils.LogUtils;

public class RealSubject implements Subject {
	private static final String TAG = RealSubject.class.getSimpleName();
	
	@Override
	public void operate() {
		LogUtils.d(TAG, "operate");
	}
}
