package creational.singleton.hungry

/**
 * hungry singleton
 */
object HungrySingleton {
    fun getCurrentInstance() : String{
        println(this)
        return this.toString()
    }
}