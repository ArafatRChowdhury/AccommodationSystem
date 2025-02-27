import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
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
    private TableView<?> AccommodationTable;
    
    private ObservableList<Area> areaData = FXCollections.observableArrayList();

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        CedarWoodsAccommodationSystem cedarWoodsAccommodationSystem = CedarWoodsAccommodationSystem.getInstance();
        ArrayList<Area> zones = cedarWoodsAccommodationSystem.getAreas();
        
        for (int i = 0; i < zones.size(); i++) {
            areaData.add(zones.get(i));
        }
        
        AreaComboBox.setItems(areaData);
        AreaComboBox.setValue(areaData.get(0));
        AreaComboBox.setOnAction(this::AreaComboBoxOnAction);
    }    

    private void AreaComboBoxOnAction(ActionEvent event) {
        Area area = AreaComboBox.getValue();
        
        System.out.println("Area selected: " + area);
        
        AreaDescription.setText(area.getAreaDescription());
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
