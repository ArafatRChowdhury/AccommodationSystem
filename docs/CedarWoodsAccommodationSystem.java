package groupproject.accommodationsystem;
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
    
    public static CedarWoodsAccommodationSystem getInstance()
    {
        if (instance == null)
        {
            instance = new CedarWoodsAccommodationSystem();
            
            Hilltop hilltop = new Hilltop("Hilltop", "Big hill");
            Lakeview lakeview = new Lakeview("Lakeview", "Big lake");
            Meadow meadow = new Meadow("Meadow", "Big meadow");
            Woodland woodland = new Woodland("Woodland", "Big tree");
            
            instance.addArea(hilltop);
            instance.addArea(lakeview);
            instance.addArea(meadow);
            instance.addArea(woodland);
            
            CleaningStatus.Status CleanStatus = CleaningStatus.Status.CLEAN;
            CleaningStatus.Status MainStatus = CleaningStatus.Status.MAINTENANCE;
            CleaningStatus.Status DirtyStatus = CleaningStatus.Status.DIRTY;
            
            
            for (int cabinNo = 0; cabinNo<4; cabinNo++)
            {
                Accommodation cabin = new Accommodation("Room " + (cabinNo + 1), "Cabin",0,160,false,true,CleanStatus.name(),false);
                hilltop.addAccommodation(cabin);
            }
            
            for (int geodesicDomeNo = 0; geodesicDomeNo<2; geodesicDomeNo++)
            {
                Accommodation geodesicDome = new Accommodation("Room " +(geodesicDomeNo+1),"Geodesic Dome",0,120,false,true,CleanStatus.name(),false);
                woodland.addAccommodation(geodesicDome);
            }
            
            for (int yurtNo = 0; yurtNo<2; yurtNo++)
            {
                Accommodation yurt = new Accommodation("Room " + (yurtNo+1),"Yurt",0,110,false,true,CleanStatus.name(),false);
                meadow.addAccommodation(yurt);
                
            }

            for (int airstreamNo = 0; airstreamNo<4; airstreamNo++)
            {
                Accommodation airstream = new Accommodation("Room " + (airstreamNo+1),"Airstream",0,180,false,true,CleanStatus.name(),false);
                lakeview.addAccommodation(airstream);
            }             
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