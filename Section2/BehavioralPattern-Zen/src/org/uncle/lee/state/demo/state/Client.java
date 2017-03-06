package org.uncle.lee.state.demo.state;

public class Client {
	public static void main(String[] args) {
		Context context = new Context(new CloseState());

		context.closeDoor();
		context.openDoor();
		context.closeDoor();
		context.run();
		// this method'll throw exception because it's forbidden to open door -
		// - during runnig
		// context.openDoor();
		context.stop();
	}
}
