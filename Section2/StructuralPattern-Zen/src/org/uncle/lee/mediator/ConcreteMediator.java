package org.uncle.lee.mediator;

import org.uncle.lee.utils.LogUtils;

public class ConcreteMediator extends Mediator{
	private static final String TAG = ConcreteMediator.class.getSimpleName();

	@Override
	public void executeTaksA() {
		super.colleagueA.executeTaskA();
		super.colleagueB.executeTaskA();
	}

	@Override
	public void executeTaskB() {
		LogUtils.d(TAG, "call executeTaskB");
		super.colleagueB.executeTaskB();
	}
}
