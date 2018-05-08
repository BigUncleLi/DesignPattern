package build;

public class Director {
    Builder builder = null;
    public void setBuilder(Builder builder){
        this.builder = builder;
    }

    public Product construct() {
        builder.buildA();
        builder.buildB();
        builder.buildC();
        return builder.getResult();
    }
}
