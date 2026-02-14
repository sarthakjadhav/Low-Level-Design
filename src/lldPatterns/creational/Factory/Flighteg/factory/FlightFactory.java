package lldPatterns.creational.Factory.Flighteg.factory;

import lldPatterns.creational.Factory.Flighteg.creator.FlightCreator;
import lldPatterns.creational.Factory.Flighteg.flightpkg.Flight;

import java.util.Map;

public class FlightFactory {
    private Map<String,FlightCreator> map;


    public FlightFactory(Map<String,FlightCreator> map){
        this.map = map;
    }

    public Flight getFlight(String type){
        FlightCreator fc = map.get(type.toLowerCase());
        if(fc == null) {
            System.out.println("Invalid flight type");
            return null;
        }
        return fc.create();
    }
}
