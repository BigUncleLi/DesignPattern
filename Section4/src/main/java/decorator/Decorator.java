package decorator;

public abstract class Decorator implements Component{
    protected Component component;
    Decorator(Component component) {
        this.component = component;
    }


}
