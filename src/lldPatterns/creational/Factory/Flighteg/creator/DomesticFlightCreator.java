package lldPatterns.creational.Factory.Flighteg.creator;

import lldPatterns.creational.Factory.Flighteg.flightpkg.DomesticFlight;
import lldPatterns.creational.Factory.Flighteg.flightpkg.Flight;

public class DomesticFlightCreator implements FlightCreator{

    @Override
    public Flight create() {
        return new DomesticFlight();
    }
}
