package org.uncle.lee.flyweight;

public abstract class AbstractFlyweight {
	private String name;
	
	public AbstractFlyweight(String name){
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public abstract void doSomething();
}
