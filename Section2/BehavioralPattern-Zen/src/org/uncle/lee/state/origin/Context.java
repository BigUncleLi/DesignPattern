package org.uncle.lee.state.origin;

public class Context {
	private State state;

	public void setState(State state) {
		this.state = state;
	}
	
	public State getState(){
		return this.state;
	}

	public void request() {
		this.state.handle(this);
	}
}
