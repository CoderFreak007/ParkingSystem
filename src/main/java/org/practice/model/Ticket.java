package org.practice.model;

public class Ticket {

    private String ticketId;

    private Vehicle vehicleParked;


    public Ticket(String parkingLotId, int parkingFloorId,
                  int parkingSlotId,  Vehicle vehicleParked) {
        this.ticketId = parkingLotId+"_"+parkingFloorId+"_"+parkingSlotId;
        this.vehicleParked = vehicleParked;
    }

    public String getTicketId() {
        return ticketId;
    }

    public Vehicle getVehicleParked() {
        return vehicleParked;
    }


}
