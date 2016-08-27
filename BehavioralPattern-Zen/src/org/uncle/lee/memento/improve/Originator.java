package org.uncle.lee.memento.improve;

public class Originator {
	private static final String DEFAULT_STATE_A = "origin-state-a";
	private String stateA;
	
	public Originator(){
		this.stateA = DEFAULT_STATE_A;
	}

	public String getStateA() {
		return stateA;
	}

	public void setStateA(String stateA) {
		this.stateA = stateA;
	}
	
	public IMemento createMemento(){
		return new Memento(this.getStateA());
	}

	public void resetMemento(IMemento memento){
		this.setStateA(((Memento) memento).getStateA());
	}
	
	private class Memento implements IMemento {
		private String stateA;
		
		public Memento(String stateA){
			this.stateA = stateA;
		}

		public String getStateA() {
			return stateA;
		}
	}
}
