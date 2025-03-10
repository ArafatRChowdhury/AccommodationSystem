package groupproject.accommodationsystem;

import javafx.beans.property.SimpleStringProperty;

public class AccommodationRow {
    private SimpleStringProperty accommodationNumber;
    private SimpleStringProperty accommodationType;
    private Accommodation accommodation;
    
    public AccommodationRow(String accommodationNumber, 
                              String accommodationType,
                              Accommodation accommodation) {
        this.accommodationNumber = new SimpleStringProperty(accommodationNumber);
        this.accommodationType = new SimpleStringProperty(accommodationType);
        this.accommodation = accommodation;
    }

    public String getAccommodationNumber() {
        return accommodationNumber.get();
    }

    public String getAccommodationType() {
        return accommodationType.get();
    }
    
    public Accommodation getAccommodation() {
        return accommodation;
    }
    
    // Additional getters to support extra table columns
    public String getOccupancy() {
    // e.g., if `accommodation.getOccupancy()` returns a boolean:
    return accommodation.getOccupancy() ? "Occupied" : "Unoccupied";
    }
    
    public String getAvailability() {
    return accommodation.getAvailability() ? "Available" : "Unavailable";
    }
    
    public String getStatus() {
        // Assumes Accommodation has a method getStatus()
        return accommodation.getCleaningStatus().name();
    }
    
    public String getGuest() {
        // Assumes Accommodation has a method getGuest()
        return Integer.toString(accommodation.getGuests());
    }

    
    public String getBreakfast() {
    return accommodation.getBreakfast() ? "Yes" : "No";
    }
}
