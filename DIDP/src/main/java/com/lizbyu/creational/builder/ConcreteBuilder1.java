package com.lizbyu.creational.builder;

public class ConcreteBuilder1 implements Builder {
    private final Product product = new Product();

    @Override
    public void buildA(String a) {
        product.setName("1-" + a);
    }

    @Override
    public void buildB(int b) {
        product.setPrice(b + 100);
    }

    @Override
    public void buildC(boolean c) {
        product.setExpired(c);
    }

    @Override
    public Product getResult() {
        return product;
    }
}
