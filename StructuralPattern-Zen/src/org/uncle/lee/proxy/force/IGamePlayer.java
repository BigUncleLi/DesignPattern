package org.uncle.lee.proxy.force;

public interface IGamePlayer {
	public abstract void login(String name, String password);
	public abstract void killBoss();
	public abstract void upgrade();
	public abstract IGamePlayer getProxy();
}
