package org.uncle.lee.mediator;

public class ConcreteColleagueA extends Colleague {

	public ConcreteColleagueA(String name, Mediator mediator) {
		super(name, mediator);
	}

	@Override
	public void transport(Colleague colleague, String message) {
		super.getMediator().setColleagueA(this);
		super.getMediator().transport(colleague, message);
	}
}
