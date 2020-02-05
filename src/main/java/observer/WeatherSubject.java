package observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Ehtiram Etibarovich Abdullayev on 09.10.2019
 * @project patterns-examples
 */
public class WeatherSubject implements Subject {
    private List observers;
    private WeatherData weatherData;

    public WeatherSubject() {
        observers = new ArrayList();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        int i = observers.indexOf(observer);
        if (i > 0) observers.remove(i);
    }

    @Override
    public void notifyObservers() {
        for (int i = 0; i < observers.size(); i++) {
            Observer observer = (Observer) observers.get(i);
            observer.update(weatherData);
        }
    }

    private void measurementsChanged(){
        notifyObservers();
    }

    public void setMeasurements(float temperature, float humidity, float pressure){
        this.weatherData = new WeatherData(temperature,humidity,pressure);
        measurementsChanged();
    }
}
