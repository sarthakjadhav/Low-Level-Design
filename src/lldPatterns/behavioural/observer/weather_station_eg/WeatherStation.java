package lldPatterns.behavioural.observer.weather_station_eg;

import lldPatterns.behavioural.observer.weather_station_eg.displays.WeatherDisplay;

import java.util.*;

public class WeatherStation {
    int temp;
    int pressure;
    int humudity;

    List<WeatherDisplay> displayList = new ArrayList<>();

    public void attch(WeatherDisplay display){
        displayList.add(display);
    }

    public void detach(WeatherDisplay display){
        displayList.add(display);
    }

    public void setVals(int temp, int pressure, int humudity){
        this.temp = temp;
        this.pressure =pressure;
        this.humudity = humudity;
        notifyWeatherDisplay();
    }

    private void notifyWeatherDisplay(){
        for(WeatherDisplay display:displayList){
            display.update();
        }
    }

    public int getTemp() {
        return this.temp;
    }

    public int getHumudity() {
        return this.humudity;
    }

    public int getPressure() {
        return this.pressure;
    }
}
