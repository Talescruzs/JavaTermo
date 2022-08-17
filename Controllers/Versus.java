package Controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class Versus {

    @FXML
    private Button confirm;

    @FXML
    private TextField getText;

    @FXML
    void confirmWord(ActionEvent event) {
        System.out.println(getText.getText());
    }

}