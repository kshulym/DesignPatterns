package observerPattern;

public class MainForObserver {

    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStation();
        Logger logger = new Logger(weatherStation);
        AlertSystem alertSystem = new AlertSystem();
        weatherStation.registerObserver(alertSystem);
        weatherStation.setValues(21, 5, 700);
        weatherStation.removeObserver(logger);
        weatherStation.setValues(18, 5, 700);
    }
}
