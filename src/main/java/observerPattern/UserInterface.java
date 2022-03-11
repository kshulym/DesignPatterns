package observerPattern;

public class UserInterface implements Observer {

    private WeatherStation weatherStation;
    public int temperatureValue;
    public int windSpeedValue;
    public int pressureValue;

    public UserInterface(WeatherStation weatherStation) {
        this.weatherStation = weatherStation;
        weatherStation.registerObserver(this);
    }

    void display() {
        System.out.println("temperatureValue is " + temperatureValue);
        System.out.println("windSpeedValue is " + temperatureValue);
        System.out.println("pressureValue is " + temperatureValue);
    }

    @Override
    public void update(int temperatureValue, int windSpeedValue, int pressureValue) {
        this.temperatureValue = temperatureValue;
        this.windSpeedValue = windSpeedValue;
        this.pressureValue = pressureValue;
        display();
    }
}
