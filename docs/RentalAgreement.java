package groupproject.accommodationsystem;
public class RentalAgreement {
   private String customer;
   private boolean breakfast;
   private int checkinDate;
   private int numberofGuests;
   private int numberofNights;
    
public RentalAgreement(boolean breakfast, int checkinDate, int numberofGuests, int numberofNights){
    this.breakfast = breakfast;
    this.checkinDate = checkinDate;
    this.numberofGuests = numberofGuests;
    this.numberofNights = numberofNights;
}    
    public boolean getbreakfast(){
        return breakfast;
        }
    public int getcheckinDate(){
        return checkinDate;
        }
    public int getnumberofGuests(){
        return numberofGuests;
        }
    public int getnumberofNights(){
        return numberofNights;
        }
    public boolean setbreakfast(boolean breakfast){
        return this.breakfast = breakfast;
        }
    public int setcheckinDate(int checkinDate){
        return this.checkinDate = checkinDate;
        }
    public int setnumberofGuests(int numberofGuests){
        return this.numberofGuests = numberofGuests;
        }
    public int setnumberofNights(int numberofNights){
        return this.numberofNights = numberofNights;
        } 
  public static void main(String[] args) {
        } 
}
