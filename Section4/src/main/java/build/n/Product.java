package build.n;

public class Product {
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    private int x;

    public static Builder getBuilder(){
        return new Builder();
    }

}
