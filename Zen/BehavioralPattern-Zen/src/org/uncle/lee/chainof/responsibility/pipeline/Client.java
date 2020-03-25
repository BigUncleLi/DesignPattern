package org.uncle.lee.chainof.responsibility.pipeline;

import org.uncle.lee.chainof.responsibility.pipeline.request.Request;
import org.uncle.lee.chainof.responsibility.pipeline.request.Request.CurrentBoss;
import org.uncle.lee.chainof.responsibility.pipeline.response.Response;
import org.uncle.lee.chainof.responsibility.pipeline.response.ResponseListener;
import org.uncle.lee.chainof.responsibility.pipeline.woman.AncientWoman;
import org.uncle.lee.chainof.responsibility.pipeline.woman.Woman;
import org.uncle.lee.utils.LogUtils;

public class Client {
	public static void main(String[] args) {
		Request request = createRequest();
		
		Woman ancientWoman = new AncientWoman();
		ancientWoman.sendRequest(request, responseListener);
	}
	
	private static Request createRequest() {
		Request request = new Request();
		request.setCurrentBoss(CurrentBoss.son);
		request.setRequestContent("I want to go shopping");
		return request;
	}
	
	private static ResponseListener responseListener = new ResponseListener() {
		private final String TAG = "ancientWoman";
		@Override
		public void onResponse(Response response) {
			LogUtils.d(TAG, "onResponse : " + response.toString());
		}
		
		@Override
		public void onError(Response response) {
			LogUtils.d(TAG, "onError : " + response.toString());
		}
	};
}
