package groupproject.accommodationsystem;

import java.util.ArrayList;


public class Area {
    protected String areaName;
    protected String areaDescription;
    protected ArrayList<Accommodation> accommodations;

    public Area(String areaName, String areaDescription) {
        this.areaName = areaName;
        this.areaDescription = areaDescription;
        this.accommodations = new ArrayList<>();
    }

    
    public ArrayList<Accommodation> getAccommodations() {
        return this.accommodations;
    }

    public String getAreaName() {
        return this.areaName;
    }

    public String getAreaDescription() {
        return this.areaDescription;
    }
    
         public void addAccommodation(Accommodation accommodation)
    {
        accommodations.add(accommodation);
    }
    
    public int getNumBreakfasts() {
        int count = 0;
        for (Accommodation accommodation : accommodations) {
            if (accommodation.getBreakfast()) {  // Assuming getBreakfast() returns true if breakfast is required
                count++;
        }
    }
    return count;
    }
    
    public int getNumRequireCleaning() {
        int count = 0;
        for (Accommodation accommodation : accommodations) {
        if (accommodation.needsCleaning()) {  // Assuming needsCleaning() is a method in Accommodation
            count++;
        }
    }
    return count;
}
    
    public boolean hasDailyBreakfast() {
        
        
        for (Accommodation accommodation : accommodations) {
            if (accommodation.getBreakfast()) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public String toString() {
        return areaName;
    }
    
    /*public CleaningStatus.Status getCleaningStatus() {
        return this.cleaningStatus;
    }*/

}
