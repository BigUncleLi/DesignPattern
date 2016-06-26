package org.uncle.lee.mediator;

public class Client {
	public static void main(String[] args) {
		Mediator mediator = new ConcreteMediator();
		
		Colleague colleagueA = new ConcreteColleagueA("colleagueA", mediator);
		Colleague colleagueB = new ConcreteColleagueB("colleagueB", mediator);
		
		colleagueA.transport(colleagueB, "hello b, I'm a.");
	}
}
