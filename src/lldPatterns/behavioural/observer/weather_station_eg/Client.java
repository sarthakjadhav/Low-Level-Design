package lldPatterns.behavioural.observer.weather_station_eg;

import lldPatterns.behavioural.observer.weather_station_eg.displays.HumidityDisplay;
import lldPatterns.behavioural.observer.weather_station_eg.displays.PressureDisplay;
import lldPatterns.behavioural.observer.weather_station_eg.displays.TempDisplay;

public class Client {
    public static void main(String[] args){
        System.out.println("main");

        WeatherStation station = new WeatherStation();

        new TempDisplay(station);
        new PressureDisplay(station);
        new HumidityDisplay(station);
        station.setVals(10,20,30);
        System.out.println("-------------------------------------");
        station.setVals(20,30,40);
    }
}
