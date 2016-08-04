package org.uncle.lee.proxy.force;

public class Client {
	public static void main(String[] args) {
		useRealSubject();
		useProxy();
		useRealSubjectCreateProxy();
	}

	private static void useRealSubject() {
		GamePlayer gamePlayer = new GamePlayer();
		gamePlayer.login("zhangsan", "123");
		gamePlayer.killBoss();
		gamePlayer.upgrade();
	}
	
	private static void useProxy(){
		GamePlayer gamePlayer = new GamePlayer();
		GamePlayerProxy gamePlayerProxy = new GamePlayerProxy(gamePlayer);
		gamePlayerProxy.login("zhangsan", "123");
		gamePlayerProxy.killBoss();
		gamePlayerProxy.upgrade();
	}
	
	private static void useRealSubjectCreateProxy() {
		GamePlayer gamePlayer = new GamePlayer();
		IGamePlayer proxy = gamePlayer.getProxy();
		proxy.login("zhangsan", "123");
		proxy.killBoss();
		proxy.upgrade();
	}
}
