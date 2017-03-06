package org.uncle.lee.adapter.demo.my;

import org.uncle.lee.adapter.demo.ConcreteRemoteUser;
import org.uncle.lee.adapter.demo.my.bean.RemoteUserInfo;

public class MyConcreteRemoteUser extends ConcreteRemoteUser{
	public RemoteUserInfo getRemoteUserInfo(){
		RemoteUserInfo remoteUserInfo = new RemoteUserInfo();
		remoteUserInfo.setName(super.getUserInfo().get(ConcreteRemoteUser.USER_NAME_TAG));
		remoteUserInfo.setAddress(super.getUserInfo().get(ConcreteRemoteUser.USER_ADDRESS_TAG));
		remoteUserInfo.setJob(super.getUserInfo().get(ConcreteRemoteUser.USER_JOB_TAG));
		return remoteUserInfo;
	}

}
