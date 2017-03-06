package org.uncle.lee.chainof.responsibility.origin;

public class Request {
	private Level requestLevel;
	private String content;
	
	public Request(String content){
		this.content = content;
	}
	
	public String getContent() {
		return content;
	}

	public Level getRequestLevel() {
		return requestLevel;
	}

	public void setRequestLevel(Level requestLevel) {
		this.requestLevel = requestLevel;
	}

	@Override
	public String toString() {
		return "Request [requestLevel=" + requestLevel + ", content=" + content
				+ "]";
	}
}
