package org.uncle.lee.observer.jdk;

import java.util.List;
import java.util.Observable;

import org.uncle.lee.utils.LogUtils;

public class Subject extends Observable {
	private static final String TAG = Subject.class.getSimpleName();
	
	public void registeObservers(List<Observer> observers){
		for(Observer observer : observers){
			super.addObserver(observer);
		}
	}
	
	public void registeObserver(Observer observer){
		super.addObserver(observer);
	}
	
	public void unRegisterObservers(List<Observer> observers){
		for(Observer observer : observers){
			super.deleteObserver(observer);
		}
	}
	
	public void unRegisteObserver(Observer observer){
		super.deleteObserver(observer);
	}
	
	public void cleanObserver(){
		super.deleteObservers();
	}
	
	public void notifyObserver(){
		super.notifyObservers();
	}
	
	public void opreate(){
		LogUtils.d(TAG, "opreate");
		notifyObserver();
	}
	
	public void changeAndOpreate(){
		LogUtils.d(TAG, "changeAndOpreate");
		super.setChanged();
		notifyObserver();
	}
}
