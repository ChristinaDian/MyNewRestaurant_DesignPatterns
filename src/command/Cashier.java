package command;

import java.util.Stack;

public class Cashier {
    private Chef chef;
    private Stack<Command> commandHistory;

    public Cashier(Chef chef) {
        this.chef = chef;
        this.commandHistory = new Stack<>();
    }

    public void takeOrder(String burgerType) {
        Command command = new MakeBurgerCommand(chef, burgerType);
        command.execute();
        commandHistory.push(command);
    }

    public void undoLastOrder() {
        if (!commandHistory.isEmpty()) {
            Command lastCommand = commandHistory.pop();
            lastCommand.undo();
        }
    }
}
