package observerPattern;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements Subject {

    List<Observer> observers;
    int temperature;
    int windSpeed;
    int pressure;

    public WeatherStation() {
        observers = new ArrayList<Observer>();
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public void setWindSpeed(int windSpeed) {
        this.windSpeed = windSpeed;
    }

    public void setPressure(int pressure) {
        this.pressure = pressure;
    }

    public void setValues(int temperature, int windSpeed, int pressure) {
        this.setTemperature(temperature);
        this.setWindSpeed(windSpeed);
        this.setPressure(pressure);
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for (Observer o :
                observers) {
            o.update(temperature, windSpeed, pressure);
        }
    }
}
