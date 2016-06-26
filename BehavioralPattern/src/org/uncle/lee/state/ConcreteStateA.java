package org.uncle.lee.state;

import org.uncle.lee.state.Context.ContextType;
import org.uncle.lee.utils.LogUtils;

public class ConcreteStateA implements State {
	private static final String TAG = ConcreteStateA.class.getSimpleName();

	@Override
	public void handle(Context context) {
		if(context.getType().equals(ContextType.TYPEA)){
			LogUtils.d(TAG, "handle");
		}else {
			context.setState(new ConcreteStateB());
			context.request();
		}
	}
}
