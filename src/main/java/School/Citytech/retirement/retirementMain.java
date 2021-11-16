package School.Citytech.retirement;

import School.Citytech.LoadScene;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

public class retirementMain extends Application {
    public static void main(String[] args){Application.launch(args);}
    @Override
    public void start(Stage stage) throws Exception{
        new LoadScene().loadPage(stage, "RetirementView.fxml", "Retirement");

    }
}
