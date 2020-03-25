package structural.facade

class Facade {
    var subSystemA : SubSystemA? = null
    var subSystemB : SubSystemB? = null
    var subSystemC : SubSystemC? = null

    fun doAB() {
        subSystemA!!.operatorA()
        subSystemB!!.operatorB()
    }

    fun doBC() {
        subSystemB!!.operatorB()
        subSystemC!!.operatorC()
    }
}