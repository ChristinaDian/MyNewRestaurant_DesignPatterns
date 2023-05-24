package decorator;

import factorymethod.Burger;

public class GarlicSauce extends Sauce{
    public GarlicSauce(Burger burger) {
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
        System.out.println("Add Garlic Sauce.");
    }
}
