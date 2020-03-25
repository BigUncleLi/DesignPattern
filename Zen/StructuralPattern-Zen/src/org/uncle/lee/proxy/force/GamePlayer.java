package org.uncle.lee.proxy.force;

import org.uncle.lee.utils.LogUtils;

public class GamePlayer implements IGamePlayer{
	private static final String TAG = GamePlayer.class.getSimpleName();
	private GamePlayerProxy gamePlayerProxy;

	@Override
	public void login(final String name, String password) {
		runTask(new Runnable() {
			@Override
			public void run() {
				LogUtils.d(TAG, name + " login success ...");
			}
		});
	}

	@Override
	public void killBoss() {
		runTask(new Runnable() {
			@Override
			public void run() {
				LogUtils.d(TAG, "kill boss ...");
			}
		});
	}

	@Override
	public void upgrade() {
		runTask(new Runnable() {
			@Override
			public void run() {
				LogUtils.d(TAG, "upgrade 1 level ...");
			}
		});
	}

	@Override
	public IGamePlayer getProxy() {
		gamePlayerProxy = new GamePlayerProxy(this);
		return gamePlayerProxy;
	}
	
	private boolean isProxy(){
		return gamePlayerProxy != null;
	}
	
	private void runTask(Runnable runnable) {
		if(isProxy()){
			runnable.run();
		} else {
			LogUtils.d(TAG, "please use proxy ...");
		}
	}
}
