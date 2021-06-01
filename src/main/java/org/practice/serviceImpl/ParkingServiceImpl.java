package org.practice.serviceImpl;

import org.practice.display.DisplaySlots;
import org.practice.displayImpl.DisplayFactory;
import org.practice.model.*;
import org.practice.parkingStrategy.ParkingStrategy;
import org.practice.parkingStrategyImpl.DefaultParkingStrategy;

public class ParkingServiceImpl {


    public ParkingLot createParkingLot(String parkingLotId, int noOfFloors, int noOfSlotsPerFloor){

        ParkingLot parkingLot = new ParkingLot(parkingLotId, noOfFloors, noOfSlotsPerFloor);

        return parkingLot;

    }

    public Ticket parkVehicle(String vehicleType, String regNo, String color, ParkingLot parkingLot) throws Exception {
        ParkingStrategy parkingStrategy = new DefaultParkingStrategy();
        Vehicle vehicle = new Vehicle(regNo, color, VehicleType.valueOf(vehicleType));
        Ticket ticket = parkingStrategy.getParkingTicket(parkingLot, vehicle);
        return ticket;

    }

    public void unParkVehicle(String ticketId, ParkingLot parkingLot) throws Exception {
        int floorNo = 0;
        int slotNo = 0;
       try {
           String[] parsedTicket = ticketId.split("_");
           floorNo = Integer.parseInt(parsedTicket[1]);
           slotNo = Integer.parseInt(parsedTicket[2]);
       }catch (Exception ex){
           throw new Exception("ticketid is not valid");
       }

       ParkingFloor parkingFloor = parkingLot.getParkingFloors()[floorNo];
       ParkingSlot parkingSlot = parkingFloor.getParkingSlots()[slotNo];
       if(parkingSlot.getTicket() == null)
           throw new Exception("ticketid is not valid");

       parkingSlot.setTicket(null);

    }

    public void display(String displayType, ParkingLot parkingLot){
        DisplayType displayTypeEnum = DisplayType.valueOf(displayType);
        DisplaySlots displaySlots = DisplayFactory.getDisplayType(displayTypeEnum);
        displaySlots.display(parkingLot);
    }



}
