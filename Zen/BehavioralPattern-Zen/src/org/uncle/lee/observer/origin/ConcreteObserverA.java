package org.uncle.lee.observer.origin;

import org.uncle.lee.utils.LogUtils;

public class ConcreteObserverA implements Observer{
	private static final String TAG = ConcreteObserverA.class.getSimpleName();

	@Override
	public void update() {
		LogUtils.d(TAG, "update ...");
	}

}
