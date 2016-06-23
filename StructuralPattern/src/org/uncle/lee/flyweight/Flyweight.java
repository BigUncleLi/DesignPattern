package org.uncle.lee.flyweight;

import org.uncle.lee.utils.LogUtils;

public class Flyweight extends AbstractFlyweight {
	private static final String TAG = Flyweight.class.getSimpleName();

	public Flyweight(String name) {
		super(name);
	}
	
	@Override
	public void doSomething() {
		LogUtils.d(TAG, "flyweight " + super.getName() + " do something");
	}
}
