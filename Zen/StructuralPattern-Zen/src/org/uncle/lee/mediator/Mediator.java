package org.uncle.lee.mediator;

public abstract class Mediator {
	public Colleague colleagueA;
	public Colleague colleagueB;
	
	public void setColleagueA(Colleague colleagueA){
		this.colleagueA = colleagueA;
	}
	public void setColleagueB(Colleague colleagueB){
		this.colleagueB = colleagueB;
	}
	
	public abstract void executeTaksA();
	public abstract void executeTaskB();
}
