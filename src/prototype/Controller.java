/**
 * Sample Skeleton for 'Prototype.fxml' Controller Class
 */

package prototype;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

public class Controller {

    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML // fx:id="textAreaOutput"
    private TextArea textAreaOutput; // Value injected by FXMLLoader

    @FXML // fx:id="inputNumberLabel"
    private Text inputNumberLabel; // Value injected by FXMLLoader

    @FXML // fx:id="inputNumberField"
    private TextField inputNumberField; // Value injected by FXMLLoader

    @FXML // fx:id="betButton"
    private Button betButton; // Value injected by FXMLLoader

    @FXML // fx:id="randomizeButton"
    private Button randomizeButton; // Value injected by FXMLLoader

    @FXML
    void onBetButtonAction(ActionEvent event) {

    }

    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
        assert textAreaOutput != null : "fx:id=\"textAreaOutput\" was not injected: check your FXML file 'Prototype.fxml'.";
        assert inputNumberLabel != null : "fx:id=\"inputNumberLabel\" was not injected: check your FXML file 'Prototype.fxml'.";
        assert inputNumberField != null : "fx:id=\"inputNumberField\" was not injected: check your FXML file 'Prototype.fxml'.";
        assert betButton != null : "fx:id=\"betButton\" was not injected: check your FXML file 'Prototype.fxml'.";
        assert randomizeButton != null : "fx:id=\"randomizeButton\" was not injected: check your FXML file 'Prototype.fxml'.";

    }
}
