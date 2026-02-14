package lldPatterns.creational.Factory.Flighteg;

import lldPatterns.creational.Factory.Flighteg.Config.FlightApp;
import lldPatterns.creational.Factory.Flighteg.factory.FlightFactory;
import lldPatterns.creational.Factory.Flighteg.flightpkg.Flight;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        FlightFactory ff = FlightApp.flightFactory();
        Flight flight = ff.getFlight(sc.nextLine());
        flight.book();
    }
}
