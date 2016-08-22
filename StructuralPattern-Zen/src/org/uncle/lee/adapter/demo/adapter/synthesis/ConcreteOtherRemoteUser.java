package org.uncle.lee.adapter.demo.adapter.synthesis;

public class ConcreteOtherRemoteUser implements OtherRemoteUser{
	private static final String NEW_ADDRESS = "newRemoteAddress";

	@Override
	public String getNewAddress() {
		return NEW_ADDRESS;
	}
}
