package org.uncle.lee.memento.multi.state;

import org.uncle.lee.utils.LogUtils;

public class Client {
	private static final String TAG = "mutil-state-mementoClient";
	
	public static void main(String[] args) {
		Originator originator = new Originator();
		CareTaker careTaker = createCareTaker(originator);
		
		changeOriginatorState(originator);
		showOriginator(originator);
		
		resetState(originator, careTaker);
		showOriginator(originator);
	}

	private static CareTaker createCareTaker(Originator originator) {
		CareTaker careTaker = new CareTaker();
		Memento memento = originator.createMemento();
		careTaker.setMemento(memento);
		return careTaker;
	}
	
	private static void resetState(Originator originator, CareTaker careTaker) {
		LogUtils.d(TAG, "do reset ...");
		originator.resetState(careTaker.getMemento());
	}

	private static void changeOriginatorState(Originator originator) {
		originator.setStateA("change-originA");
		originator.setStateB("change-originB");
		originator.setStateC("change-originC");
	}
	
	private static void showOriginator(Originator originator) {
		LogUtils.d(TAG, "stateA : " + originator.getStateA());
		LogUtils.d(TAG, "stateB : " + originator.getStateB());
		LogUtils.d(TAG, "stateC : " + originator.getStateC());
	}
}
