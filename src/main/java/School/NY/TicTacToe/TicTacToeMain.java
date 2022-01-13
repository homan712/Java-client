package School.Citytech.TicTacToe;
import School.Citytech.LoadScene;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


    public class TicTacToeMain extends Application {

        public static void main(String[] args) {
            Application.launch(args);
        }

        @Override
        public void start(Stage stage) throws Exception {


            new LoadScene().loadPage(stage, "TicTacToeView.fxml", "TicTacToe");
        }
    }



