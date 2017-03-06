package org.uncle.lee.singleton.lazy;

import org.uncle.lee.utils.LogUtils;

public class LazySingleton {
	private static final String TAG = LazySingleton.class.getSimpleName();
	
	private LazySingleton(){};
	private static LazySingleton instance;
	
	public static LazySingleton getInstance(){
		if(instance == null){
			synchronized (LazySingleton.class) {
				if(instance == null){
					instance = new LazySingleton();
				}
			}
		}
		return instance;
	}
	
	public void showInstanceAddress(){
		LogUtils.d(TAG, "instance address : " + instance.hashCode());
	}
}
