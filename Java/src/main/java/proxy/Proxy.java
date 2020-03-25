package proxy;

public class Proxy implements Subject{
    private Subject subject;
    Proxy() {
        subject = new RealSubject();
    }
    @Override
    public void request() {
        doBefore();
        subject.request();
        doNext();
    }

    private void doBefore() {
    }

    private void doNext() {
    }
}
