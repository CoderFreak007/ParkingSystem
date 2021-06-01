package org.practice.model;

public abstract class ParkingFloor {

    private static int AUTOINCREAMENTID = 1;

    private int id;

    private ParkingSlot[] parkingSlots;

    public ParkingFloor(int noOfParkingSlots) {
        this.id = AUTOINCREAMENTID;
        AUTOINCREAMENTID++;
        this.parkingSlots = new ParkingSlot[noOfParkingSlots];
    }

    public abstract void buildParkingSlots();

    public int getId() {
        return this.id;
    }

    public ParkingSlot[] getParkingSlots() {
        return parkingSlots;
    }


}
