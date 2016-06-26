package org.uncle.lee.state;

import org.uncle.lee.utils.LogUtils;

public class ConcreteStateB implements State {
	private static final String TAG = ConcreteStateB.class.getSimpleName();

	@Override
	public void handle(Context context) {
		LogUtils.d(TAG, "last handle");
	}
}
