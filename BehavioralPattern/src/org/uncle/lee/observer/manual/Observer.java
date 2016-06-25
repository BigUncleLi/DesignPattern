package org.uncle.lee.observer.manual;

public interface Observer {
	public abstract void update(Observer observer, Object msg);
	public abstract void update(Observer observer);
}
