package org.uncle.lee.facade.origin.business;

import org.uncle.lee.facade.origin.SubSystemA;

public class Facade {
	private SubSystemA subSystemA;
	private Complex complex;

	public Facade() {
		subSystemA = new SubSystemA();
		complex = new Complex();
	}

	public void operateA() {
		subSystemA.operateA();
	}

	public void operateB() {
		// let complex to handle business
		complex.complexMethod();
	}
}
