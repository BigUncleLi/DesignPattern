package org.uncle.lee.state.demo.state;

import org.uncle.lee.utils.LogUtils;

public class OpenState extends LiftState {
	private static final String TAG = OpenState.class.getSimpleName();
	
	@Override
	public void openDoor(Context context) {
		LogUtils.d(TAG, "open door");
	}

	@Override
	public void closeDoor(Context context) {
		context.setState(Context.STATE_CLOSE);
		context.closeDoor();
	}

	@Override
	public void run(Context context) {
		// do nothing
	}

	@Override
	public void stop(Context context) {
		// do nothing
	}

}
