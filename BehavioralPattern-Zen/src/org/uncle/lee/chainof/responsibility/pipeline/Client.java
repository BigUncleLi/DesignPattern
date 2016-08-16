package org.uncle.lee.chainof.responsibility.pipeline;

import org.uncle.lee.chainof.responsibility.pipeline.request.Request;
import org.uncle.lee.chainof.responsibility.pipeline.request.Request.CurrentBoss;
import org.uncle.lee.chainof.responsibility.pipeline.woman.AncientWoman;
import org.uncle.lee.chainof.responsibility.pipeline.woman.Woman;

public class Client {
	public static void main(String[] args) {
		Request request = createRequest();
		
		Woman ancientWoman = new AncientWoman();
		ancientWoman.sendRequest(request);
	}

	private static Request createRequest() {
		Request request = new Request();
		request.setCurrentBoss(CurrentBoss.father);
		request.setRequestContent("I want to go shopping");
		return request;
	}
}
