package chain;


public class ConcreteHandlerA extends Handler {
    public ConcreteHandlerA() {
    }

    @Override
    public void handleRequest() {
        if (true) {
            // ok
        } else {
            getSuccessor().handleRequest();
        }
    }
}
