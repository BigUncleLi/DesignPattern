package chain;

public abstract class Handler {
    private Handler successorHandler;

    public void setSuccessor(Handler successorHandler) {
        this.successorHandler = successorHandler;
    }
    public Handler getSuccessor() {
        return successorHandler;
    }

    public abstract void handleRequest();
}
