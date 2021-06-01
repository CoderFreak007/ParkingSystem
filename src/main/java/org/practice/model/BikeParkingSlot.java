package org.practice.model;

public class BikeParkingSlot extends ParkingSlot {
    @Override
    public boolean isSuitableForVehicle(Vehicle vehicle) {
        return vehicle instanceof BikeVehicle;
    }
}
