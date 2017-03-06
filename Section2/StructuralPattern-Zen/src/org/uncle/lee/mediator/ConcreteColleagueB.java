package org.uncle.lee.mediator;

import org.uncle.lee.utils.LogUtils;

public class ConcreteColleagueB extends Colleague{
	private static final String TAG = ConcreteColleagueB.class.getSimpleName();

	public ConcreteColleagueB(Mediator mediator) {
		super(mediator);
	}

	@Override
	public void executeTaskA() {
		// do itself
		LogUtils.d(TAG, "execute task A, do itself...");
	}

	@Override
	public void executeTaskB() {
		// rely on mediator to communicate with other. entrust mediator
		super.mediator.executeTaksA();
	}
}
