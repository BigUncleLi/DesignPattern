package org.uncle.lee.proxy.force;

public class GamePlayerProxy implements IGamePlayer{
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
	}

	@Override
	public IGamePlayer getProxy() {
		return this;
	}
}
