package org.uncle.lee.chainof.responsibility.pipeline.Handler;

import org.uncle.lee.chainof.responsibility.pipeline.request.Request;

public abstract class BaseHandler implements Handler, Comparable<BaseHandler>{
	private int priority;
	
	public BaseHandler(int priority){
		this.priority = priority;
	}
	
	public boolean handleRequest(Request request) {
		if (needHandle(request)) {
			doHandle(request);
			return true;
		} else {
			return false;
		}
	}
	
	@Override
	public int compareTo(BaseHandler other) {
		return this.priority > other.priority ? -1 : 1;
	}

	public abstract void doHandle(Request request);

	public abstract boolean needHandle(Request request);
}
