package ParkingLot.vehicles;

public class Car extends Vehicles {

    public Car(String number) {
        super(number);
    }

    @Override
    public VehicleType getVehicleType(){
        return VehicleType.CAR;
    }
}
