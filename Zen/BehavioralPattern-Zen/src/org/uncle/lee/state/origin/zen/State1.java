package org.uncle.lee.state.origin.zen;

import org.uncle.lee.utils.LogUtils;

public class State1 implements State {
	private static final String TAG = State1.class.getSimpleName();

	@Override
	public void handle1(Context mContext) {
		LogUtils.d(TAG, "handle 1 ...");
	}

	@Override
	public void handle2(Context mContext) {
		mContext.setState(Context.STATE_2);
		mContext.handle2();
	}

}
