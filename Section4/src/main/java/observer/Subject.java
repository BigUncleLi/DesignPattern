package observer;

public interface Subject {
    void attach(Object object);
    void detach(Object object);
    void notifyObserver();
}
