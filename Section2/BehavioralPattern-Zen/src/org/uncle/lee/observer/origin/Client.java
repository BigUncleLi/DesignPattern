package org.uncle.lee.observer.origin;

public class Client {
	public static void main(String[] args) {
		Subject subject = new ConcreteSubject();
		subject.attachObserver(new ConcreteObserverA());
		subject.attachObserver(new ConcreteObserverB());
		subject.notifyAllObservers();
	}
}
