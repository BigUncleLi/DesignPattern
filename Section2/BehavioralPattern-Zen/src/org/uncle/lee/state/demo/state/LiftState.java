package org.uncle.lee.state.demo.state;

public abstract class LiftState {
	public abstract void openDoor(Context context);
	public abstract void closeDoor(Context context);
	public abstract void run(Context context);
	public abstract void stop(Context context);
}
