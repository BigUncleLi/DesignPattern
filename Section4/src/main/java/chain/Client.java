package chain;

public class Client {
    public static void main(String[] args) {
        Handler handler = new ConcreteHandlerA();
        Handler handler1 = new ConcreteHandlerA();
        handler.setSuccessor(handler1);
        handler.handleRequest();
    }
}
