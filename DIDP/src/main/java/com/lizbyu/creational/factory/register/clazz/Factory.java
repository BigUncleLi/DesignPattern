package com.lizbyu.creational.factory.register.clazz;

import java.lang.reflect.Constructor;
import java.util.HashMap;
import java.util.Map;

public final class Factory {
    private static Factory instance;
    private Map<String, Class> registeredProducts = new HashMap<>();

    private Factory() {}

    public static synchronized Factory instance() {
        if (instance == null) {
            instance = new Factory();
        }
        return instance;
    }

    public void registerProduct(String productID, Class productClazz) {
        registeredProducts.put(productID, productClazz);
    }

    public Product createProduct(String productID) {
        if (!registeredProducts.containsKey(productID)) {
            throw new IllegalArgumentException("productID-" + productID + " must be registered first!");
        }

        Class<Object> productClass = registeredProducts.get(productID);
        try {
            Constructor<Object> constructor = productClass.getDeclaredConstructor();
            return (Product) constructor.newInstance();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
