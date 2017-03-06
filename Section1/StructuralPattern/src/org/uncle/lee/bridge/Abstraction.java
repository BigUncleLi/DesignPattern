package org.uncle.lee.bridge;

public class Abstraction {
	private Implementor implementor;
	
	public Abstraction(Implementor implementor){
		this.implementor = implementor;
	}
	
	public void operate(){
		implementor.operationImpl();
	}
}
