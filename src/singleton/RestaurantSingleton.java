package singleton;

public class RestaurantSingleton {
    private static RestaurantSingleton instance;

    private RestaurantSingleton() {}

    public static RestaurantSingleton getInstance() {
        if (instance == null) {
            instance = new RestaurantSingleton();
        }
        return instance;
    }

    public void welcomeCustomer() {
        System.out.println("Welcome to my new Burger Restaurant! I hope you enjoy the food and come back again!");
    }
}
