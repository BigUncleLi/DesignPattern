package org.uncle.lee.state.origin.zen;

public class Context {
	public static final State STATE_1 = new State1();
	public static final State STATE_2 = new State2();

	private State state;

	public void setState(State state) {
		this.state = state;
	}

	public void handle1() {
		this.state.handle1(this);
	}

	public void handle2() {
		this.state.handle2(this);
	}

}
