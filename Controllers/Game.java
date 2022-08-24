package Controllers;
import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;

public class Game {
    @FXML
    private Button confirm;
    @FXML
    private TextField insertWord;
    @FXML
    private Label title;
    @FXML
    private Pane wordField;

    // private Stage stage;
    // private Scene scene;
    // private Parent root;
    
    private String gameWord;

    public void setGameWord(ActionEvent event, String word) throws IOException {
        this.gameWord = word;
    }

    public void confirmWord(ActionEvent event) {
        String tryedWord = insertWord.getText();
        System.out.println(tryedWord);
        System.out.println(gameWord);

        if(tryedWord.equals(gameWord)){
            System.out.println("Acertou");
        }
    }

}
