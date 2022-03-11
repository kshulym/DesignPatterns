package simpleFactoryPattern;

public class ZoneFactory {

    public static Zone createZone(String zoneid) {
        Zone zone = null;
        if (zoneid.equalsIgnoreCase("USEastern")) {
            zone = new USEasternZone();
        } else if (zoneid.equalsIgnoreCase("USCentral")) {
            zone = new USCentralZone();
        } else if (zoneid.equalsIgnoreCase("USPacific")) {
            zone = new ZonePacific();
        }
        return zone;
    }
}

