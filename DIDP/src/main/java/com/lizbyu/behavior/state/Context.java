package com.lizbyu.behavior.state;

public class Context {
    private State mState;

    public Context() {
        this.mState = new ConcreteStateA();
    }

    public State getState() {
        return this.mState;
    }

    public void setState(State mState) {
        this.mState = mState;
    }

    public void handle() {
        this.mState.handle(this);
    }
}
