package observer;

import java.util.ArrayList;
import java.util.List;

public class ConcreteSubject implements Subject{
    private List<Object> objects = new ArrayList<>();

    @Override
    public void attach(Object object) {
        if (!objects.contains(object)) {
            objects.add(object);
        }
    }

    @Override
    public void detach(Object object) {
        if (objects.contains(object)) {
            objects.remove(object);
        }
    }

    @Override
    public void notifyObserver() {
        objects.forEach(Object::update);
    }
}
