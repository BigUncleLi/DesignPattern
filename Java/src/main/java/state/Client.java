package state;

public class Client {
    public static void main(String[] args) {
        Context context = new Context();
        context.changeState(new StateA());
        context.request();
        context.changeState(new StateB());
        context.request();
    }
}
