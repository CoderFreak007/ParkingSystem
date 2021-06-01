package org.practice.parkingStrategyImpl;

import org.practice.model.*;
import org.practice.parkingStrategy.ParkingStrategy;

public class DefaultParkingStrategy implements ParkingStrategy {

    @Override
    public Ticket getParkingTicket(ParkingLot parkingLot, Vehicle vehicle) throws Exception {

        for(ParkingFloor parkingFloor : parkingLot.getParkingFloors()){
            for(ParkingSlot parkingSlot : parkingFloor.getParkingSlots()){
                if(parkingSlot.getReservedForVehicleType().equals(vehicle.getVehicleType()))
                    return new Ticket(parkingLot.getId(), parkingFloor.getId(), parkingSlot.getId(), vehicle);
            }
        }

        throw new Exception("No slot Available");

    }



}
