package factorymethod;

public class FactoryMain {
    public static void main(String[] args) {
        Burger burger1 = KitchenFactory.makeBurger("King");
        burger1.make();
        burger1.serve();

        Burger burger2 = KitchenFactory.makeBurger("Classic");
        burger2.make();
        burger2.serve();

        Burger burger3 = KitchenFactory.makeBurger("Vegetarian");
        burger3.make();
        burger3.serve();
    }
}
