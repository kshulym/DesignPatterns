package simpleFactoryPattern;

public abstract class Calendar {

    Zone zone;

    public void print() {
        System.out.println(zone);
    }

    public abstract void createCalendar();

}
