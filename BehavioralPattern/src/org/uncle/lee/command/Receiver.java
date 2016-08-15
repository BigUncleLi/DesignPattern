package org.uncle.lee.command;

import org.uncle.lee.utils.LogUtils;

public class Receiver {
	private static final String TAG = Receiver.class.getSimpleName();
	
	public void actionA(){
		LogUtils.d(TAG, "action a");
	}
	
	public void actionB(){
		LogUtils.d(TAG, "action b");
	}
}
