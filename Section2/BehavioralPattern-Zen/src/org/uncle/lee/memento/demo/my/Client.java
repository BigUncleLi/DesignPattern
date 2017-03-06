package org.uncle.lee.memento.demo.my;

public class Client {
	public static void main(String[] args) {
		NiCo nico = new NiCo();
		Girl girl = new Girl();
		nico.followGirl(girl);
		
		nico.resetStatus();
		nico.followGirl(girl);
	}
}
