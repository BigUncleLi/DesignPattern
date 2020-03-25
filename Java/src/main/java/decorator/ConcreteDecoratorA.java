package decorator;

public class ConcreteDecoratorA extends Decorator{

    ConcreteDecoratorA(Component component) {
        super(component);
    }

    @Override
    public void operator() {
        component.operator();
        // todo...
    }
}
