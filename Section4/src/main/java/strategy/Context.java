package strategy;

public class Context implements Action{
    private Action stragety;
    public void setStragety(Action stragety) {
        this.stragety = stragety;
    }

    @Override
    public void doAction() {
        stragety.doAction();
    }
}
