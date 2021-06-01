package org.practice.model;

public class DefaultParkingFloor extends ParkingFloor {

    public DefaultParkingFloor(int noOfParkingSlots) {
        super(noOfParkingSlots);
        buildParkingSlots();
    }

    @Override
    public void buildParkingSlots() {
            for(int i = 0; i< super.getParkingSlots().length; i++) {
                if (i == 0)
                    super.getParkingSlots()[i] = new TruckParkingSlot();
                else if(i == 1 || i == 2)
                    super.getParkingSlots()[i] = new BikeParkingSlot();
                else
                    super.getParkingSlots()[i] = new CarParkingSlot();
            }

    }
}
