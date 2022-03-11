package observerPattern;

public class Logger implements Observer {

    private WeatherStation weatherStation;
    private int temperatureValue;
    private int windSpeedValue;
    private int pressureValue;

    public Logger(WeatherStation weatherStation) {
        this.weatherStation = weatherStation;
        weatherStation.registerObserver(this);
    }

    public void log() {
        System.out.println("Log temperatureValue " + temperatureValue);
        System.out.println("Log windSpeedValue " + windSpeedValue);
        System.out.println("Log pressureValue " + pressureValue);
    }

    @Override
    public void update(int temperatureValue, int windSpeedValue, int pressureValue) {
        this.temperatureValue = temperatureValue;
        this.windSpeedValue = windSpeedValue;
        this.pressureValue = pressureValue;
        log();
    }
}
