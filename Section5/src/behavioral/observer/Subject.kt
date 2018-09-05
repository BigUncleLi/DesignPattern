package behavioral.observer

class Subject {
    private val observerList : MutableList<Observer> = mutableListOf()

    fun registeObserver(observer: Observer) : Boolean {
        return if (!observerList.contains(observer)) {
            this.observerList.add(observer)
        } else {
            false
        }
    }

    fun registeObserver(observerList : List<Observer>) : Boolean {
        return if (!this.observerList.containsAll(observerList)) {
            this.observerList.addAll(observerList)
        } else {
            false
        }
    }

    fun unRegisteObserver(observer: Observer) : Boolean {
        return if (observerList.contains(observer)) {
            this.observerList.remove(observer)
        } else {
            false
        }
    }

    fun unRegisteObserver(observerList: List<Observer>) : Boolean {
        return if (this.observerList.containsAll(observerList)) {
            this.observerList.removeAll(observerList)
        } else {
            false
        }
    }

    fun unRegisteObserver() {
        this.observerList.clear()
    }

    fun notifyObserver() {
        this.observerList.forEach {
            it.update()
        }
    }

}