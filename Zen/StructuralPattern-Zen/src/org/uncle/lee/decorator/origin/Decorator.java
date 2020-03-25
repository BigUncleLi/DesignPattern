package org.uncle.lee.decorator.origin;

public abstract class Decorator implements Component {
	protected Component component;
	
	public Decorator(Component component){
		this.component = component;
	}
}
