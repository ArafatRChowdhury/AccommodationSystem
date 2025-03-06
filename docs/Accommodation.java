package groupproject.accommodationsystem;

public class Accommodation {
  private String accommodationName;
  private String accommodationDescription;
  private Integer guests;
  private int costperNight;
  private boolean occupancy;
  private boolean availability;
  private String cleaningStatus;
  private Boolean breakfast;
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
    public String getAccommodationName(){
        return accommodationName;
        }
    public String getAccommodationDescription(){
        return accommodationDescription;
        }
    public Integer getGuests(){
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
    public Boolean getBreakfast(){
        return breakfast;
        }
    public String getCleaningStatus(){
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
    public String setCleaningStatus(String cleaningStatus){
        return this.cleaningStatus = cleaningStatus;
    }
    public Boolean setBreakfast(boolean breakfast){
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
    
}
