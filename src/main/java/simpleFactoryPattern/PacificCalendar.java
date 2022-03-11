package simpleFactoryPattern;

public class PacificCalendar extends Calendar {


    public PacificCalendar() {
        this.zone = ZoneFactory.createZone("USPacific");
    }

    @Override
    public void createCalendar() {
    }
}
