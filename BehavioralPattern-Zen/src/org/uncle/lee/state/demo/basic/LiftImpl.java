package org.uncle.lee.state.demo.basic;

import org.uncle.lee.utils.LogUtils;

/**
 * v3.0 implement
 * 
 * @author Lee It's a low implement, but it's worth to think.
 */
public class LiftImpl implements Lift {
	private static final String TAG = LiftImpl.class.getSimpleName();

	private boolean isOpenDoor = false;
	private boolean isRunning = false;

	public LiftImpl() {

	}

	@Override
	public void openDoor() {
		if (isOpenDoor || isRunning) {
			LogUtils.d(TAG, "state is error, not invoke open door method ...");
		} else if (!isOpenDoor || !isRunning) {
			doOpenDoor();
		}
	}

	private void doOpenDoor() {
		LogUtils.d(TAG, "invoke open door ...");
		isOpenDoor = true;
	}

	@Override
	public void closeDoor() {
		if (isRunning) {
			doCloseDoor();
		} else {
			LogUtils.d(TAG, "state is error, not invoke close door method ...");
		}
	}

	private void doCloseDoor() {
		LogUtils.d(TAG, "invoke close door ...");
		isOpenDoor = false;
	}

	@Override
	public void run() {
		if (isOpenDoor || isRunning) {
			LogUtils.d(TAG, "state is error, not invoke run method ...");
		} else if (!isOpenDoor || !isRunning) {
			doRun();
		}
	}

	private void doRun() {
		LogUtils.d(TAG, "invoke run ...");
		isRunning = true;
	}

	@Override
	public void stop() {
		if (isOpenDoor || !isRunning) {
			LogUtils.d(TAG, "state is error, not invoke stop method ...");
		} else if (!isOpenDoor || isRunning) {
			doStop();
		}
	}

	private void doStop() {
		LogUtils.d(TAG, "invoke stop ...");
		isRunning = false;
	}

}
