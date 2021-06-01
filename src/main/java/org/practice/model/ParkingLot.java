package org.practice.model;

public class ParkingLot {

    private String id;

    private ParkingFloor[] parkingFloors;

    public ParkingLot(String id, int noOFloors, int noOfSlotsPerFloor) {
        this.id = id;
        this.parkingFloors = new ParkingFloor[noOFloors];
    }

    private void buildParkingFloors(int noOfSlotsPerFloor){
        for(int i =0; i< parkingFloors.length; i++){
            this.parkingFloors[i] = new DefaultParkingFloor(noOfSlotsPerFloor);
        }

    }

    public String getId() {
        return id;
    }

    public ParkingFloor[] getParkingFloors() {
        return parkingFloors;
    }


}
