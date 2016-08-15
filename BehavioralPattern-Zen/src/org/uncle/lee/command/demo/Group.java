package org.uncle.lee.command.demo;

public interface Group {
	public abstract void find(String msg);
	public abstract void add(String msg);
	public abstract void delete(String msg);
	public abstract void change(String msg);
	public abstract void plan(String msg);
}
