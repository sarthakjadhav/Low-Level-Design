package ParkingLot.Service;


import ParkingLot.vehicles.Vehicles;

public class Ticket {
    public final String ticketId;
    private final long entryTime;
    private final ParkingSpot spot;
    public final Vehicles v;


    public Ticket(String ticketId, ParkingSpot spot, Vehicles v) {
        this.ticketId = ticketId;
        this.entryTime = 0;
        this.spot = spot;
        this.v = v;
    }

    public long getEntryTime() {
        return entryTime;
    }

    public ParkingSpot getSpot() {
        return spot;
    }
}
