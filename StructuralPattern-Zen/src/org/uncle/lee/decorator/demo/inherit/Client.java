package org.uncle.lee.decorator.demo.inherit;

public class Client {
	public static void main(String[] args) {
		testF1();
		testF21();
	}

	private static void testF1(){
		SchoolReport f1Report = new F1MyReport();
		f1Report.show();
	}
	
	private static void testF21() {
		SchoolReport f21Report = new F21MyReport();
		f21Report.show();
	}
}
