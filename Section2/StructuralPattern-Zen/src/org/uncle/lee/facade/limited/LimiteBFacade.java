package org.uncle.lee.facade.limited;

import org.uncle.lee.facade.origin.Facade;

public class LimiteBFacade {
	private Facade facade;

	public LimiteBFacade() {
		this.facade = new Facade();
	}

	public void operateB() {
		this.facade.operateB();
	}
}
