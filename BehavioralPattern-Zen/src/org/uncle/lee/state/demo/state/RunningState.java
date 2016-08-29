package org.uncle.lee.state.demo.state;

import org.uncle.lee.utils.LogUtils;

public class RunningState extends LiftState {
	private static final String TAG = RunningState.class.getSimpleName();
	
	@Override
	public void openDoor(Context context) {
		// do nothing
		throw new RuntimeException("Do not open door during running !!!");
	}

	@Override
	public void closeDoor(Context context) {
		// do nothing
	}

	@Override
	public void run(Context context) {
		LogUtils.d(TAG, "run");
	}

	@Override
	public void stop(Context context) {
		context.setState(Context.STATE_STOPPING);
		context.stop();
	}

}
