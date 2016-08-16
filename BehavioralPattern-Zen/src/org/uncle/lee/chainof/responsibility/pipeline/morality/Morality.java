package org.uncle.lee.chainof.responsibility.pipeline.morality;

import java.util.Iterator;

import org.uncle.lee.chainof.responsibility.pipeline.Handler.Handler;
import org.uncle.lee.chainof.responsibility.pipeline.context.Context;
import org.uncle.lee.chainof.responsibility.pipeline.context.Pipeline;
import org.uncle.lee.chainof.responsibility.pipeline.request.Request;

public abstract class Morality {
	protected Context context;
	
	public Morality(){
		context = initContext();
	}

	protected abstract Context initContext();
	
	public void handleRequest(Request request){
		Pipeline pipeline = context.pipeline();
		Iterator<Handler> iterator = pipeline.iterator();
		
		while(iterator.hasNext()){
			Handler next = iterator.next();
			if(next.handleRequest(request)){
				break;
			}
		}
	};
}
