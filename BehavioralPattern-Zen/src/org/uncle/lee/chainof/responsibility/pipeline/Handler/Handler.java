package org.uncle.lee.chainof.responsibility.pipeline.Handler;

import org.uncle.lee.chainof.responsibility.pipeline.request.Request;

public interface Handler {
	public static int MAX_PRIORITY = Integer.MAX_VALUE;
	public static int NORMAL_PRIORITY = 0;
	public static int MIN_PRIORITY = Integer.MIN_VALUE;
	
	public abstract boolean handleRequest(Request request);
}
