package command;

import decorator.GarlicSauce;
import decorator.Ketchup;
import factorymethod.Burger;
import factorymethod.KitchenFactory;

public class Chef {
    public void makeBurger(String burgerType) {
        Burger burger = KitchenFactory.makeBurger(burgerType);
        burger.make();
        burger.addSauce(new Ketchup(burger));
        burger.addSauce(new GarlicSauce(burger));
        burger.serve();
    }
}
