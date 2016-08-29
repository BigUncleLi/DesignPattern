package org.uncle.lee.state.demo.state;

import org.uncle.lee.utils.LogUtils;

public class CloseState extends LiftState {
	private static final String TAG = CloseState.class.getSimpleName();
	
	@Override
	public void openDoor(Context context) {
		context.setState(Context.STATE_OPEN);
		context.openDoor();
	}

	@Override
	public void closeDoor(Context context) {
		LogUtils.d(TAG, "close door");
	}

	@Override
	public void run(Context context) {
		context.setState(Context.STATE_RUNNING);
		context.run();
	}

	@Override
	public void stop(Context context) {
		// do nothing
	}

}
