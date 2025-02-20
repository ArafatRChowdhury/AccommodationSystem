import java.util.ArrayList;


public class Area {
    private String areaName;
    private String areaDescription;
    private ArrayList<Accommodation> accommodations;
    private CleaningStatus.Status cleaningStatus;

    public Area(String areaName, String areaDescription, CleaningStatus.Status cleaningStatus) {
        this.areaName = areaName;
        this.areaDescription = areaDescription;
        this.accommodations = new ArrayList<>();
        this.cleaningStatus = cleaningStatus;
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

    public boolean hasDailyBreakfast() {
        
        
        for (Accommodation accommodation : accommodations) {
            if (accommodation.getBreakfast()) {
                return true;
            }
        }
        return false;
    }

    public CleaningStatus.Status getCleaningStatus() {
        return this.cleaningStatus;
    }

}
