package org.uncle.lee.chainof.responsibility.origin;

import org.uncle.lee.utils.LogUtils;

public class ConcreteHandlerA extends Handler{
	private static final String TAG = ConcreteHandlerA.class.getSimpleName();

	@Override
	public Response echo(Request request) {
		LogUtils.d(TAG, "echo : " + request.toString());
		return null;
	}

	@Override
	public Level getLevel() {
		return Level.levelA;
	}

}
