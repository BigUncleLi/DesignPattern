package org.uncle.lee.prototype.deep.copy;

import org.uncle.lee.utils.LogUtils;

public class Client {
	private static final String TAG = "DeepPrototypeClient";
	private static DeepPrototype cloneDeepPrototype;

	public static void main(String[] args) {
		DeepPrototype deepPrototype = createDeepPrototype();
		createCloneDeepPrototypeCatchException(deepPrototype);
		
		compareTwoInstance(deepPrototype.getValue(), cloneDeepPrototype.getValue(), "value");
		compareTwoInstance(deepPrototype, cloneDeepPrototype, "prototype");
		compareTwoInstance(deepPrototype.getInnerObject(), cloneDeepPrototype.getInnerObject(), "innerObject");
	}
	
	private static DeepPrototype createDeepPrototype() {
		DeepPrototype deepPrototype = new DeepPrototype();
		deepPrototype.setValue(1);
		deepPrototype.setInnerObject(deepPrototype.new InnerObject());
		return deepPrototype;
	}

	private static void createCloneDeepPrototypeCatchException(DeepPrototype deepPrototype) {
		try {
			cloneDeepPrototype = createCloneDeepPrototype(deepPrototype);
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}

	private static DeepPrototype createCloneDeepPrototype(DeepPrototype deepPrototype) throws CloneNotSupportedException {
		return deepPrototype.clone();
	}
	
	private static <T> void compareTwoInstance(T t1, T t2, String name){
		if(t1 != t2){
			LogUtils.d(TAG, "two " + name + " is not the same");
		}else {
			LogUtils.d(TAG, "two " + name + " is the same");
		}
	}
}
