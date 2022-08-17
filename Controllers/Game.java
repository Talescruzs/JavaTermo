package Controllers;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;

public class Game {
    private String gameWord;

    public void game(String word) {
        gameWord = word;
    }

    @FXML
    private Button confirm;

    @FXML
    private TextField insertWord;

    @FXML
    private Label title;

    @FXML
    private Pane wordField;

    @FXML
    void confirmWord(ActionEvent event) {
        System.out.println(gameWord);
    }

}
