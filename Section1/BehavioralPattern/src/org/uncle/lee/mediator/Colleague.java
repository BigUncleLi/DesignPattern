package org.uncle.lee.mediator;

public abstract class Colleague {
	private String name;
	private Mediator mediator;
	
	public Colleague(String name, Mediator mediator){
		this.name = name;
		this.mediator = mediator;
	}
	
	public String getName() {
		return name;
	}


	public Mediator getMediator() {
		return mediator;
	}

	public abstract void transport(Colleague colleague, String string);
}
