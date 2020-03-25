//
//  main.cpp
//  abstract-factory
//
//  Created by AustinLee on 2019/7/26.
//  Copyright © 2019 lee. All rights reserved.
//

#include <iostream>

class ProductA {
public:
    virtual ~ProductA(){}
    virtual void show() = 0;
};

class ProductA0 : public ProductA {
public:
    ~ProductA0() {}
    
    void show() {
        std::cout << "product A0" << std::endl;
    }
};

class ProductA1 : public ProductA {
public:
    ~ProductA1() {}
    
    void show() {
        std::cout << "Product A1" << std::endl;
    }
};

class ProductB {
public:
    virtual ~ProductB(){}
    virtual void show() = 0;
};

class ProductB0 : public ProductB {
public:
    ~ProductB0(){}
    
    void show() {
        std::cout << "Product B0" << std::endl;
    }
};

class ProductB1 : public ProductB {
public:
    ~ProductB1(){}
    void show() {
        std::cout << "Product B1" << std::endl;
    }
};

class Factory {
public:
    virtual ~Factory(){}
    virtual ProductA *createProductA() = 0;
    virtual ProductB *createProductB() = 0;
};

class ConcreateFactory0 : public Factory{
public:
    ~ConcreateFactory0() {}
    ProductA *createProductA() {
        return new ProductA0();
    }
    ProductB *createProductB() {
        return new ProductB0();
    }
};

class ConcreateFactory1 : public Factory {
public:
    ~ConcreateFactory1() {}
    ProductA *createProductA() {
        return new ProductA1();
    }
    ProductB *createProductB() {
        return new ProductB1();
    }
};

int main(int argc, const char * argv[]) {
    Factory *factory0 = new ConcreateFactory0();
    ProductA *productA0 = factory0->createProductA();
    productA0->show();
    ProductB *productB0 = factory0->createProductB();
    productB0->show();
    
    Factory *factory1 = new ConcreateFactory1();
    ProductA *productA1 = factory1->createProductA();
    productA1->show();
    ProductB *productB1 = factory1->createProductB();
    productB1->show();
    
    delete factory0;
    delete productA0;
    delete productB0;
    
    delete factory1;
    delete productA1;
    delete productB1;
    
    return 0;
}
