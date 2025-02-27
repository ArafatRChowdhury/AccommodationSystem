import java.util.ArrayList;

/**
 *
 * @author arifa
 */
public class CedarWoodsAccommodationSystem {
    private ArrayList<Area> areas;
    private static CedarWoodsAccommodationSystem instance = null;
    
    protected CedarWoodsAccommodationSystem() {
        areas = new ArrayList<>();
    }
    
    public static CedarWoodsAccommodationSystem getInstance() {
        if (instance == null) {
            instance = new CedarWoodsAccommodationSystem();
            
            instance.addArea(new Hilltop("Hilltop", "Big hill"));
            instance.addArea(new Lakeview("Lakeview", "Big lake"));
            instance.addArea(new Meadow("Meadow", "Big meadow"));
            instance.addArea(new Woodland("Woodland", "Big tree"));
        }
        
        return instance;
    }
    
    public void addArea(Area area) {
        areas.add(area);
    }
    
    public ArrayList<Area> getAreas(){
        return areas;
    }
}
