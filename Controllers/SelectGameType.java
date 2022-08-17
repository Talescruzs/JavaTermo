package Controllers;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;


public class SelectGameType {
    private Stage stage;
    private Scene scene;
    private Parent root;

    @FXML
    private Button bt1;

    @FXML
    private Button bt2;

    @FXML
    private Button bt3;

    @FXML
    void StartHardcoreGame(ActionEvent event) throws IOException{
        
    }

    @FXML
    void StartNormalGame(ActionEvent event) throws IOException{
        
    }

    @FXML
    void StartVersusGame(ActionEvent event) throws IOException{
        FXMLLoader fxmlLoader = new FXMLLoader();
        FileInputStream fileInputStream = new FileInputStream(new File("Views/Versus.fxml"));
        root = fxmlLoader.load(fileInputStream);

        stage = (Stage)((Node)event.getSource()).getScene().getWindow();

        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}
