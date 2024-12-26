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
        for (Accommodation accommodation : this.accommodations) {
            if (accommodation.getBreakfast()) {
                return true;
            }
        }
        return false;
    }

    public CleaningStatus.Status getCleaningStatus() {
        return this.cleaningStatus;
    }

    public static void main(String[] args) {
        Area area = new Area("Downtown", "A bustling city center.", CleaningStatus.Status.CLEAN);
        System.out.println("Area Name: " + area.getAreaName());
        System.out.println("Description: " + area.getAreaDescription());
        System.out.println("Cleaning Status: " + area.getCleaningStatus());
    }
}

class CleaningStatus {
    public enum Status {
        CLEAN, MAINTENANCE, DIRTY;
    }
}

class Accommodation {
    public boolean getBreakfast() {
        return true;
    }
}
