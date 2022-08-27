package lesson7;

import lesson7.enums.Period;

import java.io.IOException;

public interface WeatherProvider {

    void getWeather(Period period) throws IOException;

}
