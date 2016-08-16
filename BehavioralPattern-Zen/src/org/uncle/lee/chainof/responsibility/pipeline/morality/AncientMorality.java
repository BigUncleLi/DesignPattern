package org.uncle.lee.chainof.responsibility.pipeline.morality;

import org.uncle.lee.chainof.responsibility.pipeline.context.AncientContext;
import org.uncle.lee.chainof.responsibility.pipeline.context.Context;

public class AncientMorality extends Morality{
	@Override
	protected Context initContext() {
		return new AncientContext();
	}
}
