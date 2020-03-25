package factory;

public class Client {
    public static void main(String[] args) {
        Factory factory = new ConcreateFactoryA();
        Product product = factory.create();
        product.use();
    }
}
