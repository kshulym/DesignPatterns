package decoratorPattern;

public class PizzaWithOlives extends PizzaWithTopping {

    PizzaWithOlives(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + " + olives";
    }

    @Override
    public int getCost() {
        return pizza.getCost() + 2;
    }
}
