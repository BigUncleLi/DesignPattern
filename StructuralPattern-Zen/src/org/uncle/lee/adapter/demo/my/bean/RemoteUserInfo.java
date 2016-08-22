package org.uncle.lee.adapter.demo.my.bean;

public class RemoteUserInfo {
	private String name;
	private String address;
	private String job;

	public RemoteUserInfo() {
		super();
	}

	public RemoteUserInfo(String name, String address, String job) {
		super();
		this.name = name;
		this.address = address;
		this.job = job;
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

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	@Override
	public String toString() {
		return "RemoteUserInfo [name=" + name + ", address=" + address
				+ ", job=" + job + "]";
	}

}
