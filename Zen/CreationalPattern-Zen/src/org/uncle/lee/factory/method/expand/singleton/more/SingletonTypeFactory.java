package org.uncle.lee.factory.method.expand.singleton.more;

import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.List;

public class  SingletonTypeFactory {
	private List<Object> instanceList = new ArrayList<Object>();
	private Object instance;
	
	
	public Object createInstance(Class<?> c, Object... objects){
		if(!isTypeExist(c)){
			Object newInstance = createInstanceByClass(c, objects);
			instanceList.add(newInstance);
			return newInstance;
		}else {
			return getInstanceByClass(c);
		}
	}
	
	private boolean isTypeExist(Class<?> c){
		for(Object instance : instanceList){
			if(instance.getClass().equals(c)){
				return true;
			}
		}
		return false;
	}
	
	private Object createInstanceByClass(Class<?> c, Object... objects) {
		try {
			Class<?>[] classArrays = getClassArrayFromObjects(objects);
			Constructor<?> declaredConstructor = Class.forName(c.getName()).getDeclaredConstructor(classArrays);
			declaredConstructor.setAccessible(true);
			instance = declaredConstructor.newInstance(objects);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return instance;
	}
	
	private Class<?>[] getClassArrayFromObjects(Object[] objects) {
		Class<?>[] classArrays = new Class<?>[objects.length];
		for(int i = 0; i < objects.length; i++){
			classArrays[i] = objects[i].getClass();
		}
		return classArrays;
	}

	private Object getInstanceByClass(Class<?> c) {
		for(Object instance : instanceList){
			if(instance.getClass().equals(c)){
				return instance;
			}
		}
		return null;
	}
}
