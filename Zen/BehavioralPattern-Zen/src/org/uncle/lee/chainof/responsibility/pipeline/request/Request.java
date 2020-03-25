package org.uncle.lee.chainof.responsibility.pipeline.request;

public class Request {
	private String requestContent;
	private CurrentBoss currentBoss;

	public enum CurrentBoss {
		father, husband, son, otherMan;
	}

	public String getRequestContent() {
		return requestContent;
	}

	public void setRequestContent(String requestContent) {
		this.requestContent = requestContent;
	}

	public CurrentBoss getCurrentBoss() {
		return currentBoss;
	}

	public void setCurrentBoss(CurrentBoss currentBoss) {
		this.currentBoss = currentBoss;
	}
}
