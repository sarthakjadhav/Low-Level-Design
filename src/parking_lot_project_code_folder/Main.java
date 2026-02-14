package ParkingLot;

import ParkingLot.Calculations.*;
import ParkingLot.Service.*;
import ParkingLot.vehicles.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println();
        ParkingSpot carSpot1 = new ParkingSpot(VehicleType.CAR);
        ParkingFloor floor = new ParkingFloor(List.of(carSpot1));
        Map<VehicleType, FeeCalculator> calculators = new HashMap<>();
        calculators.put(VehicleType.BIKE, new BikeFeeCalculator());
        calculators.put(VehicleType.CAR, new CarFeeCalculator());

        ParkingService service = new ParkingService(List.of(floor),calculators);

        Vehicles car = new Car("MH12NG5659");

        Ticket ticket = service.park(car);
        TicketPrinter tp = new TicketPrinter(ticket,service);
        service.unPark(ticket,tp);

        //System.out.println("Fee is "+fee);
        Vehicles car1 = new Car("MH12HB7576");
        Ticket t1 = service.park(car1);
        TicketPrinter tp1 = new TicketPrinter(t1,service);

        //double fee1 = service.unPark(t1);

    }
}