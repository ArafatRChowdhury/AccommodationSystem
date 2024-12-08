import java.util.ArrayList;

public class Area {
    private final String areaName;
    private final String areaDescription;
    private final ArrayList<Accomodation> accomodation;
    private final CleaningStatus cleaningStatus;

    public Area(String areaName, String areaDescription, CleaningStatus cleaningStatus) {
        this.areaName = areaName;
        this.areaDescription = areaDescription;
        this.accomodation = new ArrayList<>();
        this.cleaningStatus = cleaningStatus;
    }

    public ArrayList<Accomodation> getaccomType() {
        return this.accomodation;
    }

    public String getAreaName() {
        return this.areaName;
    }

    public String getAreaDescription() {
        return this.areaDescription;
    }

    public boolean getdailyBreakfast() {
        return this.dailybreakfast;
    }

    public CleaningStatus getCleaningStatus(){
        return this.cleaningStatus;
    }
    public static void main(String[] args) {

    } 
}
