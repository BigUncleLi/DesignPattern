package org.uncle.lee.factory.method.expand.simple;

import org.uncle.lee.factory.method.Human;
import org.uncle.lee.utils.LogUtils;

public class SimpleHumanFactory {
	private static final String TAG = SimpleHumanFactory.class.getSimpleName();
	
	@SuppressWarnings("unchecked")
	public static <T extends Human> Human createHuman(Class<T> c){
		Human human = null;
		try {
			human = (T)Class.forName(c.getName()).newInstance();
		} catch (Exception e) {
			LogUtils.d(TAG, "create human error : " + e.toString());
		}
		return human;
	}
}
