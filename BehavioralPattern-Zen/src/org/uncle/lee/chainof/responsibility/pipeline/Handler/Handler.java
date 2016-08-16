package org.uncle.lee.chainof.responsibility.pipeline.Handler;

import org.uncle.lee.chainof.responsibility.pipeline.request.Request;

public interface Handler {
	public abstract boolean handleRequest(Request request);
}
