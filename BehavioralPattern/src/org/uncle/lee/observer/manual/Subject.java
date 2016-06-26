package org.uncle.lee.observer.manual;

import java.util.ArrayList;
import java.util.List;

import org.uncle.lee.utils.LogUtils;

public class Subject {
	private static final String TAG = Subject.class.getSimpleName();
	private List<Observer> observers;
	
	public Subject(){
		observers = new ArrayList<Observer>();
	}
	
	public boolean registeObservers(List<Observer> observers){
		for(Observer observer : observers){
			boolean registeSuccessful = registeObserver(observer);
			if(!registeSuccessful){
				return false;
			}
		}
		return true;
	}
	
	public boolean registeObserver(Observer observer){
		if(!isObserverExist(observer)){
			return observers.add(observer);
		}else {
			return false;
		}
		
	}
	
	private boolean isObserverExist(Observer observer){
		return observers.contains(observer);
	}
	
	public boolean unregisteObservers(List<Observer> observers){
		for(Observer observer : observers){
			boolean unregisteSuccessful = unregisteObserver(observer);
			if(!unregisteSuccessful){
				return false;
			}
		}
		return true;
	}
	
	public boolean unregisteObserver(Observer observer){
		if(isObserverExist(observer)){
			return observers.remove(observer);
		}else {
			return false;
		}
	}
	
	public void cleanObserver(){
		observers.clear();
	}
	
	public void notifyObserver(Observer observer, Object msg){
		observer.update(observer, msg);
	}
	
	public void notifyAllObjects(){
		for(Observer observer : observers){
			observer.update(observer);
		}
	}
	
	public void opreate(){
		LogUtils.d(TAG, "opreate");
		notifyAllObjects();
	}
}
