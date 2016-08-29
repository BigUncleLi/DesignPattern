package org.uncle.lee.state.demo.state;

public class Context {
	public static final LiftState STATE_OPEN = new OpenState();
	public static final LiftState STATE_CLOSE = new CloseState();
	public static final LiftState STATE_RUNNING = new RunningState();
	public static final LiftState STATE_STOPPING = new StoppingState();

	private LiftState state;
	
	public Context(LiftState state){
		this.setState(state);
	}

	public void setState(LiftState state){
		this.state = state;
	}

	public void openDoor() {
		this.state.openDoor(this);
	}

	public void closeDoor() {
		this.state.closeDoor(this);
	}

	public void run() {
		this.state.run(this);
	}

	public void stop() {
		this.state.stop(this);
	}
}
