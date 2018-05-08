package template;

public class Client {
    public static void main(String[] args) {
        AbstractClass abstractClass = new ConcreteClassA();
        abstractClass.execute();

        new AbstractClass(){
            @Override
            public void step1() {

            }

            @Override
            public void step2() {

            }
        }.execute();
    }
}
