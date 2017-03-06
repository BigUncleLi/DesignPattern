package org.uncle.lee.chainof.responsibility.pipeline.response;

public class Response {
	private String content;
	
	public Response(String content){
		this.content = content;
	}

	@Override
	public String toString() {
		return "Response [content=" + content + "]";
	}
}
