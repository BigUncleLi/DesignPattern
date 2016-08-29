package org.uncle.lee.state.origin.gangs;

import org.uncle.lee.utils.LogUtils;

public class ConcreteStateA implements State {
	private static final String TAG = ConcreteStateA.class.getSimpleName();

	@Override
	public void handle(Context context) {
		if (context.getState() instanceof ConcreteStateA) {
			LogUtils.d(TAG, "handle ConcreteStateA");
		} else {
			context.setState(Context.STATE_B);
			context.request();
		}
	}

}
