package org.practice.model;

public class ParkingSlot {

    private static int AUTOINCREAMENTID = 1;

    private int id;

    private VehicleType reservedForVehicleType;

    private Ticket ticket;

    public ParkingSlot(VehicleType reservedForVehicleType) {
        this.id = AUTOINCREAMENTID;
        AUTOINCREAMENTID++;
        this.reservedForVehicleType = reservedForVehicleType;
    }

    public int getId() {
        return id;
    }

    public Ticket getTicket() {
        return ticket;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    public VehicleType getReservedForVehicleType() {
        return reservedForVehicleType;
    }

    public boolean isEmpty(){
        return ticket == null;
    }
}
