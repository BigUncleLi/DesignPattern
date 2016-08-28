package org.uncle.lee.state.demo.enums;

import org.uncle.lee.state.demo.Lift;
import org.uncle.lee.utils.LogUtils;

public class LiftImpl implements Lift {
	private static final String TAG = LiftImpl.class.getSimpleName();

	private enum State {
		openDoor, closeDoor, running, stopping;
	}

	private State state;

	public LiftImpl() {
		this.state = State.closeDoor;
	}

	@Override
	public void openDoor() {
		if (state.equals(State.openDoor) || state.equals(State.running)) {
			LogUtils.d(TAG, "state is error, not invoke open door");
		} else if (state.equals(State.closeDoor)
				|| state.equals(State.stopping)) {
			doOpenDoor();
		}
	}

	private void doOpenDoor() {
		LogUtils.d(TAG, "open door");
		this.state = State.openDoor;
	}

	@Override
	public void closeDoor() {
		if (state.equals(State.openDoor)) {
			doCloseDoor();
		} else {
			LogUtils.d(TAG, "state is error, not invoke close door");
		}
	}

	private void doCloseDoor() {
		LogUtils.d(TAG, "invoke close door");
		this.state = State.closeDoor;
	}

	@Override
	public void run() {
		if (state.equals(State.openDoor) || state.equals(State.running)) {
			LogUtils.d(TAG, "state is error, not invoke run");
		} else if (state.equals(State.closeDoor)
				|| state.equals(State.stopping)) {
			doRun();
		}
	}

	private void doRun() {
		LogUtils.d(TAG, "invoke run");
		this.state = State.running;
	}

	@Override
	public void stop() {
		if (state.equals(State.openDoor) || state.equals(State.stopping)) {
			LogUtils.d(TAG, "state is error, not invoke stop");
		} else if (state.equals(State.closeDoor) || state.equals(State.running)) {
			doStop();
		}
	}

	private void doStop() {
		LogUtils.d(TAG, "invoke stop");
		this.state = State.stopping;
	}

}
