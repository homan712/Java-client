package School.Citytech;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.util.Date;


public class LoadScene {
    final public void loadPage(Stage stage, String name, String title){
        try {
            Parent root = FXMLLoader.load(getClass().getClassLoader().getResource(name));
            stage.setTitle(title);
            stage.setScene( new Scene(root));
            stage.show();
            System.out.println("date: " + new Date());

        }catch(Exception ex){
            ex.printStackTrace();
        }
    }

    final public void loadPage(Stage stage, String name){
        this.loadPage(stage, name, "");
    }
}
