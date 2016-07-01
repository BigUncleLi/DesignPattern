package org.uncle.lee.factory.abs;

public class ManFactory implements AbstractFactory {
	@Override
	public Human createBlackHuman() {
		return new ConcreteBlackMan();
	}

	@Override
	public Human createWhiteHuman() {
		return new ConcreteWhiteMan();
	}

	@Override
	public Human createYellowHuman() {
		return new ConcreteYelloMan();
	}
}
