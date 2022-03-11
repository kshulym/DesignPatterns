package decoratorPattern;

public class ThickCrustPizza implements Pizza {

    public static String thickCrustPizza = "ThickCrustPizza";

    public String getDescription() {
        return thickCrustPizza;
    }

    public int getCost() {
        return 10;
    }
}
