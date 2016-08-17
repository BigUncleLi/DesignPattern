package org.uncle.lee.chainof.responsibility.origin;

public abstract class Handler {
	private Handler nextHandler;

	public final Response handleRequest(Request request) {
		Response response;
		if (this.getLevel().equals(request.getRequestLevel())) {
			response = this.echo(request);
		} else {
			response = doOtherHandler(request);
		}
		return response;
	}

	private Response doOtherHandler(Request request) {
		Response response;
		if (nextHandler != null) {
			response = nextHandler.handleRequest(request);
		} else {
			response = doDefaultHandler();
		}
		return response;
	}

	private Response doDefaultHandler() {
		//TODO
		return null;
	}

	public abstract Response echo(Request request);

	public abstract void setNext(Handler handler);

	public abstract Level getLevel();
}
