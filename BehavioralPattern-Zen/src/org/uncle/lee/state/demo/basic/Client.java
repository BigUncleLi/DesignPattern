package org.uncle.lee.state.demo.basic;

public class Client {
	public static void main(String[] args) {
		Lift lift = new LiftImpl();
		lift.stop();
		lift.closeDoor();
		lift.run();
		lift.stop();
	}
}
