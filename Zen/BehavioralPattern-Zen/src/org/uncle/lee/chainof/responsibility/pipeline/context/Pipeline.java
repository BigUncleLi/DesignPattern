package org.uncle.lee.chainof.responsibility.pipeline.context;

import org.uncle.lee.chainof.responsibility.pipeline.Handler.Handler;

public interface Pipeline extends Iterable<Handler>{
	public abstract void add(Handler handler);
}
