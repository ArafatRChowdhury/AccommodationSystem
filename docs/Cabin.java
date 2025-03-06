package groupproject.accommodationsystem;

public class Cabin extends Accommodation {
    public Cabin(String accommodationName, String accommodationDescription, int guests, int costperNight, boolean occupancy,boolean availability,String cleaningStatus,boolean breakfast){
        super(accommodationName,accommodationDescription,guests, costperNight,occupancy,availability,cleaningStatus,breakfast);
    }
     @Override   
     public String getAccommodationName(){
            return "Cabin";
            }
     @Override
     public String getAccommodationDescription(){
         return"Description in progress";
         }
     @Override
     public int setGuests(int guests){
        if(guests<1 || guests>4){
            System.out.println("Guests entered have to be between 1-4");
        }
        else{
            System.out.println("Guests entered correctly");
        }
        return 0;
     }
     @Override
     public int getCost(){
         return 160;
         }
}
