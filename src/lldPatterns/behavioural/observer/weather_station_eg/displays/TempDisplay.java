package lldPatterns.behavioural.observer.weather_station_eg.displays;

import lldPatterns.behavioural.observer.weather_station_eg.WeatherStation;

public class TempDisplay implements WeatherDisplay {
    WeatherStation station;
    public TempDisplay(WeatherStation station) {
        this.station = station;
        station.attch(this);
    }

    @Override
    public void update() {

        System.out.println("Temperature updated to "+ station.getTemp());
    }
}
