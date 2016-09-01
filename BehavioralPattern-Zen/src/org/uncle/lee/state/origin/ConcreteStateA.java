package org.uncle.lee.state.origin;

import org.uncle.lee.utils.LogUtils;

public class ConcreteStateA implements State{
	private static final String TAG = ConcreteStateA.class.getSimpleName();

	@Override
	public void handle(Context context) {
		if(context.getState() instanceof ConcreteStateA){
			doHandle();
		}else {
			context.setState(new ConcreteStateB());
			context.request();
		}
		
	}

	private void doHandle() {
		LogUtils.d(TAG, "do handle request ...");
	}

}
