package groupproject.accommodationsystem;
public class GeodesicDome extends Accommodation {
    public GeodesicDome(String accommodationName, String accommodationDescription, int guests, int costperNight, boolean occupancy,boolean availability,CleaningStatus.Status cleaningStatus,boolean breakfast){
        super(accommodationName,accommodationDescription,guests, costperNight,occupancy,availability,cleaningStatus,breakfast);
    }
     @Override   
     public String getAccommodationName(){
            return "Geodesic Dome";
            }
     @Override
     public String getAccommodationDescription(){
         return"Description in progress";
         }
     @Override
     public int setGuests(int guests){
         if(guests<1 || guests>3){
             System.out.println("Guests entered have to be between 1-3");
         }
         else{
             System.out.println("Guests entered correctly");
         }
         return 0;
     }
     @Override
     public int getCost(){
         return 120;
         }
} 
