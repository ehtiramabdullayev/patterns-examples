package observer;

/**
 * @author Ehtiram Etibarovich Abdullayev on 09.10.2019
 * @project patterns-examples
 */
public class Main {
    public static void main(String[] args) {
        WeatherSubject weatherSubject = new WeatherSubject();

        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherSubject);

        weatherSubject.setMeasurements(80,54,30.5f);
        weatherSubject.setMeasurements(85,52,33.5f);
        weatherSubject.setMeasurements(19,23,70.4f);
        weatherSubject.setMeasurements(30,14,39.1f);
    }
}
