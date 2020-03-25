package org.uncle.lee.chainof.responsibility.origin;

import org.uncle.lee.utils.LogUtils;

public class ConcreteHandlerC extends Handler{
	private static final String TAG = ConcreteHandlerC.class.getSimpleName();

	@Override
	public Response echo(Request request) {
		LogUtils.d(TAG, "echo : " + request.toString());
		return null;
	}

	@Override
	public Level getLevel() {
		return Level.levelc;
	}

}
