package org.uncle.lee.chainof.responsibility.pipeline.Handler;

import org.uncle.lee.chainof.responsibility.pipeline.request.Request;
import org.uncle.lee.chainof.responsibility.pipeline.request.Request.CurrentBoss;
import org.uncle.lee.chainof.responsibility.pipeline.response.ResponseListener;
import org.uncle.lee.utils.LogUtils;

public abstract class BaseHandler implements Handler, Comparable<BaseHandler> {
	private int priority;
	protected CurrentBoss my;

	public BaseHandler(int priority) {
		this.priority = priority;
		my = initCurrentBoss();
	}

	public boolean handleRequest(Request request, ResponseListener responseListener) {
		if (needHandle(request)) {
			doHandle(request, responseListener);
			return true;
		} else {
			return false;
		}
	}

	public boolean needHandle(Request request) {
		boolean need = my != null && request.getCurrentBoss().equals(my);
		showNeedHandleInfo(need);
		return need;
	}

	private void showNeedHandleInfo(boolean need) {
		if (need) {
			LogUtils.d(my.toString(), "check success, I'll handle it");
		} else {
			LogUtils.d(my.toString(), "check fail, trun to next");
		}
	}

	@Override
	public int compareTo(BaseHandler other) {
		return this.priority > other.priority ? -1 : 1;
	}


	public abstract CurrentBoss initCurrentBoss();
	public abstract void doHandle(Request request, ResponseListener responseListener);
}
