package ParkingLot.Service;

import ParkingLot.Calculations.FeeCalculator;
import ParkingLot.vehicles.VehicleType;
import ParkingLot.vehicles.Vehicles;

import java.util.*;

public class ParkingService {
    private final List<ParkingFloor> floors;
    private final Map<VehicleType, FeeCalculator> feecalculators;

    public ParkingService(List<ParkingFloor> floors, Map<VehicleType, FeeCalculator> feecalculator) {
        this.floors = floors;
        this.feecalculators = feecalculator;
    }

    public Ticket park(Vehicles veh){
        for(ParkingFloor floor:floors){
            ParkingSpot spot = floor.findAvailableSpot(veh);
            if(spot != null) {
                spot.park(veh);
                return new Ticket(UUID.randomUUID().toString(),spot,veh);
            }
        }
        throw new RuntimeException("No Spot Available");
    }

    public void unPark(Ticket ticket,TicketPrinter tp){
        long duration  = 10000;
        ticket.getSpot().unPark();

        FeeCalculator calculator = feecalculators.get(ticket.v.getVehicleType());
        tp.printInfo(calculator.calculate(duration));
        //return calculator.calculate(duration);
    }
}
