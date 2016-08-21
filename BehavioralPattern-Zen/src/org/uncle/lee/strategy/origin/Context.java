package org.uncle.lee.strategy.origin;

public class Context {
	private Strategy strategy;
	
	public Context(Strategy strategy){
		this.strategy = strategy;
	}
	
	public void contextInterface(){
		strategy.arithmeticInterface();
	}
}
