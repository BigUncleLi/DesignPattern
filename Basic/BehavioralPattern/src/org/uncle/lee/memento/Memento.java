package org.uncle.lee.memento;

import org.uncle.lee.utils.LogUtils;

public class Memento {
	private static final String TAG = Memento.class.getSimpleName();
	
	private String name;

	public Memento(String name) {
		this.name = name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "JavaBean [name=" + name + "]";
	}
	
	public void display(){
		LogUtils.d(TAG, this.toString());
	}
}
