package decorator;

import factorymethod.Burger;

public abstract class Sauce extends Burger {
    protected Burger burger;

    public Sauce(Burger burger) {
        this.burger = burger;
    }
}
