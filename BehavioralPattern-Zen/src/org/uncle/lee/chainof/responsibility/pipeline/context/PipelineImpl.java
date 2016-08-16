package org.uncle.lee.chainof.responsibility.pipeline.context;

import java.util.Iterator;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingDeque;

import org.uncle.lee.chainof.responsibility.pipeline.Handler.Handler;

public class PipelineImpl implements Pipeline {
	Queue<Handler> queue = new LinkedBlockingDeque<Handler>();

	@Override
	public Iterator<Handler> iterator() {
		return queue.iterator();
	}

	@Override
	public void add(Handler handler) {
		queue.add(handler);
	}

}
