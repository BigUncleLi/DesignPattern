package decorator;


public class Client {
    public static void main(String[] args) {
//        Component component = new ConcreateComponent();
//        component.operator();

        Component component = new ConcreteDecoratorA(new ConcreateComponentA());
        component.operator();
    }
}
