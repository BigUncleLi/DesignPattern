package org.uncle.lee.observer.jdk;

public class Client {
	public static void main(String[] args) {
		Subject subject = new Subject();
		subject.addObserver(new ConcreteObserverA());
		subject.addObserver(new ConcreteObserverB());
		
		subject.operate();
	}
}
