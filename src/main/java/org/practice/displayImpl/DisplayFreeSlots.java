package org.practice.displayImpl;

import org.practice.display.DisplaySlots;
import org.practice.model.ParkingFloor;
import org.practice.model.ParkingLot;
import org.practice.model.ParkingSlot;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DisplayFreeSlots implements DisplaySlots {

    public Map<Integer, List<ParkingSlot>> getFreeSlots(ParkingLot parkingLot){
        Map<Integer, List<ParkingSlot>> slotMapByFloorId = new HashMap<>();

        for(ParkingFloor parkingFloor : parkingLot.getParkingFloors()){
            slotMapByFloorId.put(parkingFloor.getId(), new ArrayList<ParkingSlot>());
            for(ParkingSlot parkingSlot : parkingFloor.getParkingSlots()){
                  if(parkingSlot.isEmpty())
                      slotMapByFloorId.get(parkingFloor.getId()).add(parkingSlot);
            }
        }

        return slotMapByFloorId;
    }

    @Override
    public void display(ParkingLot parkingLot) {
        Map<Integer, List<ParkingSlot>> slotMapByFloorId = getFreeSlots(parkingLot);
        for(Map.Entry<Integer, List<ParkingSlot>> entry : slotMapByFloorId.entrySet()){
            for(ParkingSlot parkingSlot : entry.getValue())
                System.out.println("Slot Number "+parkingSlot.getId()+" is Free at floor "+ entry.getKey());
        }
    }
}
