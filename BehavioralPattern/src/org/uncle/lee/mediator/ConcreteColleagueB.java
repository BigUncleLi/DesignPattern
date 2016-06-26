package org.uncle.lee.mediator;

public class ConcreteColleagueB extends Colleague {

	public ConcreteColleagueB(String name, Mediator mediator) {
		super(name, mediator);
	}

	@Override
	public void transport(Colleague colleague, String message) {
		super.getMediator().setColleagueB(this);
		super.getMediator().transport(colleague, message);
	}

}
