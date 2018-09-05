package behavioral.observer

@Suppress("unused")
class SubjectLambda {
    val observerList : MutableList<() -> Unit> = mutableListOf()

    fun registeObserver(updateObserver : () -> Unit) : Boolean {
        return if (!this.observerList.contains(updateObserver)) {
            this.observerList.add(updateObserver)
        } else {
            false
        }
    }

    fun registeObserver(updateObserverList : List<() -> Unit>) : Boolean {
        return if (!this.observerList.containsAll(updateObserverList)) {
            this.observerList.addAll(updateObserverList)
        } else {
            false
        }
    }

    fun unRegisteObserver(updateObserver : () -> Unit) : Boolean {
        return if (this.observerList.contains(updateObserver)) {
            this.observerList.remove(updateObserver)
        } else {
            false
        }
    }

    fun unRegisteObserver(updateObserverList : List<() -> Unit>) : Boolean {
        var hasErrorObserver = false
        updateObserverList.forEach {
            if (!unRegisteObserver(it)) {
                hasErrorObserver = true
            }
        }
        return hasErrorObserver
    }

    fun unRegisteObserver() {
        this.observerList.clear()
    }

    fun notifyObserver(updateObserver : () -> Unit) {
        if (this.observerList.contains(updateObserver)) {
            updateObserver()
        }
    }

    fun notifyObserver(updateObserverList : List<() -> Unit>) {
        updateObserverList.forEach {
            notifyObserver(it)
        }
    }

    fun notifyObserver() {
        this.observerList.forEach {
            notifyObserver(it)
        }
    }
}