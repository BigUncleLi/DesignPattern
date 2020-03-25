package org.uncle.lee.state.origin;

import org.uncle.lee.utils.LogUtils;

public class ConcreteStateB implements State {
	private static final String TAG = ConcreteStateB.class.getSimpleName();

	@Override
	public void handle(Context context) {
		if(context.getState() instanceof ConcreteStateB){
			doHandle();
		}else {
			doDefault();
		}
	}

	private void doHandle() {
		LogUtils.d(TAG, "do handle request ...");
	}
	
	private void doDefault() {
		LogUtils.d(TAG, "do default request ...");
	}

}
