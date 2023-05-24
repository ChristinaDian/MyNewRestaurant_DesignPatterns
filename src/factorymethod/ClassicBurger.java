package factorymethod;

import decorator.Sauce;

public class ClassicBurger extends Burger{
    @Override
    public void make() {
        System.out.println("Make Classic Burger.");
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
