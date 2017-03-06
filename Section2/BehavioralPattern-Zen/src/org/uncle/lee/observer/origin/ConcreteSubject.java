package org.uncle.lee.observer.origin;

import java.util.ArrayList;
import java.util.List;

public class ConcreteSubject implements Subject {
	
	private List<Observer> observers;
	
	public ConcreteSubject(){
		observers = new ArrayList<Observer>();
	}

	@Override
	public void attachObserver(Observer observer) {
		observers.add(observer);
	}

	@Override
	public void detachObserver(Observer observer) {
		observers.remove(observer);
	}

	@Override
	public void notifyObserver(Observer observer) {
		observer.update();
	}

	@Override
	public void notifyAllObservers() {
		for(Observer observer : observers){
			notifyObserver(observer);
		}
	}

}
