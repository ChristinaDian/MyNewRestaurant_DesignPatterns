package factorymethod;

import decorator.Sauce;

public abstract class Burger {
    public abstract void make();

    public abstract void addSauce(Sauce sauce);

    public abstract void serve();
}
