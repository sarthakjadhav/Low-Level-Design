package lldPatterns.creational.Factory.Flighteg.flightpkg;

public class InternationalFlight implements Flight {
    @Override
    public void book() {
        System.out.println("International flight booked.");
    }
}
