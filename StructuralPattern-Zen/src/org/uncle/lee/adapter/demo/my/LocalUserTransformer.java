package org.uncle.lee.adapter.demo.my;

import org.uncle.lee.adapter.demo.my.bean.LocalUserInfo;
import org.uncle.lee.adapter.demo.my.bean.RemoteUserInfo;

public class LocalUserTransformer {
	private LocalUserInfo localUserInfo;
	
	public LocalUserTransformer(LocalUserInfo localUserInfo){
		this.localUserInfo = localUserInfo;
	}
	
	public RemoteUserInfo transforme2Remote(){
		RemoteUserInfo remoteUserInfo = new RemoteUserInfo();
		remoteUserInfo.setName(this.localUserInfo.getName());
		remoteUserInfo.setAddress(this.localUserInfo.getAddress());
		remoteUserInfo.setAddress(null);
		return remoteUserInfo;
	}
}
