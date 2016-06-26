package org.uncle.lee.state;

import org.uncle.lee.utils.LogUtils;

public class ConcreteStateC implements State {
	private static final String TAG = ConcreteStateC.class.getSimpleName();

	@Override
	public void handle(Context context) {
		LogUtils.d(TAG, "last handle");
	}
}
