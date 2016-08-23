package org.uncle.lee.observer.demo.my;

import org.uncle.lee.observer.demo.my.LiSi.Spe;
import org.uncle.lee.utils.LogUtils;

public class HanFeiZiImpl implements HanFeiZi{
	private static final String TAG = "HanFeiZi";
	private Spe spe;

	@Override
	public void haveBreakfast() {
		LogUtils.d(TAG, "I have breakfast");
		spe.update("hanfeizi has breakfast !!");
	}

	@Override
	public void haveFun() {
		LogUtils.d(TAG, "I have fun");
		spe.update("hanfeizi has fun !!");
	}
	
	@SuppressWarnings("unused")
	private void setSpe(Spe spe){
		this.spe = spe;
	}
}
