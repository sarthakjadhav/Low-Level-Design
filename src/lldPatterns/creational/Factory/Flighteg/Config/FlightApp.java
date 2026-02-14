package lldPatterns.creational.Factory.Flighteg.Config;

import lldPatterns.creational.Factory.Flighteg.creator.CargoFlightCreator;
import lldPatterns.creational.Factory.Flighteg.creator.DomesticFlightCreator;
import lldPatterns.creational.Factory.Flighteg.creator.FlightCreator;
import lldPatterns.creational.Factory.Flighteg.creator.IntFlightCreator;
import lldPatterns.creational.Factory.Flighteg.factory.FlightFactory;

import java.util.HashMap;
import java.util.Map;

public class FlightApp {
    public static FlightFactory flightFactory(){
        Map<String, FlightCreator> map = new HashMap<>();
        map.put("domestic",new DomesticFlightCreator());
        map.put("cargo",new CargoFlightCreator());
        map.put("int",new IntFlightCreator());

        return new FlightFactory(map);
    }


}
