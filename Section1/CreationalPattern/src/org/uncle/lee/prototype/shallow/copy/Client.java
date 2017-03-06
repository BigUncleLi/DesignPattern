package org.uncle.lee.prototype.shallow.copy;

import org.uncle.lee.utils.LogUtils;

public class Client {
	private static final String TAG = "ShallowPrototypeClient";
	private static ShallowPrototype clonePrototype;

	public static void main(String[] args) {
		ShallowPrototype prototype = createPrototype();
		createCopyPrototypeCatchException(prototype);
		
		compareTwoInstance(prototype.getValue(), clonePrototype.getValue(), "value");
		compareTwoInstance(prototype, clonePrototype, "prototype");
		compareTwoInstance(prototype.getInnerObject(), clonePrototype.getInnerObject(), "innerObject");
	}
	
	private static ShallowPrototype createPrototype() {
		ShallowPrototype prototype = new ShallowPrototype();
		prototype.setValue(1);
		prototype.setInnerObject(prototype.new InnerObject());
		return prototype;
	}

	private static void createCopyPrototypeCatchException(ShallowPrototype prototype) {
		try {
			createCopyPrototype(prototype);
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}

	private static void createCopyPrototype(ShallowPrototype prototype) throws CloneNotSupportedException {
		clonePrototype = prototype.clone();
	}
	
	private static <T> void  compareTwoInstance(T t1, T t2, String name){
		if(t1 != t2){
			LogUtils.e(TAG, "tow " + name + " is not the same");
		}else{
			LogUtils.d(TAG, "two " + name + " is the same");
		}
	}
}
