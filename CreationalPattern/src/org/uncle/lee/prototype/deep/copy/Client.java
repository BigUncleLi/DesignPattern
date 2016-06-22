package org.uncle.lee.prototype.deep.copy;

import org.uncle.lee.utils.LogUtils;

public class Client {
	private static final String TAG = "DeepPrototypeClient";
	private static DeepPrototype cloneDeepPrototype;

	public static void main(String[] args) {
		DeepPrototype deepPrototype = createDeepPrototype();
		createCloneDeepPrototypeCatchException(deepPrototype);
		
		LogUtils.d(TAG, "innerObject : " + deepPrototype.getInnerObject().hashCode() + "-" + cloneDeepPrototype.getInnerObject().hashCode());
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

	private static DeepPrototype createDeepPrototype() {
		DeepPrototype deepPrototype = new DeepPrototype();
		deepPrototype.setValue(1);
		deepPrototype.setInnerObject(deepPrototype.new InnerObject());
		return deepPrototype;
	}
}
