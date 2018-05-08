package factory;

public class ConcreateFactoryA implements Factory{
    @Override
    public Product create() {
        return new ConcreateProductA();
    }
}
