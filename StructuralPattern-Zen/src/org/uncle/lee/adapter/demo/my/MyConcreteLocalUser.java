package org.uncle.lee.adapter.demo.my;

import org.uncle.lee.adapter.demo.my.bean.LocalUserInfo;

public class MyConcreteLocalUser extends ConcreteLocalUser {
	public LocalUserInfo getLocalUserInfo() {
		LocalUserInfo localUserInfo = new LocalUserInfo();
		localUserInfo.setName(super.getName());
		localUserInfo.setAddress(super.getAddress());
		return localUserInfo;
	}
}
