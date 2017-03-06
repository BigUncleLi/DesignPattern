package org.uncle.lee.command.demo;

public abstract class Command {
	private Designer designer;
	private Coder coder;
	private Product product;

	public Command(){
		designer = new Designer();
		coder = new Coder();
		product = new Product();
	}

	public Designer getDesigner() {
		return designer;
	}

	public Coder getCoder() {
		return coder;
	}

	public Product getProduct() {
		return product;
	}
	
	public abstract void execute();
}
