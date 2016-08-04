package org.uncle.lee.proxy;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.uncle.lee.utils.LogUtils;

public class Client {
	private static final String TAG = "ProxyClient";
	
	public static void main(String[] args) {
		IGamePlayer gamePlayer = new GamePlayer();
		IGamePlayer gamePlayerProxy = new GamePlayerProxy(gamePlayer);
		
		showCurrentTime("start game ...");
		gamePlayerProxy.login("zhangsan", "123");
		gamePlayerProxy.killBoss();
		gamePlayerProxy.upgrade();
		showCurrentTime("game over ...");
	}

	private static void showCurrentTime(String content) {
		String data = new SimpleDateFormat("yyyy-MM hh-mm:SS").format(new Date());
		LogUtils.d(TAG, data + " | " + content);
	}
}
