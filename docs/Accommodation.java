package groupproject.accommodationsystem;

public class Accommodation {
  private String accommodationName;
  private String accommodationDescription;
  private Integer guests;
  private int costperNight;
  private boolean occupancy;
  private boolean availability;
  private CleaningStatus.Status cleaningStatus;
  private Boolean breakfast;
  private String area;
    
public Accommodation(String accommodationName, String accommodationDescription, int guests, int costperNight, boolean occupancy,boolean availability,CleaningStatus.Status cleaningStatus,boolean breakfast){
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
    public CleaningStatus.Status getCleaningStatus(){
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
    public void setCleaningStatus(CleaningStatus.Status cleaningStatus) {
    this.cleaningStatus = cleaningStatus;
    System.out.println("Cleaning status updated to: " + this.cleaningStatus);
    }
    public Boolean setBreakfast(boolean breakfast){
        return this.breakfast = breakfast;
        }
    public class checkIn extends RentalAgreement{
        public checkIn(boolean breakfast, int checkinDate, int numberofGuests, int numberofNights){
            super(breakfast,checkinDate, numberofGuests,numberofNights);
        }
    }
   public boolean needsCleaning() {
    return cleaningStatus != CleaningStatus.Status.CLEAN;
    }

    public String area(){
        return area;
    }
    //Make a check out class to check out the customer from the system
    
}
