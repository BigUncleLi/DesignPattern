package org.uncle.lee.memento.origin;

public class Client {
	public static void main(String[] args) {
		Originator originator = new Originator();
		CareTaker careTaker = new CareTaker();
		careTaker.setMemento(originator.createMemento());
		originator.resetMemento(careTaker.getMemento());
	}
}
