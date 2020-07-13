package com.lizbyu.creational.builder;

public class Director {

    public void constructDefault(Builder builder) {
        builder.buildA("default");
        builder.buildB(-1);
        builder.buildC(false);
    }

}
