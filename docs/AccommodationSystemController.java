/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package groupproject.accommodationsystem;

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
    
    private ObservableList<AccommodationRow> tableData = FXCollections.observableArrayList();
    
    

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
        
        AccommodationTable.getColumns().addAll(accommNoCol, typeCol, OccupanCol, availableCol, statusCol, guestCol, breakfastCol);
        
        accommNoCol.setCellValueFactory(new PropertyValueFactory<AccommodationRow, String>("accommodationNumber"));
        typeCol.setCellValueFactory(new PropertyValueFactory<AccommodationRow, String>("accommodationType"));
        OccupanCol.setCellValueFactory(new PropertyValueFactory<>("occupancy"));
        availableCol.setCellValueFactory(new PropertyValueFactory<>("availability"));
        statusCol.setCellValueFactory(new PropertyValueFactory<>("status"));
        guestCol.setCellValueFactory(new PropertyValueFactory<>("guest"));
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
    // Example: Print selected accommodation details
    System.out.println("Selected Accommodation Number: " + selectedAccommodation.getAccommodationNumber());
    System.out.println("Selected Accommodation Type: " + selectedAccommodation.getAccommodationType());

    // Example: Update text fields with selected accommodation info
    txtAccommNumber.setText(selectedAccommodation.getAccommodationNumber());
    txtAccommType.setText(selectedAccommodation.getAccommodationType());
}
    
    private void populateTable(Area area)
    {
        System.out.println("Populate Table Called");
        
        tableData.clear();
        
        ArrayList<Accommodation> accommodations = area.getAccommodations();

        for (Accommodation accommodation : accommodations) 
        {
            AccommodationRow accommodationRow = new AccommodationRow(accommodation.getAccommodationName(),
                                                                     accommodation.getAccommodationDescription(),
                                                                     accommodation);

            tableData.add(accommodationRow);
        }

        AccommodationTable.setItems(tableData);
    }
    
    private void showAreaStatistics(Area area)
    {
        // TODO: Implement these methods
        int numBreakfasts = area.getNumBreakfasts();
        int numRequireCleaning = area.getNumRequireCleaning();
        
        
        // Set the text fields to display the values
        BreakfastsNumberField.setText(Integer.toString(numBreakfasts));
        CleaningNumberField.setText(Integer.toString(numRequireCleaning)); 
        
    }
    
    private void AreaComboBoxOnAction(ActionEvent event) {
        Area area = AreaComboBox.getValue();
        
        System.out.println("Area selected: " + area);
        
        AreaDescription.setText(area.getAreaDescription());
        
        showAreaStatistics(area);
        
        populateTable(area);
    }
    
    @FXML
    private void BreakfastsCheckBoxOnAction(ActionEvent event) {
    }

    @FXML
    private void CheckInOnAction(ActionEvent event) {
    }

    @FXML
    private void CheckOutOnAction(ActionEvent event) {
    }
    
}
