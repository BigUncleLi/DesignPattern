package org.uncle.lee.mediator;

import org.uncle.lee.utils.LogUtils;

public class ConcreteColleagueA extends Colleague{
	private static final String TAG = ConcreteColleagueA.class.getSimpleName();

	public ConcreteColleagueA(Mediator mediator) {
		super(mediator);
	}

	@Override
	public void executeTaskA() {
		// do itself, don't rely on other
		LogUtils.d(TAG, "execute task A, do itself ...");
	}

	@Override
	public void executeTaskB() {
		// need rely on mediator to communicate with other. entrust mediator
		super.mediator.executeTaskB();
	}
}
