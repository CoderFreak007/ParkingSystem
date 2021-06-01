package org.practice.model;

public class TruckParkingSlot extends ParkingSlot {
    @Override
    public boolean isSuitableForVehicle(Vehicle vehicle) {
        return vehicle instanceof TruckVehicle;
    }
}
