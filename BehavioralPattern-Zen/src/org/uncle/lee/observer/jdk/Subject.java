package org.uncle.lee.observer.jdk;

import java.util.Observable;

import org.uncle.lee.utils.LogUtils;

public class Subject extends Observable{
	private static final String TAG = Subject.class.getSimpleName();
	
	public void operate(){
		LogUtils.d(TAG, "operate ...");
		sendSignal();
	}

	private void sendSignal() {
		super.setChanged();
		super.notifyObservers("sendSignal has done");
	}
}
