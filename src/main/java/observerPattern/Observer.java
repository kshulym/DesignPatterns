package observerPattern;

public interface Observer {
    void update(int temperatureValue, int windSpeedValue, int pressureValue);
}
