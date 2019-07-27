//
//  main.cpp
//  singleton
//
//  Created by AustinLee on 2019/7/27.
//  Copyright © 2019 lee. All rights reserved.
//

#include <iostream>

class Singleton {
public:
    // could be private
    Singleton(const Singleton &) = delete;
    Singleton& operator=(const Singleton &) = delete;
    
    static Singleton* getInstance() {
        if (!instance) {
            instance = new Singleton();
        }
        return instance;
    }
    
    static void destory() {
        if (instance) {
            delete instance;
        }
    }
private:
    Singleton(){}
    static Singleton *instance;
};

Singleton* Singleton::instance = nullptr;

int main(int argc, const char * argv[]) {
    Singleton *s0 = Singleton::getInstance();
    std::cout << s0 << std::endl;
    Singleton *s1 = Singleton::getInstance();
    std::cout << s1 << std::endl;
    
    s0->destory();
//    s1->destory(); // pointer being freed was not allocated
    return 0;
}
