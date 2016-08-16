package org.uncle.lee.chainof.responsibility.pipeline.Handler;

import org.uncle.lee.chainof.responsibility.pipeline.request.Request;
import org.uncle.lee.chainof.responsibility.pipeline.request.Request.CurrentBoss;
import org.uncle.lee.utils.LogUtils;

public class HusbandHandler extends BaseHandler {
	private static final String TAG = HusbandHandler.class.getSimpleName();
	private final CurrentBoss my = CurrentBoss.husband;

	@Override
	public void doHandle(Request request) {
		LogUtils.d(TAG, request.getRequestContent() + " | pass");
	}

	@Override
	public boolean needHandle(Request request) {
		return request.getCurrentBoss().equals(my);
	}
}
