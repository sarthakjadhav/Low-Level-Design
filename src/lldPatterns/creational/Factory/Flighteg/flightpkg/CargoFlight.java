package lldPatterns.creational.Factory.Flighteg.flightpkg;

public class CargoFlight implements Flight {
    @Override
    public void book() {
        System.out.println("Cargo flight booked.");
    }
}
