package org.uncle.lee.chainof.responsibility.pipeline.context;

import org.uncle.lee.chainof.responsibility.pipeline.Handler.FatherHandler;
import org.uncle.lee.chainof.responsibility.pipeline.Handler.HusbandHandler;
import org.uncle.lee.chainof.responsibility.pipeline.Handler.OtherManHandler;
import org.uncle.lee.chainof.responsibility.pipeline.Handler.SonHandler;

public class AncientContext extends Context {

	@Override
	protected Pipeline initPipeline() {
		return createAncientPipeline();
	}
	
	private Pipeline createAncientPipeline() {
		Pipeline pipeline = new PipelineImpl();
		pipeline.add(new FatherHandler());
		pipeline.add(new HusbandHandler());
		pipeline.add(new SonHandler());
		pipeline.add(new OtherManHandler());
		return pipeline;
	}
}
