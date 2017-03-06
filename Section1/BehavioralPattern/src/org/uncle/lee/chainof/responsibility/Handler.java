package org.uncle.lee.chainof.responsibility;

public abstract class Handler {
	private Handler nextHandler;
	
	public void setNextHandler(Handler nextHandler){
		this.nextHandler = nextHandler;
	}
	
	public Handler getNextHandler() {
		return nextHandler;
	}
	
	public void handleNextHandler(){
		if(nextHandler != null){
			nextHandler.handleRequest();
		}
	}

	public abstract void handleRequest();
}
