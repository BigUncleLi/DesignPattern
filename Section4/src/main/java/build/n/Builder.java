package build.n;

public class Builder {
    private  Product product;

    Builder() {
        Product product = new Product();
    }

    public Product build() {
        return product;
    }

    public Builder setXX(int x) {
        product.setX(x);
        return this;
    }
}
