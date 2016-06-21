package org.uncle.lee.singleton.hungry;

import org.uncle.lee.utils.LogUtils;

public class HungrySingleton {
	private static final String TAG = HungrySingleton.class.getSimpleName();
	
	private HungrySingleton(){};
	private static HungrySingleton instance = new HungrySingleton();
	
	public static HungrySingleton getInstance(){
		return instance;
	}
	
	public void operate(){
		LogUtils.d(TAG, "operate");
	}
}
