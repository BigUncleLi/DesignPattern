package org.uncle.lee.proxy;

public class GamePlayerProxy implements IGamePlayer{
	private IGamePlayer gamePlayer;
	
	public GamePlayerProxy(IGamePlayer gamePlayer){
		this.gamePlayer = gamePlayer;
	}

	@Override
	public void login(String userName, String password) {
		this.gamePlayer.login(userName, password);
	}

	@Override
	public void killBoss() {
		this.gamePlayer.killBoss();
	}

	@Override
	public void upgrade() {
		this.gamePlayer.upgrade();
	}
}
