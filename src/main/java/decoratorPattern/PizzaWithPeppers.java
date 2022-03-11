package decoratorPattern;

public class PizzaWithPeppers extends PizzaWithTopping {

    PizzaWithPeppers(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + " + peppers";
    }

    @Override
    public int getCost() {
        return pizza.getCost() + 5;
    }
}
