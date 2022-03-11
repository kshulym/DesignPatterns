package decoratorPattern;

public class MainForDecorator {

    public static void main(String[] args) {

        Pizza pizza = new ThickCrustPizza();
        PizzaWithTopping pizzaWithTopping = new PizzaWithCheese(new PizzaWithOlives(pizza));
        System.out.println(pizzaWithTopping.getDescription());
        System.out.println(pizzaWithTopping.getCost());
    }
}
