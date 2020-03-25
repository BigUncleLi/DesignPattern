package org.uncle.lee.memento.improve;

public class CareTaker {
	public IMemento memento;

	public IMemento getMemento() {
		return memento;
	}

	public void setMemento(IMemento mementor) {
		this.memento = mementor;
	}

}
