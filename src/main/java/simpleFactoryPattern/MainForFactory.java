package simpleFactoryPattern;

public class MainForFactory {

    public static void main(String[] args) {
        Calendar calendar = new PacificCalendar();
        calendar.print();
    }
}
