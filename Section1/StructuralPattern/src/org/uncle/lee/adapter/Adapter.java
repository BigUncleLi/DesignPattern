package org.uncle.lee.adapter;

public class Adapter implements Target {
	private Adaptee adaptee;
	
	public Adapter(){
		adaptee = new Adaptee();
	}

	@Override
	public void request() {
		adaptee.specificRequest();
	}
}
