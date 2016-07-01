package org.uncle.lee.factory.abs;

public class WomanFactory implements AbstractFactory {
	@Override
	public Human createBlackHuman() {
		return new ConcreteBlackWoman();
	}

	@Override
	public Human createWhiteHuman() {
		return new ConcreteWhiteWoman();
	}

	@Override
	public Human createYellowHuman() {
		return new ConcreteYellowWoman();
	}
}
