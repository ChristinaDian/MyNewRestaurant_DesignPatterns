package singleton;

import command.Cashier;
import command.Chef;

public class SingletonMain {
    public static void main(String[] args) {

        RestaurantSingleton restaurant = RestaurantSingleton.getInstance();
        restaurant.welcomeCustomer();


        Chef chef = new Chef();
        Cashier cashier = new Cashier(chef);
        cashier.takeOrder("Classic");
        cashier.takeOrder("Vegetarian");
    }
}
