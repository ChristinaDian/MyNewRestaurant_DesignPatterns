package factorymethod;

import decorator.Sauce;

public class KingBurger extends Burger{
    @Override
    public void make() {
        System.out.println("Make King Burger.");
    }

    @Override
    public void addSauce(Sauce sauce) {
        // Implementation specific to the type of burger
    }

    @Override
    public void serve() {
        // Implementation specific to the type of burger
    }
}
