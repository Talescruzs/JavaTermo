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
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class Versus {
    private Stage stage;
    private Scene scene;
    private Parent root;

    @FXML
    private Button confirm;

    @FXML
    private TextField getText;

    @FXML
    void confirmWord(ActionEvent event) throws IOException{
        FXMLLoader fxmlLoader = new FXMLLoader();
        FileInputStream fileInputStream = new FileInputStream(new File("Views/Game.fxml"));
        root = fxmlLoader.load(fileInputStream);
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();

        Game controller = fxmlLoader.getController();
        controller.setGameWord(event, getText.getText());

        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}