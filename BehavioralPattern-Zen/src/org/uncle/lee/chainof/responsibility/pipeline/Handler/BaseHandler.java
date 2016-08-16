package org.uncle.lee.chainof.responsibility.pipeline.Handler;

import org.uncle.lee.chainof.responsibility.pipeline.request.Request;

public abstract class BaseHandler implements Handler {
	public boolean handleRequest(Request request) {
		if (needHandle(request)) {
			doHandle(request);
			return true;
		} else {
			return false;
		}
	}

	public abstract void doHandle(Request request);

	public abstract boolean needHandle(Request request);
}
