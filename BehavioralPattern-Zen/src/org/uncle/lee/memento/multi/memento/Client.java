package org.uncle.lee.memento.multi.memento;

import org.uncle.lee.memento.multi.state.Originator;
import org.uncle.lee.utils.LogUtils;

public class Client {
	private static final String TAG = "multi-memento-client";
	private static final String CHANGE_FIRST = "first";
	private static final String CHANGE_SECONDE = "second";
	private static final String CHANGE_THIRD = "third";

	public static void main(String[] args) {
		Originator originator = new Originator();
		CareTaker careTaker = new CareTaker();
		showOriginator(originator);

		changeOriginator(CHANGE_FIRST, originator);
		careTaker.addMemento(CHANGE_FIRST, originator.createMemento());
		showOriginator(originator);
		
		changeOriginator(CHANGE_SECONDE, originator);
		careTaker.addMemento(CHANGE_SECONDE, originator.createMemento());
		showOriginator(originator);
		
		changeOriginator(CHANGE_THIRD, originator);
		careTaker.addMemento(CHANGE_THIRD, originator.createMemento());
		showOriginator(originator);
		
		originator.resetState(careTaker.getMemento(CHANGE_SECONDE));
		showOriginator(originator);
	}

	private static void changeOriginator(String info, Originator originator) {
		originator.setStateA(info);
		originator.setStateB(info);
		originator.setStateC(info);
	}
	
	private static void showOriginator(Originator originator) {
		LogUtils.d(TAG, "stateA : " + originator.getStateA());
		LogUtils.d(TAG, "stateB : " + originator.getStateB());
		LogUtils.d(TAG, "stateC : " + originator.getStateC());
	}

}
