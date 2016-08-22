package org.uncle.lee.adapter.demo.my;

import org.uncle.lee.adapter.demo.my.bean.LocalUserInfo;
import org.uncle.lee.adapter.demo.my.bean.RemoteUserInfo;

public class RemoteUserTransformer {
	private RemoteUserInfo remoteUserInfo;
	
	public RemoteUserTransformer(RemoteUserInfo remoteUserInfo){
		this.remoteUserInfo = remoteUserInfo;
	}
	
	public LocalUserInfo transforme2Local(){
		LocalUserInfo localUserInfo = new LocalUserInfo();
		localUserInfo.setName(this.remoteUserInfo.getName());
		localUserInfo.setAddress(this.remoteUserInfo.getAddress());
		return localUserInfo;
	}
}
