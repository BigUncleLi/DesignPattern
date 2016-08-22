package org.uncle.lee.adapter.demo.adapter;

import org.uncle.lee.adapter.demo.LocalUser;
import org.uncle.lee.utils.LogUtils;

public class Client {
	private static final String TAG = "adapter demo client";
	
	public static void main(String[] args) {
		LocalUser localUser = new Adapter();
		
		showUser(localUser);
	}

	private static void showUser(LocalUser localUser) {
		LogUtils.d(TAG, "name : " + localUser.getName());
		LogUtils.d(TAG, "address : " + localUser.getAddress());
	}
}
