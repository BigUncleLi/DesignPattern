package org.uncle.lee.facade;

public class Facade {

	private SubSystemA systemA;
	private SubSystemB systemB;
	private SubSystemC systemC;

	public Facade(){
		systemA = new SubSystemA();
		systemB = new SubSystemB();
		systemC = new SubSystemC();
	}
	
	public void doAB(){
		systemA.operate();
		systemB.operate();
		printBlankLine();
	}
	
	public void doBC(){
		systemB.operate();
		systemC.operate();
		printBlankLine();
	}
	
	public void doCA(){
		systemC.operate();
		systemA.operate();
		printBlankLine();
	}
	
	private void printBlankLine(){
		System.out.println("\n");
	}
}
