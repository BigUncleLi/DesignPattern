package creational.singleton.lazy

class LazySingleton private constructor() {
    companion object {
        val instance : LazySingleton by lazy { LazySingleton() }
    }
}