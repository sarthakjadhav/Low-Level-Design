package ParkingLot.Service;

import ParkingLot.vehicles.VehicleType;
import ParkingLot.vehicles.Vehicles;

public class ParkingSpot {
    private final VehicleType type;
    private Vehicles parkedVehicle;


    public ParkingSpot(VehicleType type) {
        this.type = type;
    }

    boolean isFree(){
        return parkedVehicle == null;
    }

    boolean canPark(Vehicles vehi){
        return isFree() && vehi.getVehicleType() == type;
    }

    void park(Vehicles v){
        this.parkedVehicle = v;
    }

    void unPark(){
        this.parkedVehicle = null;
    }
}
