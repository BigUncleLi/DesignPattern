package org.uncle.lee.proxy.dynamic;

import org.uncle.lee.utils.LogUtils;

public class RealSubject implements Subject{
	private static final String TAG = RealSubject.class.getSimpleName();

	@Override
	public void doSomeThing() {
		LogUtils.d(TAG, "do something ...");
	}
}
