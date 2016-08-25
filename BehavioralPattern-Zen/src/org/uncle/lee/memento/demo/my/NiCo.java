package org.uncle.lee.memento.demo.my;

import org.uncle.lee.utils.LogUtils;

public class NiCo implements Cloneable{
	private static final String TAG = NiCo.class.getSimpleName();

	private boolean isBreakHeart = false;
	private NiCo cacheNico;

	public void followGirl(Girl girl) {
		saveStatus();
		
		if (!isBreakHeart) {
			doFollowGril(girl);
		}
	}

	private void saveStatus() {
		try {
			cacheNico = this.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}

	private void doFollowGril(Girl girl) {
		LogUtils.d(TAG, "follow gril ...");
		boolean result = girl.handleFollow();

		if (result) {
			LogUtils.d(TAG, "hahaha, success !!");
		} else {
			LogUtils.d(TAG, "wuwuwu, I failed, I am broken.");
			isBreakHeart = true;
		}
	}
	
	public void resetStatus(){
		isBreakHeart = cacheNico.isBreakHeart;
	}
	
	@Override
	protected NiCo clone() throws CloneNotSupportedException {
		return (NiCo) super.clone();
	}
}
