package org.uncle.lee.composite.demo;

import java.util.ArrayList;
import java.util.List;

import org.uncle.lee.utils.LogUtils;

public class CompositeImpl implements Composite {
	private static final String TAG = CompositeImpl.class.getSimpleName();
	private String name;
	private List<Employee> employeeChildren;

	public CompositeImpl(String name) {
		this.name = name;
		employeeChildren = new ArrayList<Employee>();
	}

	@Override
	public void showInfo() {
		LogUtils.d(TAG, "composite - " + this.toString());
	}

	@Override
	public boolean addChild(Employee employee) {
		return employeeChildren.add(employee);
	}

	@Override
	public boolean remove(Employee employee) {
		return employeeChildren.remove(employee);
	}

	@Override
	public List<Employee> getChildren() {
		return employeeChildren;
	}

	@Override
	public String toString() {
		return "CompositeImpl [name=" + name + "]";
	}

}
