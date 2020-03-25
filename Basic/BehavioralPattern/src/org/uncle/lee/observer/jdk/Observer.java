package org.uncle.lee.observer.jdk;

import java.util.Observable;

import org.uncle.lee.utils.LogUtils;

public class Observer implements java.util.Observer {
	private static final String TAG = Observer.class.getSimpleName();

	@Override
	public void update(Observable o, Object arg) {
		LogUtils.d(TAG, "update");
	}
}
