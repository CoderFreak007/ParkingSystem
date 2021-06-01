package org.practice.parkingStrategy;

import org.practice.model.ParkingLot;
import org.practice.model.Ticket;
import org.practice.model.Vehicle;

public interface ParkingStrategy {

    public Ticket getParkingTicket(ParkingLot parkingLot, Vehicle vehicle) throws Exception;
}
