package org.uncle.lee.adapter.demo.adapter.inherit;

import org.uncle.lee.adapter.demo.ConcreteRemoteUser;
import org.uncle.lee.adapter.demo.LocalUser;

public class Adapter extends ConcreteRemoteUser implements LocalUser{

	@Override
	public String getName() {
		return super.getUserInfo().get(ConcreteRemoteUser.USER_NAME_TAG);
	}

	@Override
	public String getAddress() {
		return super.getUserInfo().get(ConcreteRemoteUser.USER_ADDRESS_TAG);
	}

}
