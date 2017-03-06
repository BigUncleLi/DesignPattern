package org.uncle.lee.adapter.demo.adapter.synthesis;

import org.uncle.lee.adapter.demo.ConcreteRemoteUser;
import org.uncle.lee.adapter.demo.LocalUser;
import org.uncle.lee.adapter.demo.RemoteUser;

public class Adapter implements LocalUser{
	private RemoteUser remoteUser;
	private OtherRemoteUser otherRemoteUser;
	
	public Adapter(RemoteUser remoteUser, OtherRemoteUser otherRemoteUser){
		this.remoteUser = remoteUser;
		this.otherRemoteUser = otherRemoteUser;
	}
	

	@Override
	public String getName() {
		return remoteUser.getUserInfo().get(ConcreteRemoteUser.USER_NAME_TAG);
	}

	@Override
	public String getAddress() {
		return otherRemoteUser.getNewAddress();
	}

}
