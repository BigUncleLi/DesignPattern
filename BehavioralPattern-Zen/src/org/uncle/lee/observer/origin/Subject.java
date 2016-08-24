package org.uncle.lee.observer.origin;

public interface Subject {
	public void attachObserver(Observer observer);
	public void detachObserver(Observer observer);
	public void notifyObserver(Observer observer);
	public void notifyAllObservers();
}
