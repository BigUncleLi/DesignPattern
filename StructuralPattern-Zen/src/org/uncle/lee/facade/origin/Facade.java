package org.uncle.lee.facade.origin;

public class Facade {
	private SubSystemA systemA;
	private SubSystemB systemB;
	private SubSystemC systemC;
	
	public Facade(){
		systemA = new SubSystemA();
		systemB = new SubSystemB();
		systemC = new SubSystemC();
	}
	
	public void operateA(){
		this.systemA.operateA();
	}
	
	public void operateB(){
		this.systemB.operateB();
	}
	
	public void operateC(){
		this.systemC.operateC();
	}

}
