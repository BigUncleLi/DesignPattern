package org.uncle.lee.command;

import org.uncle.lee.utils.LogUtils;

public class ReceiverB implements Receiver{
	private static final String TAG = ReceiverB.class.getSimpleName();
	
	@Override
	public void doSomething() {
		LogUtils.d(TAG, "doSomething ...");
	}
}
