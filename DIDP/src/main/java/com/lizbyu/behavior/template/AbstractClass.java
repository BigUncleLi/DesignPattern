package com.lizbyu.behavior.template;

public abstract class AbstractClass {
    public abstract void abstractMethod0();
    public abstract void abstractMethod1();

    public void templateMethod() {
        abstractMethod0();
        abstractMethod1();
    }
}
