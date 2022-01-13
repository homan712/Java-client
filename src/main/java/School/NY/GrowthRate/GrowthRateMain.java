package School.Citytech.GrowthRate;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class GrowthRateMain extends Application {
    public static void main(String[] args) {
        Application.launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        String name  = "GrowthRate.fxml";
        Parent root = FXMLLoader.load(getClass().getClassLoader().getResource(name));
        stage.setScene( new Scene(root));
        stage.setTitle("Growth Rate");
        stage.show();

        stage.setResizable(false);
    }
}
