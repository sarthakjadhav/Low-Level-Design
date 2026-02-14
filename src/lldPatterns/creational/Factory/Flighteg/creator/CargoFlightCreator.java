package lldPatterns.creational.Factory.Flighteg.creator;

import lldPatterns.creational.Factory.Flighteg.flightpkg.CargoFlight;
import lldPatterns.creational.Factory.Flighteg.flightpkg.Flight;

public class CargoFlightCreator implements FlightCreator{

    @Override
    public Flight create() {
        return new CargoFlight();
    }
}
