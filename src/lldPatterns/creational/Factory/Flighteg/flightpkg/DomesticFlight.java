package lldPatterns.creational.Factory.Flighteg.flightpkg;

public class DomesticFlight implements Flight {
    @Override
    public void book() {
        System.out.println("Domestic flight booked.");
    }
}
