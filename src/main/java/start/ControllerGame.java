package start;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;

public class ControllerGame {

    private Model model = new Model();

    @FXML
    private TextArea History;

    @FXML
    private TextArea Map;

    @FXML
    void handleMoveDown(ActionEvent event) {

    }

    @FXML
    void handleMoveH2(ActionEvent event) {

    }

    @FXML
    void handleMoveH3(ActionEvent event) {

    }

    @FXML
    void handleMoveLeft(ActionEvent event) {

    }

    @FXML
    void handleMoveRight(ActionEvent event) {

    }

    @FXML
    void handleMoveS1(ActionEvent event) {

    }

    @FXML
    void handleMoveS2(ActionEvent event) {

    }

    @FXML
    void handleMoveS3(ActionEvent event) {

    }

    @FXML
    void handleMoveUH1(ActionEvent event) {

    }

    @FXML
    void handleMoveUp(ActionEvent event) {
        Map.setText(model.moverse());

    }

}