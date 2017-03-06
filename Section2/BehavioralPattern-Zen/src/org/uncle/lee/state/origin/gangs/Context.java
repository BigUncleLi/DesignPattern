package org.uncle.lee.state.origin.gangs;

public class Context {
	public static final State STATE_A = new ConcreteStateA();
	public static final State STATE_B = new ConcreteStateB();
	private State state;

	public void setState(State state) {
		this.state = state;
	}

	public State getState() {
		return this.state;
	}

	public void request() {
		state.handle(this);
	}
}
