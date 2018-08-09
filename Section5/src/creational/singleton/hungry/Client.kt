package creational.singleton.hungry

import kotlin.concurrent.thread


val hungrySingleTonInstance = HungrySingleton.getCurrentInstance()

fun main(args: Array<String>) {
    for (i in 1..100) {
        testHungrySingleTon()
    }
}

fun testHungrySingleTon() {
    thread(start = true) {
        val currentInstance = HungrySingleton.getCurrentInstance()
        if (hungrySingleTonInstance != currentInstance) {
            throw RuntimeException("current instance is not equals to hungry singleton instance !")
        }
    }
}