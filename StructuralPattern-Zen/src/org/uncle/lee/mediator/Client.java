package org.uncle.lee.mediator;

public class Client {
	public static void main(String[] args) {
		Mediator mediator = new ConcreteMediator();
		Colleague colleagueA = createColleagueA(mediator);
		Colleague colleagueB = createColleagueB(mediator);
		
		colleagueA.executeTaskA();
		colleagueB.executeTaskB();
	}

	private static Colleague createColleagueA(Mediator mediator) {
		Colleague colleagueA = new ConcreteColleagueA(mediator);
		mediator.setColleagueA(colleagueA);
		return colleagueA;
	}
	
	private static Colleague createColleagueB(Mediator mediator) {
		Colleague colleagueB = new ConcreteColleagueB(mediator);
		mediator.setColleagueB(colleagueB);
		return colleagueB;
	}
}
