package decorator;

import factorymethod.Burger;
import factorymethod.KingBurger;

public class DecoratorMain {
    public static void main(String[] args) {
        Burger burger = new KingBurger();
        burger.make();
        burger.addSauce(new Ketchup(burger));
        burger.addSauce(new GarlicSauce(burger));
        burger.serve();
    }
}
