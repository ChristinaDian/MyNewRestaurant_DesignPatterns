package command;

public class CommandMain {
    public static void main(String[] args) {
        Chef chef = new Chef();
        Cashier cashier = new Cashier(chef);

        cashier.takeOrder("Classic");
        cashier.takeOrder("Vegetarian");

        cashier.undoLastOrder();
    }
}
