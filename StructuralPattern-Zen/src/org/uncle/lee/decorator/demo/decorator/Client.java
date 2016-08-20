package org.uncle.lee.decorator.demo.decorator;

import org.uncle.lee.decorator.demo.MyReport;
import org.uncle.lee.decorator.demo.SchoolReport;

public class Client {
	public static void main(String[] args) {
		SchoolReport myReport = new MyReport();
		
		testF1(myReport);
		testF21(myReport);
	}

	private static void testF1(SchoolReport myReport){
		F1Decorator f1Decorator = new F1Decorator(myReport);
		f1Decorator.show();
	}
	
	private static void testF21(SchoolReport myReport) {
		F2Decorator f2Decorator = new F2Decorator(myReport);
		f2Decorator.show();
		F1Decorator f1Decorator = new F1Decorator(myReport);
		f1Decorator.show();
	}
}
