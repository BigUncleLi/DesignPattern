package org.uncle.lee.observer.demo.my;

import java.lang.reflect.Method;

import org.uncle.lee.utils.LogUtils;

public class LiSi {
	private static final String TAG = LiSi.class.getSimpleName();
	private Spe spe;
	
	public LiSi(){
		spe = new Spe();
	}
	
	public void injectSpe(HanFeiZi hanFeiZi){
		try {
			Method injectMethod = hanFeiZi.getClass().getDeclaredMethod(
					"setSpe", new Class[] { Spe.class });
			injectMethod.setAccessible(true);
			injectMethod.invoke(hanFeiZi, this.spe);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private void update(String msg){
		LogUtils.d(TAG, "msg receive from spe : " + msg);
	}
	
	public class Spe{
		public void update(String msg){
			LiSi.this.update(msg);
		}
	}
}
