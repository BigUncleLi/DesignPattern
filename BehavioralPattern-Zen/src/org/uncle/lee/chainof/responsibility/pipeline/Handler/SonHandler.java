package org.uncle.lee.chainof.responsibility.pipeline.Handler;

import org.uncle.lee.chainof.responsibility.pipeline.request.Request;
import org.uncle.lee.chainof.responsibility.pipeline.request.Request.CurrentBoss;
import org.uncle.lee.chainof.responsibility.pipeline.response.Response;
import org.uncle.lee.chainof.responsibility.pipeline.response.ResponseListener;
import org.uncle.lee.utils.LogUtils;

public class SonHandler extends BaseHandler {
	private static final String TAG = SonHandler.class.getSimpleName();

	public SonHandler(int priority) {
		super(priority);
	}
	
	@Override
	public void doHandle(Request request, ResponseListener responseListener) {
		LogUtils.d(TAG, "doHandle" + request.getRequestContent());
		doResponse(request, responseListener);
	}

	private void doResponse(Request request, ResponseListener responseListener) {
		Response response = new Response(request.getRequestContent() + " | "
				+ super.my.toString() + " | pass");
		responseListener.onResponse(response);
	}

	@Override
	public CurrentBoss initCurrentBoss() {
		return CurrentBoss.son;
	}
}
