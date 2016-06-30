package org.uncle.lee.factory.method.expand.singleton.more;

import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.List;

public class  SingletonTypeFactory {
	private List<Object> instanceList = new ArrayList<Object>();
	private Object instance;
	
	
	public Object createInstance(Class<?> c){
		if(!isTypeExist(c)){
			Object newInstance = createInstanceByClass(c);
			instanceList.add(newInstance);
			return newInstance;
		}else {
			return getInstanceByClass(c);
		}
	}
	
	private Object createInstanceByClass(Class<?> c) {
		try {
			Constructor<?> declaredConstructor = Class.forName(c.getName()).getDeclaredConstructor();
			declaredConstructor.setAccessible(true);
			instance = declaredConstructor.newInstance();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return instance;
	}
	
	private Object getInstanceByClass(Class<?> c) {
		for(Object instance : instanceList){
			if(instance.getClass().equals(c)){
				return instance;
			}
		}
		return null;
	}

	private boolean isTypeExist(Class<?> c){
		for(Object instance : instanceList){
			if(instance.getClass().equals(c)){
				return true;
			}
		}
		return false;
	}
}
