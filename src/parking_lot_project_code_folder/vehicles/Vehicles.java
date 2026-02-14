package ParkingLot.vehicles;

public abstract class Vehicles implements Vehicle {
    private final String number;

    public Vehicles(String number){
        this.number = number;
    }
    @Override
    public String getNumber() {
        return this.number;
    }

    @Override
    public abstract VehicleType getVehicleType() ;

}
