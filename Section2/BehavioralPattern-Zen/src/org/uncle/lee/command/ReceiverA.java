package org.uncle.lee.command;

import org.uncle.lee.utils.LogUtils;

public class ReceiverA implements Receiver{
	private static final String TAG = ReceiverA.class.getSimpleName();
	
	@Override
	public void doSomething() {
		LogUtils.d(TAG, "doSomething ...");
	}
}
