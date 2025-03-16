package cedarwoodsaccommodationsystem.model;

public class Accommodation {
    private String accommodationName;
    private String accommodationDescription;
    private int guests;
    private int costperNight;
    private boolean occupancy;
    private boolean availability;
    private CleaningStatus.Status cleaningStatus;
    private boolean breakfast;
    private String area;
    private Customer customer;
    private RentalAgreement rentalAgreement;

    public Accommodation(String accommodationName, String accommodationDescription, int guests, int costperNight, boolean occupancy, boolean availability, CleaningStatus.Status cleaningStatus, boolean breakfast) {
        this.accommodationName = accommodationName;
        this.accommodationDescription = accommodationDescription;
        this.guests = guests;
        this.costperNight = costperNight;
        this.occupancy = occupancy;
        this.availability = availability;
        this.cleaningStatus = cleaningStatus;
        this.breakfast = breakfast;
        this.area = ""; // Initialize area to an empty string or pass it as a parameter
        this.customer = null; // Initially, no customer is assigned
        this.rentalAgreement = null; // Initially, no rental agreement is assigned
    }

    // Getters
    public String getAccommodationName() {
        return accommodationName;
    }

    public String getAccommodationDescription() {
        return accommodationDescription;
    }

    public int getGuests() {
        return guests;
    }

    public int getCost() {
        return costperNight;
    }

    public boolean getOccupancy() {
        return occupancy;
    }

    public boolean getAvailability() {
        return availability;
    }

    public boolean getBreakfast() {
        return breakfast;
    }

    public CleaningStatus.Status getCleaningStatus() {
        return cleaningStatus;
    }

    public String getArea() {
        return area;
    }

    public Customer getCustomer() {
        return customer;
    }

    public RentalAgreement getRentalAgreement() {
        return rentalAgreement;
    }

    // Setters
     public int setGuests(int guests){
        if(guests >= 1 && guests <= 4){
            this.guests = guests    ; // update the guests field
        }
        else{
            System.out.println("Invalid number of guests. Must be between 1 and 4.");
        }
        return 0;
     }
    
    public void resetGuests() {
        this.guests = 0;
    }
    
    public void setOccupancy(boolean occupancy) {
        this.occupancy = occupancy;
    }

    public void setAvailability(boolean availability) {
        this.availability = availability;
    }

    public void setCleaningStatus(CleaningStatus.Status cleaningStatus) {
        this.cleaningStatus = cleaningStatus;
        System.out.println("Cleaning status updated to: " + this.cleaningStatus);
    }

    public void setBreakfast(boolean breakfast) {
        this.breakfast = breakfast;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public void setRentalAgreement(RentalAgreement rentalAgreement) {
        this.rentalAgreement = rentalAgreement;
    }

    public void setArea(String area) {
        this.area = area;
    }

    // Additional methods
    public boolean needsCleaning() {
        return cleaningStatus != CleaningStatus.Status.CLEAN;
    }

    @Override
    public String toString() {
        return "Accommodation{" +
                "accommodationName='" + accommodationName + '\'' +
                ", accommodationDescription='" + accommodationDescription + '\'' +
                ", guests=" + guests +
                ", costperNight=" + costperNight +
                ", occupancy=" + occupancy +
                ", availability=" + availability +
                ", cleaningStatus=" + cleaningStatus +
                ", breakfast=" + breakfast +
                ", area='" + area + '\'' +
                ", customer=" + (customer != null ? customer.getFirstName() + " " + customer.getLastName() : "No customer") +
                ", rentalAgreement=" + (rentalAgreement != null ? rentalAgreement.toString() : "No rental agreement") +
                '}';
    }
}
