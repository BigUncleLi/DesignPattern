package org.uncle.lee.proxy;

import org.uncle.lee.utils.LogUtils;

public class GamePlayer implements IGamePlayer {
	private static final String TAG = GamePlayer.class.getSimpleName();

	@Override
	public void login(String userName, String password) {
		LogUtils.d(TAG, userName + " login success ...");
	}

	@Override
	public void killBoss() {
		LogUtils.d(TAG, "kill boss success ...");
	}

	@Override
	public void upgrade() {
		LogUtils.d(TAG, "upgrade 1 level ...");
	}
}
