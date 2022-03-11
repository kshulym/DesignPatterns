package decoratorPattern;

public class ThinCrustPizza implements Pizza{

    public String getDescription() {
        return "ThinCrustPizza";
    }

    public int getCost() {
        return 8;
    }
}
