package decorator;

import factorymethod.Burger;

public class Ketchup extends Sauce{
    public Ketchup(Burger burger) {
        super(burger);
    }

    @Override
    public void make() {
        burger.make();
    }

    @Override
    public void addSauce(Sauce sauce) {
        burger.addSauce(sauce);
    }

    @Override
    public void serve() {
        burger.serve();
        System.out.println("Add Ketchup Sauce.");
    }
}
