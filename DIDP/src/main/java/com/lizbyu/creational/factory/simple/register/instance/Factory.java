package com.lizbyu.creational.factory.simple.register.instance;

import java.util.HashMap;
import java.util.Map;

public class Factory {
    public static Factory instance;
    private final Map<String, Product> registeredProduct = new HashMap<>();

    private Factory() {}

    public static Factory instance() {
        if (instance == null) {
            synchronized (Factory.class) {
                if (instance == null) {
                    instance = new Factory();
                }
            }
        }
        return instance;
    }

    public void registerProduct(String productID, Product product) {
        registeredProduct.put(productID, product);
    }

    public Product createProduct(String productID) {
        if (!registeredProduct.containsKey(productID)) {
            throw new IllegalArgumentException("productID-" + productID + " must be registered first!");
        }
        return registeredProduct.get(productID).createProduct();
    }
}