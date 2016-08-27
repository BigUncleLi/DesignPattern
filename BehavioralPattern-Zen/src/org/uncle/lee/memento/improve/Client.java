package org.uncle.lee.memento.improve;

import org.uncle.lee.utils.LogUtils;

public class Client {
	private static final String TAG = "improve-memento-client";
	private static final String CHANGE_STATE = "change-state-a";
	
	public static void main(String[] args) {
		Originator originator = new Originator();
		CareTaker careTaker = createCareTaker(originator);
		showOriginator(originator);
		
		changeOriginator(originator);
		showOriginator(originator);
		
		doRollback(originator, careTaker);
		showOriginator(originator);
	}
	
	private static CareTaker createCareTaker(Originator originator) {
		CareTaker careTaker = new CareTaker();
		careTaker.setMementor(originator.createMementor());
		return careTaker;
	}
	
	private static void showOriginator(Originator originator) {
		LogUtils.d(TAG, "originator state : " + originator.getStateA());
	}
	
	private static void changeOriginator(Originator originator) {
		originator.setStateA(CHANGE_STATE);
	}
	

	private static void doRollback(Originator originator, CareTaker careTaker) {
		originator.resetMementor(careTaker.getMementor());
	}
}
