package lldPatterns.behavioural.observer.weather_station_eg.displays;

import lldPatterns.behavioural.observer.weather_station_eg.WeatherStation;

public class PressureDisplay implements WeatherDisplay{

    WeatherStation station;
    public PressureDisplay(WeatherStation station) {
        this.station = station;
        station.attch(this);
    }

    @Override
    public void update() {
        System.out.println("Pressure updated to "+station.getPressure());
    }
}
