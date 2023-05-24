package command;

public class MakeBurgerCommand implements Command{
    private Chef chef;
    private String burgerType;

    public MakeBurgerCommand(Chef chef, String burgerType) {
        this.chef = chef;
        this.burgerType = burgerType;
    }

    @Override
    public void execute() {
        chef.makeBurger(burgerType);
    }

    @Override
    public void undo() {

    }
}
