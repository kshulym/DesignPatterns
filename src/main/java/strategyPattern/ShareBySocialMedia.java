package strategyPattern;

public class ShareBySocialMedia implements ShareStrategy{
    @Override
    public void share() {
        System.out.println("I share by Social Media");
    }
}
