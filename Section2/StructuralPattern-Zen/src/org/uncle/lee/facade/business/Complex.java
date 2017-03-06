package org.uncle.lee.facade.business;

import org.uncle.lee.facade.origin.SubSystemB;
import org.uncle.lee.facade.origin.SubSystemC;

public class Complex {
	private SubSystemB subSystemB;
	private SubSystemC subSystemc;

	public Complex() {
		subSystemB = new SubSystemB();
		subSystemc = new SubSystemC();
	}

	public void complexMethod() {
		subSystemB.operateB();
		subSystemc.operateC();
	}
}
