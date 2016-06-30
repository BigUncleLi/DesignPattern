package org.uncle.lee.factory.method.expand.singleton.more;

import java.util.ArrayList;
import java.util.List;

public class  SingletonTypeFactory <T>{
	private List<Object> typeList = new ArrayList<Object>();
	private Object instance;
	
	
	public T createInstance(Class<?> c){
		if(isTypeExist(c)){
		}
		return null;
	}
	
	private boolean isTypeExist(Class<?> c){
		for(Object type : typeList){
			if(type.getClass().equals(c)){
				return true;
			}
		}
		return false;
	}
}
