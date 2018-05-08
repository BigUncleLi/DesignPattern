package adapter;

public class Adapter implements Target{
    private Adaptee adaptee;
    Adapter() {
        adaptee = new Adaptee();
    }

    @Override
    public void request() {
        int i = adaptee.speciRequest();
        i++;
        //??
    }
}
