package org.uncle.lee.decorator;

public abstract class Decorator implements Component{
	private Component concreteComponent;
	
	public Decorator(Component concreteComponent){
		this.concreteComponent = concreteComponent;
	}
	
	@Override
	public void operate() {
		doBefore();
		concreteComponent.operate();
		doAfter();
	}
	
	public abstract void doBefore();
	public abstract void doAfter();
}
