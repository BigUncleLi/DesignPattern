package org.uncle.lee.observer.origin;

import org.uncle.lee.utils.LogUtils;

public class ConcreteObserverB implements Observer {
	private static final String TAG = ConcreteObserverB.class.getSimpleName();

	@Override
	public void update() {
		LogUtils.d(TAG, "update ...");
	}

}
