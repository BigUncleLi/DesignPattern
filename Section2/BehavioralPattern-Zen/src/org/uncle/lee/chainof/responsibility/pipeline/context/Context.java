package org.uncle.lee.chainof.responsibility.pipeline.context;

public abstract class Context {
	protected Pipeline pipeline;
	
	public Context(){
		pipeline = initPipeline();
	}

	protected abstract Pipeline initPipeline();
	
	public Pipeline pipeline(){
		return pipeline;
	}
}
