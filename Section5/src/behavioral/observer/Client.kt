package behavioral.observer

fun main(args: Array<String>) {
    testObserver()
    testObserverLambda()
}

fun testObserver() {
    val subject = Subject()
    subject.registeObserver(object : Observer {
        override fun update() {
            println("observer update")
        }
    })
    subject.notifyObserver()
    subject.unRegisteObserver()
    subject.notifyObserver()
}

fun testObserverLambda() {
    val subject = SubjectLambda()
    subject.registeObserver {
        println("observer lambda update")
    }
    subject.notifyObserver()
    subject.unRegisteObserver()
    subject.notifyObserver()
}