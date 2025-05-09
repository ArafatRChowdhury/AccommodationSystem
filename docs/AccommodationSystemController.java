package groupproject.accommodationsystem;
        
import groupproject.accommodationsystem.Accommodation;
import groupproject.accommodationsystem.AccommodationRow;
import groupproject.accommodationsystem.Area;
import groupproject.accommodationsystem.CedarWoodsAccommodationSystem;
import groupproject.accommodationsystem.CleaningStatus;
import groupproject.accommodationsystem.Customer;
import groupproject.accommodationsystem.RentalAgreement;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.text.Text;

/**
 * FXML Controller class
 *
 * @author arifa
 */
public class AccommodationSystemController implements Initializable {

    @FXML
    private Label AreaText;
    @FXML
    private ChoiceBox<Area> AreaComboBox;
    @FXML
    private Text AreaDescription;
    @FXML
    private Label BreakfastsNumberText;
    @FXML
    private TextField BreakfastsNumberField;
    @FXML
    private Label CleaningNumberText;
    @FXML
    private TextField CleaningNumberField;
    @FXML
    private Label AccommodationInfoTitle;
    @FXML
    private Label AccomTypeText;
    @FXML
    private TextField AccomTypeField;
    @FXML
    private Label AccomNumText;
    @FXML
    private TextField AccomNumField;
    @FXML
    private Label AccomodatesText;
    @FXML
    private TextField AccomodatesField;
    @FXML
    private Label PricePerNightText;
    @FXML
    private TextField PricePerNightField;
    @FXML
    private Label AccomodationDescription;
    @FXML
    private Label AccommodationReceptionTitle;
    @FXML
    private Label FirstNameText;
    @FXML
    private TextField FirstNameField;
    @FXML
    private Label LastNameText;
    @FXML
    private TextField LastNameField;
    @FXML
    private Label TeleNumText;
    @FXML
    private TextField TeleNumField;
    @FXML
    private Label GuestsText;
    @FXML
    private TextField GuestsField;
    @FXML
    private Label CheckInDateText;
    @FXML
    private TextField CheckInDateField;
    @FXML
    private Label NightsText;
    @FXML
    private TextField NightsField;
    @FXML
    private CheckBox BreakfastsRequired;
    @FXML
    private Button CheckInButton;
    @FXML
    private Button CheckOutButton;
    @FXML
    private TextField txtAccommNumber;
    @FXML
    private TextField txtAccommType;
    @FXML
    private ChoiceBox<CleaningStatus.Status> cleaningStatusChoiceBox;
    @FXML
    private TableView<AccommodationRow> AccommodationTable;
    
    private ObservableList<Area> areaData = FXCollections.observableArrayList();
    
    private final ObservableList<AccommodationRow> tableData = FXCollections.observableArrayList();
    
    

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        CedarWoodsAccommodationSystem cedarWoodsAccommodationSystem = CedarWoodsAccommodationSystem.getInstance();
        ArrayList<Area> zones = cedarWoodsAccommodationSystem.getAreas();
        ObservableList<CleaningStatus.Status> cleaningStatusOptions = FXCollections.observableArrayList(CleaningStatus.Status.values());
        cleaningStatusChoiceBox.setItems(cleaningStatusOptions);
        cleaningStatusChoiceBox.setValue(CleaningStatus.Status.CLEAN); 

        
        for (int i = 0; i < zones.size(); i++) {
            areaData.add(zones.get(i));
        }
        
        AreaComboBox.setItems(areaData);
        AreaComboBox.setValue(areaData.get(0));
        AreaComboBox.setOnAction(this::AreaComboBoxOnAction);
        
        AccommodationTable.setEditable(false);
        
        
        
        TableColumn accommNoCol = new TableColumn("Accomm No");
        accommNoCol.setMinWidth(50);
        
        TableColumn typeCol = new TableColumn("Accomm Type");
        typeCol.setMinWidth(100);

        TableColumn customercol = new TableColumn("Customer Name");
        customercol.setMinWidth(100);
        
        TableColumn OccupanCol = new TableColumn("Occupancy");
        OccupanCol.setMinWidth(100);
        
        TableColumn availableCol = new TableColumn("Availability");
        availableCol.setMinWidth(100);
        
        TableColumn statusCol = new TableColumn("Status");
        statusCol.setMinWidth(100);
        
        TableColumn guestCol = new TableColumn("Guest");
        guestCol.setMinWidth(50);
        
        TableColumn breakfastCol = new TableColumn("Breakfast");
        breakfastCol.setMinWidth(100);
        
        AccommodationTable.getColumns().addAll(accommNoCol, typeCol, customercol, OccupanCol, availableCol, statusCol, guestCol, breakfastCol);

        accommNoCol.setCellValueFactory(new PropertyValueFactory<>("accommodationNumber"));
        typeCol.setCellValueFactory(new PropertyValueFactory<>("accommodationType"));
        customercol.setCellValueFactory(new PropertyValueFactory<>("customerName"));
        OccupanCol.setCellValueFactory(new PropertyValueFactory<>("occupancy"));
        availableCol.setCellValueFactory(new PropertyValueFactory<>("availability"));
        statusCol.setCellValueFactory(new PropertyValueFactory<>("status"));
        guestCol.setCellValueFactory(new PropertyValueFactory<>("guests"));
        breakfastCol.setCellValueFactory(new PropertyValueFactory<>("breakfast"));
       
