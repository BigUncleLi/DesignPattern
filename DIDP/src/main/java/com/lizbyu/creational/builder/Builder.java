package com.lizbyu.creational.builder;

public interface Builder {
    void buildA(String a);
    void buildB(int b);
    void buildC(boolean c);
    Product getResult();
}
