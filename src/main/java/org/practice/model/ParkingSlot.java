package org.practice.model;

public abstract class ParkingSlot {

    private static int AUTOINCREAMENTID = 1;

    private int id;

    private Ticket ticket;

    public ParkingSlot() {
        this.id = AUTOINCREAMENTID;
        AUTOINCREAMENTID++;
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

    public boolean isEmpty(){
        return ticket == null;
    }

    public abstract boolean isSuitableForVehicle(Vehicle vehicle);
}
