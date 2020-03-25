//
//  main.cpp
//  builder
//
//  Created by AustinLee on 2019/12/6.
//  Copyright © 2019 lee. All rights reserved.
//

#include <iostream>

class Product {
public:
    int a;
    int b;
};

class Builder {
public:
    virtual void setA() = 0;
    virtual void setB() = 0;
};

class BuilderA : Builder {
public:
    void setA() {
        a = 1;
    }
    void setB() {
        b = 2;
    }

private:
};

class BuilderB : Builder {
public:
    void setA() {
        a = 2;
    }
    void setB() {
        b = 1;
    }
};

class Dirctor {
private:
    Builder *builder;
public:
    Dirctor(Builder builder) {
        this->builder = &builder;
    }
    
    void update() {
        this->builder->setA();
        this->builder->setB();
    }
};


int main(int argc, const char * argv[]) {
    // insert code here...
    std::cout << "Hello, World!\n";
    return 0;
}
