package simpleFactoryPattern;

public class ZonePacific extends Zone{
    public ZonePacific() {
        displayName = "US/Pacific";
        offset = -8;
    }

    @Override
    public String toString() {
        return "ZonePacific{" +
                "displayName='" + displayName + '\'' +
                '}';
    }
}
