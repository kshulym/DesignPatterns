package decoratorPattern;

public abstract class PizzaWithTopping implements Pizza {

    Pizza pizza;

    PizzaWithTopping(Pizza pizza){
        this.pizza = pizza;
    }
}
