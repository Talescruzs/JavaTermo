import java.io.File;
import java.io.FileInputStream;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Termo extends Application{
    public static void main(String[] args) throws Exception {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        // System.out.println(getClass().getResource("Views/SelectGameType.fxml"));
        FXMLLoader fxmlLoader = new FXMLLoader();
        FileInputStream fileInputStream = new FileInputStream(new File("Views/SelectGameType.fxml"));
        Parent root = fxmlLoader.load(fileInputStream);
        Scene view = new Scene(root);

        primaryStage.setTitle("Termo");
        primaryStage.setScene(view);
        primaryStage.show();
    }
}