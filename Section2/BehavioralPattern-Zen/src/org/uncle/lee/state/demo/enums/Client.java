package org.uncle.lee.state.demo.enums;

import org.uncle.lee.state.demo.Lift;

public class Client {
	public static void main(String[] args) {
		Lift lift = new LiftImpl();
		lift.stop();
		lift.closeDoor();
		lift.run();
		lift.stop();
	}
}
