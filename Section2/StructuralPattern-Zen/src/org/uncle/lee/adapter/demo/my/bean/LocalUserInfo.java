package org.uncle.lee.adapter.demo.my.bean;

public class LocalUserInfo {
	private String name;
	private String address;

	public LocalUserInfo() {
		super();
	}

	public LocalUserInfo(String name, String address) {
		super();
		this.name = name;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "LocalUserInfo [name=" + name + ", address=" + address + "]";
	}

}
