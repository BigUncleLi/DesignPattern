package build.n;

public class Client {
    public static void main(String[] args) {
        Product product = Product.getBuilder().setXX(1).build();
    }
}
