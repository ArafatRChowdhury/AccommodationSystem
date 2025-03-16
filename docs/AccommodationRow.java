package cedarwoodsaccommodationsystem.model;

import javafx.beans.property.SimpleStringProperty;

public class AccommodationRow {
    private final SimpleStringProperty accommodationNumber;
    private final SimpleStringProperty accommodationType;
    private final SimpleStringProperty customerName;
    private final Accommodation accommodation;

    public AccommodationRow(String accommodationNumber, String accommodationType, String customerName, Accommodation accommodation) {
        this.accommodationNumber = new SimpleStringProperty(accommodationNumber);
        this.accommodationType = new SimpleStringProperty(accommodationType);
        this.customerName = new SimpleStringProperty(customerName);
        this.accommodation = accommodation;
    }

    // Getters for properties
    public String getAccommodationNumber() {
        return accommodationNumber.get();
    }

    public String getAccommodationType() {
        return accommodationType.get();
    }

    public String getCustomerName() {
        return customerName.get();
    }

    public Accommodation getAccommodation() {
        return accommodation;
    }

    public String getOccupancy() {
        return accommodation.getOccupancy() ? "Occupied" : "Unoccupied";
    }

    public String getAvailability() {
        return accommodation.getAvailability() ? "Available" : "Unavailable";
    }

    public String getStatus() {
        return accommodation.getCleaningStatus().name();
    }

    public String getGuests() {
        return Integer.toString(accommodation.getGuests());
    }

    public String getBreakfast() {
        return accommodation.getBreakfast() ? "Yes" : "No";
    }
}
