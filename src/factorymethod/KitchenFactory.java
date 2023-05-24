package factorymethod;

public class KitchenFactory {
    public static Burger makeBurger(String burgerType) {
        if (burgerType.equals("King")) {
            return new KingBurger();
        } else if (burgerType.equals("Classic")) {
            return new ClassicBurger();
        } else if (burgerType.equals("Vegetarian")) {
            return new VegetarianBurger();
        } else {
            throw new IllegalArgumentException("There isn't this type of burger!");
        }
    }
}
