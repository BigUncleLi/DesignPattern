package com.lizbyu.behavior.observer;

import com.lizbyu.utils.log.LogUtils;

import java.util.HashSet;
import java.util.Set;

public class Subject {
    private static final String TAG = "Subject";
    private Set<Observer> observers = new HashSet<>();

    public void registerSubject(Observer observer) {
        observers.add(observer);
    }

    public void unRegisterSubject(Observer observer) {
        if (observers.contains(observer)) {
            observers.remove(observer);
        } else {
            throw new IllegalArgumentException(observer + " is not registered !");
        }
    }

    public void doAction() {
        LogUtils.d(TAG, "do action ...");
        notifyObserver();
    }

    private void notifyObserver() {
        for (Observer observer : observers) {
            observer.response();
        }
    }
}
