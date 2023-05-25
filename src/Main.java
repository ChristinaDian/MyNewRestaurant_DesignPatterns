import command.Cashier;
import command.Chef;
import decorator.GarlicSauce;
import decorator.Ketchup;
import factorymethod.Burger;
import factorymethod.KitchenFactory;
import singleton.RestaurantSingleton;

public class Main {
    public static void main(String[] args) {

        RestaurantSingleton restaurant = RestaurantSingleton.getInstance();

        restaurant.welcomeCustomer();

        Chef chef = new Chef();
        Cashier cashier = new Cashier(chef);

        cashier.takeOrder("Classic");
        cashier.takeOrder("Vegetarian");

        Burger burger = KitchenFactory.makeBurger("King");
        burger.make();
        burger.addSauce(new Ketchup(burger));
        burger.addSauce(new GarlicSauce(burger));
        burger.serve();

        cashier.undoLastOrder();
    }
}