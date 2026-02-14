package ParkingLot.vehicles;

public class Bike extends Vehicles {

    public Bike(String number) {
        super(number);
    }
    @Override
    public VehicleType getVehicleType(){
        return VehicleType.BIKE;
    }
}
