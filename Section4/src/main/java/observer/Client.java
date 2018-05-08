package observer;

public class Client {
    public static void main(String[] args) {
        Object object = new Object() {
            @Override
            public void update() {

            }
        };
        Subject subject = new ConcreteSubject();
        subject.attach(object);
        subject.attach(object);
        subject.attach(object);
        subject.attach(object);
        subject.notifyObserver();
    }
}
