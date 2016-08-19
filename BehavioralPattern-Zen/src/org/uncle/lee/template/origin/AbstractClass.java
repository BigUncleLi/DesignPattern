package org.uncle.lee.template.origin;

public abstract class AbstractClass {
	protected abstract void doSomething();
	protected abstract void doAnything();
	
	public void templateMethod(){
		doSomething();
		doAnything();
	}
}
