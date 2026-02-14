package ParkingLot.Calculations;

public class BikeFeeCalculator implements FeeCalculator {

    @Override
    public double calculate(long duration) {
        return (duration/1000)*10;
    }
}
