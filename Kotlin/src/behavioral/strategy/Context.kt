package behavioral.strategy

class Context {
    var mStrategy : Strategy? = null

    fun setStrategy(strategy: Strategy?) {
        mStrategy = strategy
    }

    fun algorithm() {
        mStrategy!!.algorithm()
    }
}