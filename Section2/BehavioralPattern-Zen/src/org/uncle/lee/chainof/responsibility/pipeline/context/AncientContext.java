package org.uncle.lee.chainof.responsibility.pipeline.context;

import org.uncle.lee.chainof.responsibility.pipeline.Handler.FatherHandler;
import org.uncle.lee.chainof.responsibility.pipeline.Handler.Handler;
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
		pipeline.add(new HusbandHandler(Handler.NORMAL_PRIORITY));
		pipeline.add(new SonHandler(Handler.NORMAL_PRIORITY));
		pipeline.add(new OtherManHandler(Handler.NORMAL_PRIORITY));
		pipeline.add(new FatherHandler(Handler.MAX_PRIORITY));
		return pipeline;
	}
}
