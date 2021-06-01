package org.practice.model;

public class CarParkingSlot extends ParkingSlot {
    @Override
    public boolean isSuitableForVehicle(Vehicle vehicle) {
        return vehicle instanceof CarVehicle;
    }
}
