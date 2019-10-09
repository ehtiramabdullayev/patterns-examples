package observer;

/**
 * @author Ehtiram Etibarovich Abdullayev on 09.10.2019
 * @project patterns-examples
 */
public class CurrentConditionsDisplay implements Observer, DisplayElement {
    private Subject subject;
    private WeatherData weatherData;


    public CurrentConditionsDisplay(Subject subject) {
        this.subject = subject;
        subject.registerObserver(this);
    }

    public void update(WeatherData weatherData) {
        this.weatherData = weatherData;
        display();
    }

    public void display() {
        System.out.println("Current conditions: " + weatherData.getTemperature() + "C degrees and " +
                " humidity : " + weatherData.getHumidity() +
                " pressure : " + weatherData.getPressure());
    }

}
