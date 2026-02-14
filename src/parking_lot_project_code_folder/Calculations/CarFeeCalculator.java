package ParkingLot.Calculations;

public class CarFeeCalculator implements FeeCalculator {
    @Override
    public double calculate(long duration) {
        return (duration/1000)*20;
    }
}
