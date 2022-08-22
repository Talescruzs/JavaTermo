package Controllers;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import javafx.scene.Node;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Game {
    @FXML
    private Button confirm;
    @FXML
    private TextField insertWord;
    @FXML
    private Label title;
    @FXML
    private Pane wordField;

    private Stage stage;
    private Scene scene;
    private Parent root;
    
    private String gameWord;

    public void game(ActionEvent event, String word) throws IOException {
        String gameWord = word;
        gameWord = word;
        this.gameWord = word;
        System.out.println(this.gameWord);
        System.out.println(gameWord);

        FXMLLoader fxmlLoader = new FXMLLoader();
        FileInputStream fileInputStream = new FileInputStream(new File("Views/Game.fxml"));
        root = fxmlLoader.load(fileInputStream);

        stage = (Stage)((Node)event.getSource()).getScene().getWindow();

        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

        name();
    }

    public void name() {
        System.out.println(gameWord);
        System.out.println(this.gameWord);
    }

    public void confirmWord(ActionEvent event) {
        String tryedWord = insertWord.getText();
        System.out.println(gameWord);
        System.out.println(this.gameWord);


        System.out.println(tryedWord);
        if(tryedWord == this.gameWord){
        System.out.println("Acertou");
        }
    }

}
