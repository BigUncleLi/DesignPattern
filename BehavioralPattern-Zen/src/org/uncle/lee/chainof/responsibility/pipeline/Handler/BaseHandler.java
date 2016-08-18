package org.uncle.lee.chainof.responsibility.pipeline.Handler;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.uncle.lee.chainof.responsibility.pipeline.request.Request;
import org.uncle.lee.chainof.responsibility.pipeline.request.Request.CurrentBoss;
import org.uncle.lee.chainof.responsibility.pipeline.response.ResponseListener;
import org.uncle.lee.utils.LogUtils;

public abstract class BaseHandler implements Handler, Comparable<BaseHandler> {
	private int priority;
	protected CurrentBoss my;
	private Request request;
	private ResponseListener responseListener;
	
	private ExecutorService threadPool;

	public BaseHandler(int priority) {
		this.priority = priority;
		my = initCurrentBoss();
		initThreadPool();
	}

	private void initThreadPool() {
		threadPool = Executors.newCachedThreadPool();
	}

	public boolean handleRequest(Request request, ResponseListener responseListener) {
		this.request = request;
		this.responseListener = responseListener;
		
		if (needHandle()) {
			doHandleInThread();
			return true;
		} else {
			return false;
		}
	}

	public boolean needHandle() {
		boolean need = my != null && request.getCurrentBoss().equals(my);
		showNeedHandleInfo(need);
		return need;
	}
	
	private void doHandleInThread() {
		threadPool.submit(task);
	}
	
	private Runnable task = new Runnable() {
		@Override
		public void run() {
			doHandle(request, responseListener);
		}
	};

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
