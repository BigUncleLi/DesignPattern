package org.uncle.lee.state;

import org.uncle.lee.state.Context.ContextType;
import org.uncle.lee.utils.LogUtils;

public class ConcreteStateB implements State {
	private static final String TAG = ConcreteStateB.class.getSimpleName();

	@Override
	public void handle(Context context) {
		if(context.getType().equals(ContextType.TYPEB)){
			LogUtils.d(TAG, "handle");
		}else {
			context.setState(new ConcreteStateC());
			context.request();
		}
	}
}
