package org.uncle.lee.memento.multi.state;

public class Originator {
	private static final String STATE_A = "origin-stateA";
	private static final String STATE_B = "origin-stateB";
	private static final String STATE_C = "origin-stateC";
	
	private String stateA;
	private String stateB;
	private String stateC;
	
	public Originator(){
		this.setStateA(STATE_A);
		this.setStateB(STATE_B);
		this.setStateC(STATE_C);
	}

	public String getStateA() {
		return stateA;
	}

	public void setStateA(String stateA) {
		this.stateA = stateA;
	}

	public String getStateB() {
		return stateB;
	}

	public void setStateB(String stateB) {
		this.stateB = stateB;
	}

	public String getStateC() {
		return stateC;
	}

	public void setStateC(String stateC) {
		this.stateC = stateC;
	}

	public Memento createMemento(){
		return new Memento(BeanUtils.getProp(this));
	}
	
	public void resetState(Memento memento){
		BeanUtils.resetProp(this, memento.getProp());
	}
}
