package lldPatterns.creational.Factory.Flighteg.creator;

import lldPatterns.creational.Factory.Flighteg.flightpkg.Flight;
import lldPatterns.creational.Factory.Flighteg.flightpkg.InternationalFlight;

public class IntFlightCreator implements FlightCreator{

    @Override
    public Flight create() {
        return new InternationalFlight();
    }
}
