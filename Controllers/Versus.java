package Controllers;
import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Versus {
    

    @FXML
    private Label titulo;

    @FXML
    private Button confirm;

    @FXML
    private TextField getText;

    @FXML
    void confirmWord(ActionEvent event) throws IOException{
        new Game().game(event, getText.getText());

        
    }

}