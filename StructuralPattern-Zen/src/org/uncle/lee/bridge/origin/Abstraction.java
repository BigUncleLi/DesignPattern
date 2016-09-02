package org.uncle.lee.bridge.origin;

public class Abstraction {
	private Implementor implementor;
	
	public Abstraction(Implementor implementor){
		this.implementor = implementor;
	}
	
	public void operate(){
		this.implementor.operate();
		
	}
}
