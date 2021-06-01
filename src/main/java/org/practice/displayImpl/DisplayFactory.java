package org.practice.displayImpl;

import org.practice.display.DisplaySlots;
import org.practice.model.DisplayType;

public class DisplayFactory {

    public static DisplaySlots getDisplayType(DisplayType displayType){
        switch (displayType){
            case FREESLOTS:
                return new DisplayFreeSlots();
            case OCCUPIEDSLOTS:
                return new DisplayOccupiedSlots();
            case FREECOUNT:
                return new DisplayFreeSlotCount();

        }
        return null;
    }
}
