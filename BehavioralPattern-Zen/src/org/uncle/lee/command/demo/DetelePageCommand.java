package org.uncle.lee.command.demo;


public class DetelePageCommand extends Command{
	private static final String PAGE_INFO = "page 3688";

	@Override
	public void execute() {
		super.getProduct().delete(PAGE_INFO);
		super.getDesigner().delete(PAGE_INFO);
		super.getCoder().delete(PAGE_INFO);
	}
}
