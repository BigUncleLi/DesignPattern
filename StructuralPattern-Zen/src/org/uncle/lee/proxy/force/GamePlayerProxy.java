package org.uncle.lee.proxy.force;

import org.uncle.lee.utils.LogUtils;

public class GamePlayerProxy implements IGamePlayer, IProxy{
	private static final String TAG = GamePlayerProxy.class.getSimpleName();
	private IGamePlayer gamePlayer;
	
	public GamePlayerProxy(IGamePlayer gamePlayer){
		this.gamePlayer = gamePlayer;
	}
	
	@Override
	public void login(String name, String password) {
		gamePlayer.login(name, password);
	}

	@Override
	public void killBoss() {
		gamePlayer.killBoss();
	}

	@Override
	public void upgrade() {
		gamePlayer.upgrade();
		this.payTheBill();
	}

	@Override
	public IGamePlayer getProxy() {
		return this;
	}
	

	@Override
	public void payTheBill() {
		LogUtils.d(TAG, "pay 150 $");
	}
}
