package build;

public abstract class Builder {

    protected Product product = new Product();

    abstract void buildA();

    abstract void buildB();

    abstract void buildC();

    Product getResult(){
        return product;
    }
}
