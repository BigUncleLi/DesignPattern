package org.uncle.lee.adapter.demo.my;

import org.uncle.lee.adapter.demo.my.bean.LocalUserInfo;
import org.uncle.lee.adapter.demo.my.bean.RemoteUserInfo;
import org.uncle.lee.utils.LogUtils;

public class Client {
	private static final String TAG = "adapter client";
	
	public static void main(String[] args) {
		testLocal2Remote();
		testRemote2Local();
	}

	private static void testLocal2Remote() {
		LocalUserInfo localUserInfo = new MyConcreteLocalUser().getLocalUserInfo();
		LocalUserTransformer localUserTransformer = new LocalUserTransformer(localUserInfo);
		RemoteUserInfo remoteUserInfo = localUserTransformer.transforme2Remote();
		showInfo(remoteUserInfo);
	}
	
	private static void testRemote2Local() {
		RemoteUserInfo remoteUserInfo = new MyConcreteRemoteUser().getRemoteUserInfo();
		RemoteUserTransformer remoteUserTransformer = new RemoteUserTransformer(remoteUserInfo);
		LocalUserInfo localUserInfo = remoteUserTransformer.transforme2Local();
		showInfo(localUserInfo);
	}
	
	private static void showInfo(Object info) {
		LogUtils.d(TAG, "info : " + info.toString());
	}
}
