import java.net.URL;
import java.util.ResourceBundle;
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
    private ChoiceBox<?> AreaComboBox;
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

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
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
