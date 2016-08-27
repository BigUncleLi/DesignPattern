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
	
	public IMementor createMementor(){
		return new Mementor(this.getStateA());
	}

	public void resetMementor(IMementor mementor){
		this.setStateA(((Mementor) mementor).getStateA());
	}
	
	private class Mementor implements IMementor {
		private String stateA;
		
		public Mementor(String stateA){
			this.stateA = stateA;
		}

		public String getStateA() {
			return stateA;
		}
	}
}
