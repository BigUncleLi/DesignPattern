package org.uncle.lee.decorator;

import org.uncle.lee.utils.LogUtils;

public class ConcreteComponent implements Component {
	private static final String TAG = ConcreteComponent.class.getSimpleName();
	
	@Override
	public void operate() {
		LogUtils.d(TAG, "operate");
	}
}
