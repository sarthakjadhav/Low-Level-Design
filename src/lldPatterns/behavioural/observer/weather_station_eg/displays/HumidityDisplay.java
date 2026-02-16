package lldPatterns.behavioural.observer.weather_station_eg.displays;

import lldPatterns.behavioural.observer.weather_station_eg.WeatherStation;

public class HumidityDisplay implements WeatherDisplay{

    WeatherStation station;
    public HumidityDisplay(WeatherStation station) {
        this.station = station;
        station.attch(this);
    }
    @Override
    public void update() {
        System.out.println("Humidity updated to "+station.getHumudity());
    }
}
