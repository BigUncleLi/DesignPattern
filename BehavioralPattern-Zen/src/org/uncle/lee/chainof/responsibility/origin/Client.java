package org.uncle.lee.chainof.responsibility.origin;

public class Client {
	public static void main(String[] args) {
		Handler handlerA = new ConcreteHandlerA();
		Handler handlerB = new ConcreteHandlerB();
		Handler handlerC = new ConcreteHandlerC();
		
		handlerA.setNext(handlerB);
		handlerB.setNext(handlerC);
		
		Request request = new Request("request");
		request.setRequestLevel(Level.levelB);
		handlerA.handleRequest(request);
	}
}
