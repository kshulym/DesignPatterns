package decoratorPattern;

public class PizzaWithCheese extends PizzaWithTopping {

    PizzaWithCheese(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + " + cheese";
    }

    @Override
    public int getCost() {
        return pizza.getCost() + 3;
    }
}
