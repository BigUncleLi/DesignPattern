package org.uncle.lee.adapter.demo.my;

import org.uncle.lee.adapter.demo.LocalUser;

public class ConcreteLocalUser implements LocalUser{
	private static final String LOCAL_USER_NAME = "localName";
	private static final String LOCAL_USER_ADDRESS = "localAddress";

	@Override
	public String getName() {
		return LOCAL_USER_NAME;
	}

	@Override
	public String getAddress() {
		return LOCAL_USER_ADDRESS;
	}
}
