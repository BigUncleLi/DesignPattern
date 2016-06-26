package org.uncle.lee.mediator;

public abstract class Mediator {
	private Colleague colleagueA;
	private Colleague colleagueB;
	
	public enum TransportType{
		TYPE_A2B(1, "a2b"), TYPE_B2A(0, "b2a");
		
		private int code;
		private String strType;
		
		private TransportType(int code, String strType){
			this.code = code;
			this.strType = strType;
		}

		public int getCode() {
			return code;
		}

		public String getStrType() {
			return strType;
		}
	}
	
	public Colleague getColleagueA() {
		return colleagueA;
	}


	public void setColleagueA(Colleague colleagueA) {
		this.colleagueA = colleagueA;
	}


	public Colleague getColleagueB() {
		return colleagueB;
	}


	public void setColleagueB(Colleague colleagueB) {
		this.colleagueB = colleagueB;
	}

	public abstract void transport(Colleague colleague, String message);
}
