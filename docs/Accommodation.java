
public class Accommodation {
  private String accommodationName;
  private String accommodationDescription;
  int guests;
  private int costperNight;
  private boolean occupancy;
  private boolean availability;
  private String cleaningStatus;
  private boolean breakfast;
  private String area;
    
public Accommodation(String accommodationName, String accommodationDescription, int guests, int costperNight, boolean occupancy,boolean availability,String cleaningStatus,boolean breakfast){
    this.accommodationName=accommodationName;
    this.accommodationDescription=accommodationDescription;
    this.guests = guests;
    this.costperNight = costperNight;
    this.occupancy = occupancy;
    this.availability = availability;
    this.cleaningStatus = cleaningStatus;
    this.breakfast = breakfast;
    this.area = area;
}
    public String getaccommodationName(){
        return "Accommodation not found";
        }
    public String getaccommodationDescription(){
        return "Accommodation description not found";
        }
    public int getGuests(){
        return guests;
        }
    public int getCost(){
        return costperNight;
        }
    public boolean getOccupancy(){
        return occupancy;
        }
    public boolean getAvailability(){
        return availability;
        }
    public boolean getbreakfast(){
        return breakfast;
        }
    public String getcleaningStatus(){
           return cleaningStatus;
        }
    public int setGuests(int guests){
        return this.guests = guests;
        //Make a loop to limit the amount of guests for each accommodation
        }
    public boolean setOccupancy(boolean occupancy){
        return this.occupancy = occupancy;
        }
    public boolean setAvailability(boolean availability){
        return this.availability = availability;
        }
    //Make a set cleaning status object
    public String setcleaningStatus(String cleaningStatus){
        return this.cleaningStatus = cleaningStatus;
    }
    public boolean setBreakfast(boolean breakfast){
        return this.breakfast = breakfast;
        }
    public class checkIn extends RentalAgreement{
        public checkIn(boolean breakfast, int checkinDate, int numberofGuests, int numberofNights){
            super(breakfast,checkinDate, numberofGuests,numberofNights);
        }
    }
    public String area(){
        return area;
    }
    //Make a check out class to check out the customer from the system
    public static void main(String[] args) {

    }   
}
}
