package ParkingLot.Service;

public class TicketPrinter extends Ticket{
    Ticket ticket;
    ParkingService service;
    public TicketPrinter(Ticket ticket, ParkingService service) {
        super(ticket.ticketId,ticket.getSpot(), ticket.v );
        this.service = service;
        this.ticket = ticket;
    }

    public void printInfo(double fee){
        System.out.println("Ticket ID: "+ ticketId);
        System.out.println("Vehicle Type: "+ ticket.v.getVehicleType());
        System.out.println("Vehicle Number: "+ ticket.v.getNumber());
        System.out.println("Parking fee: "+ fee);
    }

}
