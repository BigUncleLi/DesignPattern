package org.uncle.lee.strategy;

public class Context {
	private Strategy mStrategy;
	
	public Context(Strategy mStrategy){
		this.mStrategy = mStrategy;
	}
	
	public void opreate(){
		mStrategy.algorithmInterface();
	}
}
