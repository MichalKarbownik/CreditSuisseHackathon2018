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

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextArea textAreaOutput;

    @FXML
    private Text inputNumberLabel;

    @FXML
    private TextField inputNumberField;

    @FXML
    private Button betButton;

    @FXML
    private Button randomizeButton;

    @FXML
    void onBetButtonAction(ActionEvent event) {

    }

    @FXML
    void onRandomizeButtonAction(ActionEvent event) {

    }

    @FXML
    void initialize() {
        assert textAreaOutput != null : "fx:id=\"textAreaOutput\" was not injected: check your FXML file 'Prototype.fxml'.";
        assert inputNumberLabel != null : "fx:id=\"inputNumberLabel\" was not injected: check your FXML file 'Prototype.fxml'.";
        assert inputNumberField != null : "fx:id=\"inputNumberField\" was not injected: check your FXML file 'Prototype.fxml'.";
        assert betButton != null : "fx:id=\"betButton\" was not injected: check your FXML file 'Prototype.fxml'.";
        assert randomizeButton != null : "fx:id=\"randomizeButton\" was not injected: check your FXML file 'Prototype.fxml'.";

    }
}
