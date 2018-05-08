package strategy;

public class Client {
    public static void main(String[] args) {
        Context context = new Context();
        context.setStragety(new StrategyA());
        context.doAction();
    }
}
