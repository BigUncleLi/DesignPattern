//
//  main.cpp
//  SimpleFactory
//
//  Created by AustinLee on 2019/7/25.
//  Copyright © 2019 lee. All rights reserved.
//

#include <iostream>
#include <stdexcept>

class Product {
public:
    virtual ~Product() {}
    
    virtual void show() = 0;
};

class ConcreateProductA : public Product {
public:
    ~ConcreateProductA() {}
    
    void show() {
        std::cout << "product A" << std::endl;
    }
};

class ConcreateProduceB : public Product {
public:
    ~ConcreateProduceB() {}
    
    void show() {
        std::cout << "product B" << std::endl;
    }
};

enum ProductType {
    A, B
};

class Factory {
public:
    Product *create(ProductType type) {
        if (type == A) {
            return new ConcreateProductA();
        } else if (type == B) {
            return new ConcreateProduceB();
        } else {
            throw std::invalid_argument("Unable parse product type !");
        }
    }
};

int main(int argc, const char * argv[]) {
    Factory *f = new Factory();
    
    Product *productA = f->create(A);
    productA->show();
    Product *productB = f->create(B);
    productB->show();
    
    delete f;
    delete productA;
    delete productB;
    
    return 0;
}

