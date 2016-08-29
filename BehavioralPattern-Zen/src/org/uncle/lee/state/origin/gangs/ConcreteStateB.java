package org.uncle.lee.state.origin.gangs;

import org.uncle.lee.utils.LogUtils;

public class ConcreteStateB implements State {
	private static final String TAG = ConcreteStateB.class.getSimpleName();

	@Override
	public void handle(Context context) {
		if (context.getState() instanceof ConcreteStateB) {
			LogUtils.d(TAG, "handle ConcreteStateB");
		} else {
			context.setState(Context.STATE_A);
			context.request();
		}
	}

}
