package org.uncle.lee.adapter.demo.adapter.synthesis;

import org.uncle.lee.adapter.demo.ConcreteRemoteUser;
import org.uncle.lee.adapter.demo.LocalUser;
import org.uncle.lee.utils.LogUtils;

public class Client {
	private static final String TAG = "synthesis adapter client";
	
	public static void main(String[] args) {
		LocalUser localUser = new Adapter(new ConcreteRemoteUser(), new ConcreteOtherRemoteUser());
		showUser(localUser);
	}
	
	private static void showUser(LocalUser localUser) {
		LogUtils.d(TAG, "name : " + localUser.getName());
		LogUtils.d(TAG, "address : " + localUser.getAddress());
	}
}
