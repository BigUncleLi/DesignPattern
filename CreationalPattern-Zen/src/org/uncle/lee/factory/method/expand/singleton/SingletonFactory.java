package org.uncle.lee.factory.method.expand.singleton;

import java.lang.reflect.Constructor;

public class SingletonFactory {
	private static Singleton newInstance;
	
	static{
		try {
			newSingletonInstance();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void newSingletonInstance() throws Exception {
		Constructor<?> declaredConstructor = Class.forName(Singleton.class.getName()).getDeclaredConstructor();
		declaredConstructor.setAccessible(true);
		newInstance = (Singleton) declaredConstructor.newInstance();
	}
	
	public Singleton createSingleton(){
		return newInstance;
	}
}
