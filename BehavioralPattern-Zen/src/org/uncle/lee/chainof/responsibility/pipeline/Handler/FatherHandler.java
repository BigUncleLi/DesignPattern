package org.uncle.lee.chainof.responsibility.pipeline.Handler;

import org.uncle.lee.chainof.responsibility.pipeline.request.Request;
import org.uncle.lee.chainof.responsibility.pipeline.request.Request.CurrentBoss;
import org.uncle.lee.utils.LogUtils;

public class FatherHandler extends BaseHandler {
	private static final String TAG = FatherHandler.class.getSimpleName();
	private final CurrentBoss my = CurrentBoss.father;

	public FatherHandler(int priority) {
		super(priority);
	}
	
	@Override
	public void doHandle(Request request) {
		LogUtils.d(TAG, request.getRequestContent() + " | pass");
	}

	@Override
	public boolean needHandle(Request request) {
		boolean need = request.getCurrentBoss().equals(my);
		showNeedHandle(need);
		return need;
	}

	private void showNeedHandle(boolean need) {
		if(need){
			LogUtils.d(TAG, "check success, I'll handle it");
		} else {
			LogUtils.d(TAG, "check fail, trun to next");
		}
	}

}