        // tblRoomDetails.setSelectionModel(SelectionMode.SINGLE);
        AccommodationTable.setItems(tableData);
        
        AccommodationTable.getSelectionModel().selectedItemProperty().addListener((obs, oldSelection, newSelection) -> {
        if (newSelection != null) {
            System.out.println(newSelection.getAccommodationNumber());
            accommodationSelected(newSelection);
        }
        });
    }    
    
    private void accommodationSelected(AccommodationRow selectedAccommodation) {
    // Set the basic accommodation info
    txtAccommNumber.setText(selectedAccommodation.getAccommodationNumber());
    txtAccommType.setText(selectedAccommodation.getAccommodationType());

    // Get the underlying Accommodation object
    Accommodation accommodation = selectedAccommodation.getAccommodation();
    
    // If the accommodation has a customer, populate the check-in fields
    if (accommodation.getCustomer() != null) {
        Customer customer = accommodation.getCustomer();
        FirstNameField.setText(customer.getFirstName());
        LastNameField.setText(customer.getLastName());
        // Assuming your Customer class has a getTelephone() method:
        TeleNumField.setText(customer.getMobileNo());
    } else {
        // Clear fields if there is no customer
        FirstNameField.clear();
        LastNameField.clear();
        TeleNumField.clear();
    }
    
    // If a rental agreement exists, populate check-in date, nights, and guest count
    if (accommodation.getRentalAgreement() != null) {
        RentalAgreement rentalAgreement = accommodation.getRentalAgreement();
        CheckInDateField.setText(String.valueOf(rentalAgreement.getcheckinDate()));
        NightsField.setText(String.valueOf(rentalAgreement.getnumberofNights()));
        GuestsField.setText(String.valueOf(rentalAgreement.getnumberofGuests()));
    } else {
        CheckInDateField.clear();
        NightsField.clear();
        GuestsField.clear();
    }
}
    
private void populateTable(Area area) {
    System.out.println("Populate Table Called");

    tableData.clear();

    ArrayList<Accommodation> accommodations = area.getAccommodations();

    for (Accommodation accommodation : accommodations) {
        AccommodationRow accommodationRow = new AccommodationRow(
            accommodation.getAccommodationName(),
            accommodation.getAccommodationDescription(),
            accommodation.getCustomer() != null ? accommodation.getCustomer().getFirstName() + " " + accommodation.getCustomer().getLastName() : "No customer",
            accommodation
        );

        tableData.add(accommodationRow);
    }

    AccommodationTable.setItems(tableData);
}
    
    private void showAreaStatistics(Area area) {
    int numBreakfasts = area.getNumBreakfasts();
    int numRequireCleaning = area.getNumRequireCleaning();

    // Get the first accommodation type in the area (assuming all accommodations in an area are the same type)
    String accommodationType = "";
    int fixedAccommodates = 0;

    if (!area.getAccommodations().isEmpty()) {
        Accommodation firstAccommodation = area.getAccommodations().get(0);
        accommodationType = firstAccommodation.getAccommodationDescription();

        // Assign fixed guest values based on accommodation type
        switch (accommodationType.toLowerCase()) {
            case "cabin":
                fixedAccommodates = 4;
                break;
            case "geodesic dome":
                fixedAccommodates = 2;
                break;
            case "yurt":
                fixedAccommodates = 2;
                break;
            case "airstream":
                fixedAccommodates = 4;
                break;
            default:
                fixedAccommodates = 0; // Default in case of an unknown type
                break;
        }
    }

    // Set text fields
    BreakfastsNumberField.setText(Integer.toString(numBreakfasts));
    CleaningNumberField.setText(Integer.toString(numRequireCleaning));
    AccomodatesField.setText(Integer.toString(fixedAccommodates)); // Fixed value displayed
}

    
    private void AreaComboBoxOnAction(ActionEvent event) {
    Area area = AreaComboBox.getValue();
    
    System.out.println("Area selected: " + area);
    
    AreaDescription.setText(area.getAreaDescription());
    
    showAreaStatistics(area);
    
    populateTable(area);

    // New: Show Price Per Night
    if (!area.getAccommodations().isEmpty()) {
        int pricePerNight = area.getAccommodations().get(0).getCost(); // Get cost from first accommodation
        PricePerNightField.setText(String.format("£%d", pricePerNight)); // Update price field
    } else {
        PricePerNightField.setText("£N/A"); // If no accommodations exist in the area
    }
    }
    
    
    
    @FXML
    public void BreakfastsCheckBoxOnAction(ActionEvent event) {
    AccommodationRow selectedAccommodation = AccommodationTable.getSelectionModel().getSelectedItem();
    if (selectedAccommodation != null) {
        boolean isBreakfastChecked = BreakfastsRequired.isSelected();
        selectedAccommodation.getAccommodation().setBreakfast(isBreakfastChecked);
        
        // Refresh the table to show the updated value without modifying the count
        AccommodationTable.refresh();
    }
} 
    
    @FXML
    public void CleaningStatusButtonOnAction(ActionEvent event) {
    // Retrieve selected accommodation
    AccommodationRow selectedAccommodation = AccommodationTable.getSelectionModel().getSelectedItem();
    if (selectedAccommodation == null) {
        System.out.println("No accommodation selected.");
        return;
    }
    
    // Get selected cleaning status from the choice box
    CleaningStatus.Status selectedStatus = cleaningStatusChoiceBox.getValue();
    if (selectedStatus == null) {
        System.out.println("No cleaning status selected.");
        return;
    }
    
    // Update accommodation cleaning status
    Accommodation accommodation = selectedAccommodation.getAccommodation();
    System.out.println("Before update: " + accommodation.getCleaningStatus());  // Check current status
    accommodation.setCleaningStatus(selectedStatus);
    System.out.println("After update: " + accommodation.getCleaningStatus());  // Check if it's actually updated

    // Refresh table to show updated status
    AccommodationTable.refresh();
    }


