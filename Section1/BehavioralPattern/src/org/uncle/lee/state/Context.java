package org.uncle.lee.state;

public class Context {
	public enum ContextType{
		TYPEA, TYPEB, TYPEC;
	}
	
	public Context(){
		state = new ConcreteStateA();
	}
	
	private State state;
	private ContextType type;
	
	public ContextType getType() {
		return type;
	}

	public void setType(ContextType type) {
		this.type = type;
	}
	
	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}

	public void request(){
		state.handle(this);
	}
}
