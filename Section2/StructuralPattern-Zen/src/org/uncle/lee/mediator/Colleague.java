package org.uncle.lee.mediator;

public abstract class Colleague {
	public Mediator mediator;
	
	public Colleague(Mediator mediator){
		this.mediator = mediator;
	}
	
	public abstract void executeTaskA();
	public abstract void executeTaskB();
}
