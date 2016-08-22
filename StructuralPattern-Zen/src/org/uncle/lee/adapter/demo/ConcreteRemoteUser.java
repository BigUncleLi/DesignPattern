package org.uncle.lee.adapter.demo;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class ConcreteRemoteUser implements RemoteUser{
	public static final String USER_NAME_TAG = "name";
	public static final String USER_ADDRESS_TAG = "address";
	public static final String USER_JOB_TAG = "job";
	
	private static final String REMOTE_USER_NAME = "remoteName";
	private static final String REMOTE_USER_ADDRESS = "remoteAddress";
	private static final String REMOTE_USER_JOB = "remoteJob";

	@Override
	public HashMap<String, String> getUserInfo() {
		return createRemoteUserInfo();
	}

	private HashMap<String, String> createRemoteUserInfo() {
		HashMap<String ,String> remoteUserInfo = new LinkedHashMap<>();
		remoteUserInfo.put(USER_NAME_TAG, REMOTE_USER_NAME);
		remoteUserInfo.put(USER_ADDRESS_TAG, REMOTE_USER_ADDRESS);
		remoteUserInfo.put(USER_JOB_TAG, REMOTE_USER_JOB);
		return remoteUserInfo;
	}

}
