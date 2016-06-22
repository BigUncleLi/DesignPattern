package org.uncle.lee.prototype.deep.copy.serialize;

import org.uncle.lee.utils.LogUtils;

public class Client {
	private static final String TAG = "DeepSeralizePrototype";
	
	public static void main(String[] args) {
		DeepSerializePrototype prototype = createDeepSeralizePrototype();
		DeepSerializePrototype clonePrototype = createCloneDeepSeralizeProtype(prototype);
		
		compareTwoInstance(prototype.getValue(), clonePrototype.getValue(), "value");
		compareTwoInstance(prototype, clonePrototype, "prototype");
		compareTwoInstance(prototype.getInnerObject(), clonePrototype.getInnerObject(), "innerObject");
	}

	private static DeepSerializePrototype createDeepSeralizePrototype() {
		DeepSerializePrototype prototype = new DeepSerializePrototype();
		prototype.setValue(1);
		prototype.setInnerObject(prototype.new InnerObject());
		return prototype;
	}
	
	private static DeepSerializePrototype createCloneDeepSeralizeProtype(DeepSerializePrototype prototype){
		try {
			return prototype.clone();
		} catch (CloneNotSupportedException e) {
			throw new RuntimeException(e.toString());
		}
	}

	private static <T> void compareTwoInstance(T t1, T t2, String name){
		if(t1 != t2){
			LogUtils.d(TAG, "two " + name + " is not the same");
		}else {
			LogUtils.d(TAG, "two " + name + " is the same");
		}
	}
}
