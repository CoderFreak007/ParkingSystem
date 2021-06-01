package org.practice.displayImpl;

import org.practice.display.DisplaySlots;
import org.practice.model.ParkingLot;
import org.practice.model.ParkingSlot;

import java.util.List;
import java.util.Map;

public class DisplayFreeSlotCount extends DisplayFreeSlots implements DisplaySlots {

    public int getFreeSlotCount(ParkingLot parkingLot){
        Map<Integer, List<ParkingSlot>> freeSlotMapByFloorId = super.getFreeSlots(parkingLot);
        int count = 0;
        for(List<ParkingSlot> freeslot : freeSlotMapByFloorId.values()){
            count = count + freeslot.size();
        }
        return count;
    }

    @Override
    public void display(ParkingLot parkingLot) {
        int freeSlotCount = getFreeSlotCount(parkingLot);
        System.out.println("Total free slots "+freeSlotCount );

    }


}
