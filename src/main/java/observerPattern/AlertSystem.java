package observerPattern;

public class AlertSystem implements Observer {

    private int temperatureValue;
    private int windSpeedValue;
    private int pressureValue;

    public void alert() {
        System.out.println("Alert temperatureValue " + temperatureValue);
        System.out.println("Alert windSpeedValue " + windSpeedValue);
        System.out.println("Alert pressureValue " + pressureValue);
    }

    @Override
    public void update(int temperatureValue, int windSpeedValue, int pressureValue) {
        this.temperatureValue = temperatureValue;
        this.windSpeedValue = windSpeedValue;
        this.pressureValue = pressureValue;
        alert();
    }
}
