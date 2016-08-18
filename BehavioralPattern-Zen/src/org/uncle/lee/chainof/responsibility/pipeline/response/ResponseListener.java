package org.uncle.lee.chainof.responsibility.pipeline.response;

public interface ResponseListener {
	public abstract void onResponse(Response response);
	public abstract void onError(Response response);
}
