package org.uncle.lee.composite.demo;

import java.util.List;

public interface Composite extends Employee{
	public abstract boolean addChild(Employee employee);
	public abstract boolean remove(Employee employee);
	public abstract List<Employee> getChildren();
}
