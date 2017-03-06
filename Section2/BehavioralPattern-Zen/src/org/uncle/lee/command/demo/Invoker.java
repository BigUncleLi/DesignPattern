package org.uncle.lee.command.demo;

public class Invoker {
	private Command command;
	private static Invoker invoker;
	
	public void setCommand(Command command){
		this.command = command;
	}

	public void invoke(){
		command.execute();
	}
	
	public static Invoker obtain(Command command){
		if(invoker == null){
			invoker = new Invoker();
		}
		invoker.setCommand(command);
		return invoker;
	}
}
