package org.uncle.lee.observer.jdk;

import java.util.Observable;
import java.util.Observer;

import org.uncle.lee.utils.LogUtils;

public class ConcreteObserverB implements Observer{
	private static final String TAG = ConcreteObserverB.class.getSimpleName();

	@Override
	public void update(Observable o, Object arg) {
		LogUtils.d(TAG, "receive msg : " + arg.toString());
	}

}
