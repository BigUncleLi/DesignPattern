package org.uncle.lee.state.origin.zen;

import org.uncle.lee.utils.LogUtils;

public class State2 implements State {
	private static final String TAG = State2.class.getSimpleName();

	@Override
	public void handle1(Context mContext) {
		mContext.setState(Context.STATE_1);
		mContext.handle1();
	}

	@Override
	public void handle2(Context mContext) {
		LogUtils.d(TAG, "handle 2...");
	}

}
