//
//  main.cpp
//  factory
//
//  Created by AustinLee on 2019/7/26.
//  Copyright © 2019 lee. All rights reserved.
//

#include <iostream>

class Product {
public:
    virtual ~Product() {}
    virtual void show() = 0;
};

class ConcreateProductA : public Product {
public:
    ~ConcreateProductA() {}
    
    void show() {
        std::cout << "concreate A" << std::endl;
    }
};

class ConcreateProductB : public Product {
public:
    ~ConcreateProductB() {}
    
    void show() {
        std::cout << "concreate B" << std::endl;
    }
};

class Factory {
public:
    virtual ~Factory(){}
    virtual Product *create() = 0;
};

class ConcreateFactoryA : public Factory {
public:
    ~ConcreateFactoryA() {}
    
    Product *create() {
        return new ConcreateProductA();
    }
};

class ConcreateFactoryB : public Factory {
public:
    ~ConcreateFactoryB(){}
    
    Product *create() {
        return new ConcreateProductB();
    }
};

int main(int argc, const char * argv[]) {
    Factory *factoryA = new ConcreateFactoryA();
    Product *productA = factoryA->create();
    productA->show();
    
    Factory *factoryB = new ConcreateFactoryB();
    Product *productB = factoryB->create();
    productB->show();
    
    delete factoryA;
    delete productA;
    
    delete factoryB;
    delete productB;
    return 0;
}
