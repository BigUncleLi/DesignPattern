package org.uncle.lee.command;

import java.util.ArrayList;
import java.util.List;

public class Invoker {
	private List<Command> commandList;
	
	public Invoker(){
		commandList = new ArrayList<Command>();
	}
	
	public boolean addCommand(Command command){
		return commandList.add(command);
	}
	
	public boolean removeCommand(Command command){
		return commandList.remove(command);
	}
	
	public void invoke(){
		for(Command command : commandList){
			command.execute();
		}
	}
}
