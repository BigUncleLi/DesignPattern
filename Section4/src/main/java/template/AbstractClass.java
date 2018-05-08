package template;

public abstract class AbstractClass {
    public abstract void step1();
    public abstract void step2();
    public void execute(){
        step1();
        step2();
    }
}
