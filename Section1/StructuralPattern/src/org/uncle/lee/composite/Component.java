package org.uncle.lee.composite;

import java.util.List;

public abstract class Component {
	private String name;
	
	public Component(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}
	
	public abstract void showStucture();
	public abstract boolean add(Component component);
	public abstract boolean remove(Component component);
	public abstract List<Component> getChildren();
}
