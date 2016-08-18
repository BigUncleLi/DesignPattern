package org.uncle.lee.chainof.responsibility.pipeline.woman;

import org.uncle.lee.chainof.responsibility.pipeline.morality.Morality;
import org.uncle.lee.chainof.responsibility.pipeline.request.Request;
import org.uncle.lee.chainof.responsibility.pipeline.response.ResponseListener;
import org.uncle.lee.utils.LogUtils;

public abstract class Woman {
	private static final String TAG = Woman.class.getSimpleName();
	protected Morality morality;
	
	public Woman(){
		morality = initMorality();
	}
	
	protected abstract Morality initMorality();

	public void sendRequest(Request request, ResponseListener responseListener){
		if(morality != null){
			morality.handleRequest(request, responseListener);
		} else {
			LogUtils.d(TAG, "I have no morality, I do nothing.");
		}
	}
}
