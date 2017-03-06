package org.uncle.lee.decorator.demo.decorator;

import org.uncle.lee.decorator.demo.SchoolReport;

public abstract class Decorator implements SchoolReport {
	protected SchoolReport myReport;
	public Decorator(SchoolReport myReport){
		this.myReport = myReport;
	}
}