@FXML
private void CheckInOnAction(ActionEvent event) {
    // Get customer information from the UI
    String firstName = FirstNameField.getText();
    String lastName = LastNameField.getText();
    String teleNum = TeleNumField.getText();
    String guests = GuestsField.getText();
    String checkInDate = CheckInDateField.getText();
    String nights = NightsField.getText();

    // Validate inputs
    if (firstName.isEmpty() || lastName.isEmpty() || teleNum.isEmpty() || guests.isEmpty() || checkInDate.isEmpty() || nights.isEmpty()) {
        showAlert("Error", "Please fill in all fields.", Alert.AlertType.ERROR);
        return;
    }

    // Validate teleNum to ensure it contains only digits
    if (!teleNum.matches("\\d+")) {
        showAlert("Error", "Telephone number must contain only digits.", Alert.AlertType.ERROR);
        return;
    }

    // Validate guests and nights to ensure they are valid integers
    int numberOfGuests;
    int numberOfNights;
    try {
        numberOfGuests = Integer.parseInt(guests);
        numberOfNights = Integer.parseInt(nights);
    } catch (NumberFormatException e) {
        showAlert("Error", "Number of guests and nights must be valid integers.", Alert.AlertType.ERROR);
        return;
    }

    // Create a Customer object
    Customer customer = new Customer(firstName, lastName, teleNum);

    // Get the selected accommodation from the table
    AccommodationRow selectedRow = AccommodationTable.getSelectionModel().getSelectedItem();
    if (selectedRow == null) {
        showAlert("Error", "Please select an accommodation.", Alert.AlertType.ERROR);
        return;
    }

    // Parse numeric fields
    boolean breakfastRequired = BreakfastsRequired.isSelected();

    // Create a RentalAgreement object
    RentalAgreement rentalAgreement = new RentalAgreement(customer, breakfastRequired, Integer.parseInt(checkInDate), numberOfGuests, numberOfNights);

    // Assign the customer and rental agreement to the selected accommodation
    Accommodation selectedAccommodation = selectedRow.getAccommodation();
    selectedAccommodation.setCustomer(customer);
    selectedAccommodation.setRentalAgreement(rentalAgreement);
    // update the occupancy status
    selectedAccommodation.setOccupancy(true);
    // update the availiablitly
    selectedAccommodation.setAvailability(false);
    selectedAccommodation.setGuests(numberOfGuests);
    

    // Update the table to reflect the changes
    populateTable(AreaComboBox.getValue());

    // Show success message
    showAlert("Success", "Check-in completed successfully.", Alert.AlertType.INFORMATION);
}

private void showAlert(String title, String message, Alert.AlertType alertType) {
    Alert alert = new Alert(alertType);
    alert.setTitle(title);
    alert.setHeaderText(null);
    alert.setContentText(message);
    alert.showAndWait();
}


    @FXML
    private void CheckOutOnAction(ActionEvent event) {
    // Get the selected accommodation from the table
    AccommodationRow selectedRow = AccommodationTable.getSelectionModel().getSelectedItem();
    if (selectedRow == null) {
        showAlert("Error", "Please select an accommodation to check out.", Alert.AlertType.ERROR);
        return;
    }

    Accommodation selectedAccommodation = selectedRow.getAccommodation();

    // Reset everything to default
    selectedAccommodation.setCustomer(null);                
    selectedAccommodation.setRentalAgreement(null);         
    selectedAccommodation.setOccupancy(false);              
    selectedAccommodation.setAvailability(true);           
    selectedAccommodation.resetGuests();                    
    selectedAccommodation.setBreakfast(false);            
    selectedAccommodation.setCleaningStatus(CleaningStatus.Status.DIRTY); 

    populateTable(AreaComboBox.getValue());

    FirstNameField.clear();
    LastNameField.clear();
    TeleNumField.clear();
    GuestsField.clear();
    CheckInDateField.clear();
    NightsField.clear();
    BreakfastsRequired.setSelected(false);

    showAlert("Success", "Check-out completed successfully.", Alert.AlertType.INFORMATION);
}
    
}
