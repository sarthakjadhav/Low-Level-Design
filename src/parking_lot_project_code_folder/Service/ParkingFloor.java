package ParkingLot.Service;
import ParkingLot.vehicles.Vehicles;
import java.util.*;

public class ParkingFloor {
    private final List<ParkingSpot> spots;

    public ParkingFloor(List<ParkingSpot> spots) {
        this.spots = spots;
    }

    public ParkingSpot findAvailableSpot(Vehicles veh){
        for(ParkingSpot spot:spots){
            if(spot.canPark(veh)) return spot;
        }
        return null;
    }
}
