package com.lizbyu.behavior.template;

public interface AbstractClass {
    void abstractMethod0();
    void abstractMethod1();

    default void templateMethod() {
        abstractMethod0();
        abstractMethod1();
    }
}
