package groupproject.accommodationsystem;

import java.io.IOException;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.VBox;




public class CedarWoodsAccommodationGUI extends Application {
       
    @Override
    public void start(Stage primaryStage)
            throws IOException
    {
        // Parent root = FXMLLoader.load(getClass().getResource("FXMLLogin.fxml"));
        FXMLLoader loader = new FXMLLoader(getClass().getResource("AccommodationSystem.fxml"));
        
        //Scene scene = new Scene(button, 200, 100);
        primaryStage.setTitle("Cedar Woods Accommodation System");
        Scene cedarWoodsAccommodationSystemScene = new Scene(loader.load());
        
        // FXMLGlampingSystemController controller = loader.getController();
        // controller.setUWEAccommodationSystemGUI(uweAccommodationSystemGUI);
        primaryStage.setScene(cedarWoodsAccommodationSystemScene);
        primaryStage.show(); 
    }
    
    public static void main(String[] args) {
        launch(args);
    }
    
}
